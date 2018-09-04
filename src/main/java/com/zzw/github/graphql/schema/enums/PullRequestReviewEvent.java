package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible events to perform on a pull request review.")
public enum PullRequestReviewEvent {
    @Description("Submit feedback and approve merging these changes.")
     APPROVE,
    @Description("Submit general feedback without explicit approval.")
     COMMENT,
    @Description("Dismiss review so it now longer effects merging.")
     DISMISS,
    @Description("Submit feedback that must be addressed before merging.")
     REQUEST_CHANGES,
}
