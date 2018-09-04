package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible organization invitation roles.")
public enum OrganizationInvitationRole {
    @Description("The user is invited to be an admin of the organization.")
     ADMIN,
    @Description("The user is invited to be a billing manager of the organization.")
     BILLING_MANAGER,
    @Description("The user is invited to be a direct member of the organization.")
     DIRECT_MEMBER,
    @Description("The user's previous role will be reinstated.")
     REINSTATE,
}
