package com.zzw.github.graphql.schema.mutations;

public class MutationEntry {
    private Mutation data;
    private com.zzw.github.graphql.schema.Error[] errors;

    public Mutation getData() { return data; }
    public void setData(Mutation data) { this.data = data; }

    public com.zzw.github.graphql.schema.Error[] getErrors() { return errors; }
    public void setErrors(com.zzw.github.graphql.schema.Error[] errors) { this.errors = errors; }
}
