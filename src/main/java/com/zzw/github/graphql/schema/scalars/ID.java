package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a unique identifier that is Base64 obfuscated. It is often used to refetch an object or as key for a cache. The ID type appears in a JSON response as a String; however, it is not intended to be human-readable. When expected as an input type, any string (such as ) or integer (such as ) input value will be accepted as an ID.")
public class ID {
    private java.lang.String value;
    public ID(java.lang.String value) { this.value = value; }
    public java.lang.String getValue() { return value; }
    public void setValue(java.lang.String value) { this.value = value; }
    @Override
    public java.lang.String toString() { return value; }
}
