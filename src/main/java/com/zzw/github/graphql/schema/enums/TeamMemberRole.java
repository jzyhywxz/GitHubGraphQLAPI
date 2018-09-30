package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible team member roles; either 'maintainer' or 'member'.")
public enum TeamMemberRole {
    @Description("A team maintainer has permission to add and remove team members.")
    MAINTAINER,
    @Description("A team member has no administrative permissions on the team.")
    MEMBER,
}
