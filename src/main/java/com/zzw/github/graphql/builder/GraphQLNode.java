package com.zzw.github.graphql.builder;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by zzw on 2018/4/8.
 */
public class GraphQLNode implements Comparable<GraphQLNode> {
    private String nodeName;
    private Class nodeType;
    private boolean isFragment;

    private GraphQLNode parent;
    private Set<GraphQLNode> children = new LinkedHashSet<GraphQLNode>();
    private Set<GraphQLArgument> arguments = new LinkedHashSet<GraphQLArgument>();

    private Map<String, Object> tags = new HashMap<String, Object>();

    public static GraphQLNode asNode(String nodeName) {
        GraphQLNode node = new GraphQLNode();
        node.nodeName = nodeName;
        node.isFragment = false;
        return node;
    }

    public static GraphQLNode asFragment(Class nodeType) {
        GraphQLNode node = new GraphQLNode();
        node.nodeType = nodeType;
        node.isFragment = true;
        return node;
    }

    private GraphQLNode() {}

    public String getNodeName() {
        if (isFragment) {
            return "";
        } else {
            return nodeName;
        }
    }

    public String getNodeType() {
        if (nodeType == null) {
            return "";
        }

        if (isFragment) {
            if (nodeType.isArray()) {
                String type = nodeType.getComponentType().getSimpleName();
                type = "[" + type + "]";
                return type;
            } else {
                String type = nodeType.getSimpleName();
                return type;
            }
        } else {
            return "";
        }
    }

    public boolean isFragment() {
        return isFragment;
    }

    public GraphQLNode getParent() {
        return parent;
    }

    public Set<GraphQLNode> getChildren() {
        return children;
    }

    public Set<GraphQLArgument> getArguments() {
        return arguments;
    }

    public Map<String, Object> getTags() { return tags; }

    public GraphQLNode getNode(Object identifier) {
        if ((identifier == null) || children.isEmpty()) {
            return null;
        }

        if (identifier instanceof String) {
            String name = (String) identifier;
            for (GraphQLNode node : children) {
                if ((!node.isFragment) && (node.nodeName.equals(name))) {
                    return node;
                }
            }
        } else if (identifier instanceof Class) {
            Class type = (Class) identifier;
            for (GraphQLNode node : children) {
                if ((node.isFragment) && (node.nodeType != null) && (node.nodeType.getName().equals(type.getName()))) {
                    return node;
                }
            }
        }
        return null;
    }

    public GraphQLNode addNode(GraphQLNode node) {
        if (node != null) {
            node.parent = this;
            children.add(node);
        }
        return this;
    }

    public boolean removeNode(GraphQLNode node) {
        return children.remove(node);
    }

    public GraphQLArgument getArgument(String argName) {
        if ((argName == null) || arguments.isEmpty()) {
            return null;
        }

        for (GraphQLArgument argument : arguments) {
            String argName1 = argument.getArgName();
            if ((argName1 != null) && argName1.equals(argName)) {
                return argument;
            }
        }
        return null;
    }

    public GraphQLArgument getVariable(String varName) {
        if ((varName == null) || arguments.isEmpty()) {
            return null;
        }

        if (varName.startsWith("$")) {
            varName = varName.substring(1);
        }

        for (GraphQLArgument argument : arguments) {
            String varName1 = argument.getVarName();
            if ((varName1 != null) && (varName1.equals(varName))) {
                return argument;
            }
        }
        return null;
    }

    public GraphQLNode addArgument(GraphQLArgument argument) {
        if (argument != null) {
            GraphQLArgument newArgument = argument.clone();
            newArgument.setNode(this);
            arguments.add(newArgument);
        }
        return this;
    }

    public boolean removeArgument(GraphQLArgument argument) {
        return arguments.remove(argument);
    }

    public Object getTag(String key) {
        if (key != null) {
            return tags.get(key);
        } else {
            return null;
        }
    }

    public Object addTag(String key, Object value) {
        if ((key != null) && (value != null)) {
            return tags.put(key, value);
        } else {
            return null;
        }
    }

    public Object removeTag(String key) {
        if (key != null) {
            return tags.remove(key);
        } else {
            return null;
        }
    }

    @Override
    public GraphQLNode clone() {
        GraphQLNode newNode = new GraphQLNode();
        newNode.nodeName = this.nodeName;
        newNode.nodeType = this.nodeType;
        newNode.isFragment = this.isFragment;

        // deep copy
        newNode.parent = this.parent;

        if ((this.children != null) && (this.children.size() > 0)) {
            for (GraphQLNode child : this.children) {
                GraphQLNode newChildNode = child.clone();
                newNode.addNode(newChildNode);
            }
        }

        if ((this.arguments != null) && (this.arguments.size() > 0)) {
            for (GraphQLArgument argument : arguments) {
                GraphQLArgument newArgument = argument.clone();
                newNode.addArgument(newArgument);
            }
        }

        if ((this.tags != null) && (this.tags.size() > 0)) {
            for (Map.Entry<String, Object> entry : tags.entrySet()) {
                newNode.addTag(entry.getKey(), entry.getValue());
            }
        }

        return newNode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof GraphQLNode)) {
            return false;
        }

        if ((this.isFragment) && (((GraphQLNode) obj).isFragment)) {
            return (this.nodeType.getName().compareTo(((GraphQLNode) obj).nodeType.getName()) == 0);
        }

        if ((!this.isFragment) && (!((GraphQLNode) obj).isFragment)) {
            return (this.nodeName.compareTo(((GraphQLNode) obj).nodeName) == 0);
        }

        return false;
    }

    public int compareTo(GraphQLNode o) {
        return (equals(o) ? 0 : -1);
    }
}
