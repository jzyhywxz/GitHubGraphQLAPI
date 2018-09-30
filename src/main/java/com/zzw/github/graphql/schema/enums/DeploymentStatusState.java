package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states for a deployment status.")
public enum DeploymentStatusState {
    @Description("The deployment experienced an error.")
    ERROR,
    @Description("The deployment has failed.")
    FAILURE,
    @Description("The deployment is inactive.")
    INACTIVE,
    @Description("The deployment is pending.")
    PENDING,
    @Description("The deployment was successful.")
    SUCCESS,
}
