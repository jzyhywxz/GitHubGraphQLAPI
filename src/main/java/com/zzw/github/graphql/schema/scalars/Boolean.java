package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents  or  values.")
public class Boolean {
    private boolean value;
    public Boolean(boolean value) { this.value = value; }
    public boolean getValue() { return value; }
    public void setValue(boolean value) { this.value = value; }
    @Override
    public java.lang.String toString() { return java.lang.String.valueOf(value); }
}
