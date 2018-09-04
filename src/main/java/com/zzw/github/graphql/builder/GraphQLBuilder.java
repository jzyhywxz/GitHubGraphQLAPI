package com.zzw.github.graphql.builder;

import com.zzw.github.graphql.spider.GitHubGraphQLParser;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by zzw on 2018/4/8.
 */
public class GraphQLBuilder {
    private static final String SCALAR_PREFIX = GitHubGraphQLParser.PACKAGE_PREFIX + "scalars.";

    private GraphQLNode mRootNode;
    private Set<GraphQLArgument> mVariables;

    public void prepare(GraphQLNode node) {
        mRootNode = findRootNode(node);
        mVariables = findVariables(mRootNode);
    }

    public String visualize() {
        StringBuilder builder = new StringBuilder();

        builder.append('{');

        String mainBody = buildMainBody();
        builder.append("\"query\":").append('"').append(mainBody).append('"');

        builder.append(',');

        String variableBody = buildVariableBody();
        builder.append("\"variables\":").append('"').append(variableBody).append('"');

        builder.append('}');

        return builder.toString();
    }

    public String serialize() {
        StringBuilder builder = new StringBuilder();
        Pattern quotePattern = Pattern.compile("\"");
        Pattern newlinePattern = Pattern.compile("\\n");

        builder.append('{');

        String mainBody = buildMainBody();
        mainBody = quotePattern.matcher(mainBody).replaceAll("\\\\\\\"");
        mainBody = newlinePattern.matcher(mainBody).replaceAll("\\\\n");
        builder.append("\"query\":").append('"').append(mainBody).append('"');

        builder.append(',');

        String variableBody = buildVariableBody();
        variableBody = quotePattern.matcher(variableBody).replaceAll("\\\\\\\"");
        variableBody = newlinePattern.matcher(variableBody).replaceAll("\\\\n");
        builder.append("\"variables\":").append('"').append(variableBody).append('"');

        builder.append('}');

        return builder.toString();
    }

    private GraphQLNode findRootNode(GraphQLNode node) {
        if (node == null) {
            return node;
        }

        GraphQLNode rootNode = node;
        while (rootNode.getParent() != null) {
            rootNode = rootNode.getParent();
        }
        return rootNode;
    }

    private Set<GraphQLArgument> findVariables(GraphQLNode node) {
        Set<GraphQLArgument> variables = new LinkedHashSet<GraphQLArgument>();

        if (node == null) {
            return variables;
        }

        List<GraphQLNode> queue = new LinkedList<GraphQLNode>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphQLNode firstNode = queue.remove(0);

            Set<GraphQLArgument> arguments = firstNode.getArguments();
            if ((arguments != null) && (arguments.size() > 0)) {
                for (GraphQLArgument argument : arguments) {
                    if (argument.isVariable()) {
                        variables.add(argument);
                    }
                }
            }

            Set<GraphQLNode> children = firstNode.getChildren();
            if ((children != null) && (children.size() > 0)) {
                queue.addAll(children);
            }
        }

