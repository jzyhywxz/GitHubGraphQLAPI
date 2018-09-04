package com.zzw.github.graphql.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zzw on 2018/4/8.
 */
public class GraphQLArgument<T> implements Comparable<GraphQLArgument> {
    public static final int NONNULL_OUTER_ONLY = 1;
    private static final int NONNULL_OUTER_ONLY_MASK = 0x00000001;
    public static final int NONNULL_INNER_ONLY = 2;
    private static final int NONNULL_INNER_ONLY_MASK = 0x00000002;

    private String argName;
    private T argValue;
    private Class<T> argType;
    private String varName;
    private int nonNull;
    private GraphQLNode node;

    private boolean isVariable;

    private Map<String, Object> tags = new HashMap<String, Object>();

    public static <E> GraphQLArgument<E> asArgument(String argName, E argValue, Class<E> argType) {
        GraphQLArgument<E> argument = new GraphQLArgument<E>(argName, argValue, argType);
        argument.isVariable = false;
        return argument;
    }

    public static <E> GraphQLArgument<E> asVariable(String argName, E argValue, Class<E> argType, String varName, int nonNull) {
        GraphQLArgument<E> variable = new GraphQLArgument<E>(argName, argValue, argType);
        variable.varName = varName;
        variable.nonNull = nonNull;
        variable.isVariable = true;
        return variable;
    }

    private GraphQLArgument(String argName, T argValue, Class<T> argType) {
        this.argName = argName;
        this.argValue = argValue;
        this.argType = argType;
    }

    public String getArgName() {
        return argName;
    }

    public T getArgValue() {
        return argValue;
    }

    public Class<T> getArgType() {
        return argType;
    }

    public String getVarName() {
        if (!isVariable) {
            return "";
        } else {
            return varName;
        }
    }

    public String getArgTypeName() {
        if (!isVariable) {
            return "";
        }

        if (argType.isArray()) {
            String type = argType.getComponentType().getSimpleName();
            if (isNonNullInnerOnlyEnable()) {
                type = type + "!";
            }
            type = "[" + type + "]";
            if (isNonNullOuterOnlyEnable()) {
                type = type + "!";
            }
            return type;
        } else {
            String type = argType.getSimpleName();
            if (isNonNullOuterOnlyEnable()) {
                type = type + "!";
            }
            return type;
        }
    }

    public void setNode(GraphQLNode node) { this.node = node; }

    public void setArgValue(T value) { this.argValue = value; }

    public void setVarName(String varName, int nonNull) {
        this.varName = varName;
        this.nonNull = nonNull;
        this.isVariable = (this.varName != null);
    }

    public GraphQLNode getNode() { return node; }

    public boolean isVariable() {
        return isVariable;
    }

    public Map<String, Object> getTags() { return tags; }

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

    private boolean isNonNullOuterOnlyEnable() {
        return ((NONNULL_OUTER_ONLY_MASK & nonNull) != 0);
    }

    private boolean isNonNullInnerOnlyEnable() {
        return ((NONNULL_INNER_ONLY_MASK & nonNull) != 0);
    }

    @Override
    public GraphQLArgument<T> clone() {
        GraphQLArgument<T> newArgument = new GraphQLArgument<T>(this.argName, this.argValue, this.argType);
        newArgument.varName = this.varName;
        newArgument.nonNull = this.nonNull;
        newArgument.node = this.node;
        newArgument.isVariable = this.isVariable;

        if ((this.tags != null) && (this.tags.size() > 0)) {
            for (Map.Entry<String, Object> entry : tags.entrySet()) {
                newArgument.addTag(entry.getKey(), entry.getValue());
            }
        }

        return newArgument;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof GraphQLArgument)) {
            return false;
        }

        if ((this.isVariable) && (((GraphQLArgument) obj).isVariable)) {
            return (this.varName.compareTo(((GraphQLArgument) obj).varName) == 0);
        }

        if ((!this.isVariable) && (!((GraphQLArgument) obj).isVariable)) {
            return (this.argName.compareTo(((GraphQLArgument) obj).argName) == 0);
        }

        return false;
    }

    public int compareTo(GraphQLArgument o) {
        return (equals(o) ? 0 : -1);
    }
}
