package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An ISO-8601 encoded date string. Unlike the DateTime type, GitTimestamp is not converted in UTC.")
public class GitTimestamp {
    private java.lang.String value;
    public GitTimestamp(java.lang.String value) { this.value = value; }
    public java.lang.String getValue() { return value; }
    public void setValue(java.lang.String value) { this.value = value; }
    @Override
    public java.lang.String toString() { return value; }
}
