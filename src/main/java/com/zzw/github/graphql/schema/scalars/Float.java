package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents signed double-precision fractional values as specified by .")
public class Float {
    private double value;
    public Float(double value) { this.value = value; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
    @Override
    public java.lang.String toString() { return java.lang.String.valueOf(value); }
}
