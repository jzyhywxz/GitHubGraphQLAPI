package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Whether or not a PullRequest can be merged.")
public enum MergeableState {
    @Description("The pull request cannot be merged due to merge conflicts.")
    CONFLICTING,
    @Description("The pull request can be merged.")
    MERGEABLE,
    @Description("The mergeability of the pull request is still being calculated.")
    UNKNOWN,
}
