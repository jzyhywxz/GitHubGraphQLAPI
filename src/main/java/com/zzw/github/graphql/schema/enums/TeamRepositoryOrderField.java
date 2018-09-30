package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which team repository connections can be ordered.")
public enum TeamRepositoryOrderField {
    @Description("Order repositories by creation time")
    CREATED_AT,
    @Description("Order repositories by name")
    NAME,
    @Description("Order repositories by permission")
    PERMISSION,
    @Description("Order repositories by push time")
    PUSHED_AT,
    @Description("Order repositories by number of stargazers")
    STARGAZERS,
    @Description("Order repositories by update time")
    UPDATED_AT,
}
