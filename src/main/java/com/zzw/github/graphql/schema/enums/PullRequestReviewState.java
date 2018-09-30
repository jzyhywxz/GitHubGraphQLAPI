package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states of a pull request review.")
public enum PullRequestReviewState {
    @Description("A review allowing the pull request to merge.")
    APPROVED,
    @Description("A review blocking the pull request from merging.")
    CHANGES_REQUESTED,
    @Description("An informational review.")
    COMMENTED,
    @Description("A review that has been dismissed.")
    DISMISSED,
    @Description("A review that has not yet been submitted.")
    PENDING,
}
