package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states for a check suite or run conclusion.")
public enum CheckConclusionState {
    @Description("The check suite or run requires action.")
    ACTION_REQUIRED,
    @Description("The check suite or run has been cancelled.")
    CANCELLED,
    @Description("The check suite or run has failed.")
    FAILURE,
    @Description("The check suite or run was neutral.")
    NEUTRAL,
    @Description("The check suite or run has succeeded.")
    SUCCESS,
    @Description("The check suite or run has timed out.")
    TIMED_OUT,
}
