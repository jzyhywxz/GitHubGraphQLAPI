package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Possible directions in which to order a list of items when provided an  argument.")
public enum OrderDirection {
    @Description("Specifies an ascending order for a given  argument.")
     ASC,
    @Description("Specifies a descending order for a given  argument.")
     DESC,
}
