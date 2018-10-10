package com.zzw.github.graphql.schema.mutations;

public class MutationEntry {
    private Mutation data;
    private com.zzw.github.graphql.schema.Error[] errors;
    private String documentation_url;
    private String message;

    public Mutation getData() { return data; }
    public void setData(Mutation data) { this.data = data; }

    public com.zzw.github.graphql.schema.Error[] getErrors() { return errors; }
    public void setErrors(com.zzw.github.graphql.schema.Error[] errors) { this.errors = errors; }

    public String getDocumentation_url() { return documentation_url; }
    public void setDocumentation_url(String documentation_url) { this.documentation_url = documentation_url; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
