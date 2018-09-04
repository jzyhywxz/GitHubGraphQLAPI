package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible commit status states.")
public enum StatusState {
    @Description("Status is errored.")
     ERROR,
    @Description("Status is expected.")
     EXPECTED,
    @Description("Status is failing.")
     FAILURE,
    @Description("Status is pending.")
     PENDING,
    @Description("Status is successful.")
     SUCCESS,
}
