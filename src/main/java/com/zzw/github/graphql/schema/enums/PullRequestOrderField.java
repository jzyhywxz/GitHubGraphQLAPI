package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which pull_requests connections can be ordered.")
public enum PullRequestOrderField {
    @Description("Order pull_requests by creation time")
    CREATED_AT,
    @Description("Order pull_requests by update time")
    UPDATED_AT,
}
