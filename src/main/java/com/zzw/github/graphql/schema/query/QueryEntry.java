package com.zzw.github.graphql.schema.query;

public class QueryEntry {
    private Query data;
    private com.zzw.github.graphql.schema.Error[] errors;

    public Query getData() { return data; }
    public void setData(Query data) { this.data = data; }

    public com.zzw.github.graphql.schema.Error[] getErrors() { return errors; }
    public void setErrors(com.zzw.github.graphql.schema.Error[] errors) { this.errors = errors; }
}
