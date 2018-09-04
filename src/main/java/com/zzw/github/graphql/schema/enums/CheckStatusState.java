package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states for a check suite or run status.")
public enum CheckStatusState {
    @Description("The check suite or run has been completed.")
     COMPLETED,
    @Description("The check suite or run is in progress.")
     IN_PROGRESS,
    @Description("The check suite or run has been queued.")
     QUEUED,
    @Description("The check suite or run has been requested.")
     REQUESTED,
}
