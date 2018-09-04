package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A string containing HTML code.")
public class HTML {
    private java.lang.String value;
    public HTML(java.lang.String value) { this.value = value; }
    public java.lang.String getValue() { return value; }
    public void setValue(java.lang.String value) { this.value = value; }
    @Override
    public java.lang.String toString() { return value; }
}