        return variables;
    }

    private String buildMainBody() {
        StringBuilder builder = new StringBuilder();

        // node name
        builder.append(mRootNode.getNodeName());

        // variable
        builder.append(buildVariableDeclaration(mVariables));

        // field
        Set<GraphQLNode> children = mRootNode.getChildren();
        if ((children != null) && (children.size() > 0)) {
            builder.append("{\n");
            for (GraphQLNode child : children) {
                buildMainBody(builder, child, 2);
                builder.append('\n');
            }
            builder.append('}');
        }

        return builder.toString();
    }

    private String buildVariableBody() {
        StringBuilder builder = new StringBuilder();

        builder.append('{');
        if ((mVariables != null) && (mVariables.size() > 0)) {
            builder.append('\n');
            int i = 0;
            for (GraphQLArgument variable : mVariables) {
                builder.append(buildVariable(variable, 2));
                if (i < mVariables.size() - 1) {
                    builder.append(',');
                }
                builder.append('\n');
                ++i;
            }
        }
        builder.append('}');

        return builder.toString();
    }

    private String buildVariableDeclaration(Set<GraphQLArgument> variables) {
        StringBuilder builder = new StringBuilder();

        if ((variables != null) && (variables.size() > 0)) {
            builder.append('(');
            int i = 0;
            for (GraphQLArgument variable : variables) {
                builder.append('$').append(variable.getVarName()).append(':').append(variable.getArgTypeName());
                if (i < variables.size() - 1) {
                    builder.append(',');
                }
                ++i;
            }
            builder.append(')');
        }

        return builder.toString();
    }

    private void buildMainBody(StringBuilder builder, GraphQLNode node, int indent) {
        // indent
        builder.append(buildIndent(indent));

        // node name
        if (node.isFragment()) {
            builder.append("... on ").append(node.getNodeType());
        } else {
            builder.append(node.getNodeName());
        }

        // argument
        Set<GraphQLArgument> arguments = node.getArguments();
        if ((arguments != null) && (arguments.size() > 0)) {
            builder.append('(');
            int i = 0;
            for (GraphQLArgument argument : arguments) {
                builder.append(buildArgument(argument, indent));
                if (i < arguments.size() - 1) {
                    builder.append(',');
                }
                ++i;
            }
            builder.append(')');
        }

        // field
        Set<GraphQLNode> children = node.getChildren();
        if ((children != null) && (children.size() > 0)) {
            builder.append("{\n");
            for (GraphQLNode child : children) {
                buildMainBody(builder, child, indent + 2);
                builder.append('\n');
            }
            builder.append(buildIndent(indent)).append('}');
        }
    }

    private String buildArgument(GraphQLArgument argument, int indent) {
        StringBuilder builder = new StringBuilder();

        if (argument.isVariable()) {
            builder.append(argument.getArgName()).append(":$").append(argument.getVarName());
        } else {
            builder.append(argument.getArgName()).append(":");
            buildValue(builder, argument.getArgValue(), argument.getArgType(), false, indent);
        }

        return builder.toString();
    }

    private String buildVariable(GraphQLArgument variable, int indent) {
        StringBuilder builder = new StringBuilder();

        builder.append("  \"").append(variable.getVarName()).append("\":");
        buildValue(builder, variable.getArgValue(), variable.getArgType(), true, indent);

        return builder.toString();
    }

    private void buildValue(StringBuilder builder, Object value, Class type, boolean isPickOut, int indent) {
        if (value == null) {
            builder.append("null");
            return;
        }

        if (type == null) {
            builder.append(value);
            return;
        }

        if (type.isArray()) {
            builder.append('[');
            int length = Array.getLength(value);
            if (length > 0) {
                builder.append(isPickOut ? "\n" : "");
                Class componentType = type.getComponentType();
                for (int i = 0; i < length; i++) {
                    builder.append(isPickOut ? buildIndent(indent + 2) : "");
                    buildValue(builder, Array.get(value, i), componentType, isPickOut, indent + 2);
                    if (i < length - 1) {
                        builder.append(',');
                    }
                    builder.append(isPickOut ? "\n" : "");
                }
                builder.append(isPickOut ? buildIndent(indent) : "");
            }
            builder.append(']');
        } else if (type.isEnum()) {
            if (isPickOut) {
                builder.append('"').append(value).append('"');
            } else {
                builder.append(value);
            }
        } else {
            String typeName = type.getName();

            if (typeName.startsWith(SCALAR_PREFIX)) {
                if ((type != com.zzw.github.graphql.schema.scalars.Boolean.class) &&
                        (type != com.zzw.github.graphql.schema.scalars.Float.class) &&
                        (type != com.zzw.github.graphql.schema.scalars.Int.class)) {
                    builder.append('"').append(value).append('"');
                } else {
                    builder.append(value);
                }
            } else {
                builder.append('{');
                Field[] fields = type.getDeclaredFields();
                if ((fields != null) && (fields.length > 0)) {
                    builder.append(isPickOut ? "\n" : "");
                    for (int i = 0; i < fields.length; i++) {
                        Field field = fields[i];
                        field.setAccessible(true);

                        builder.append(isPickOut ? buildIndent(indent + 2) : "");
                        if (isPickOut) {
                            builder.append('"').append(field.getName()).append('"');
                        } else {
                            builder.append(field.getName());
                        }
                        builder.append(':');
                        try {
                            buildValue(builder, field.get(value), field.getType(), isPickOut, indent + 2);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        if (i < fields.length - 1) {
                            builder.append(',');
                        }
                        builder.append(isPickOut ? "\n" : "");
                    }
                    builder.append(isPickOut ? buildIndent(indent) : "");
                }
                builder.append('}');
            }
        }
    }

    private String buildIndent(int indent) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append(' ');
        }
        return builder.toString();
    }
}
