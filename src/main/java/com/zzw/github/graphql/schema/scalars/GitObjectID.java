package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A Git object ID.")
public class GitObjectID {
    private java.lang.String value;
    public GitObjectID(java.lang.String value) { this.value = value; }
    public java.lang.String getValue() { return value; }
    public void setValue(java.lang.String value) { this.value = value; }
    @Override
    public java.lang.String toString() { return value; }
}
