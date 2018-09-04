package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states in which a deployment can be.")
public enum DeploymentState {
    @Description("The pending deployment was not updated after 30 minutes.")
     ABANDONED,
    @Description("The deployment is currently active.")
     ACTIVE,
    @Description("An inactive transient deployment.")
     DESTROYED,
    @Description("The deployment experienced an error.")
     ERROR,
    @Description("The deployment has failed.")
     FAILURE,
    @Description("The deployment is inactive.")
     INACTIVE,
    @Description("")
     IN_PROGRESS,
    @Description("The deployment is in progress.")
     PENDING,
    @Description("The deployment is pending.")
     QUEUED,
}
