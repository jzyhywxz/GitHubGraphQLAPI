package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which release connections can be ordered.")
public enum ReleaseOrderField {
    @Description("Order releases by creation time")
     CREATED_AT,
    @Description("Order releases alphabetically by name")
     NAME,
}
