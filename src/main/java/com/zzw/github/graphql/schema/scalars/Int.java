package com.zzw.github.graphql.schema.scalars;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents non-fractional signed whole numeric values. Int can represent values between -(2^31) and 2^31 - 1.")
public class Int {
    private int value;
    public Int(int value) { this.value = value; }
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    @Override
    public java.lang.String toString() { return java.lang.String.valueOf(value); }
}
