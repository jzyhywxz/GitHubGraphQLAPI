package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Defines which types of team members are included in the returned list. Can be one of IMMEDIATE, CHILD_TEAM or ALL.")
public enum TeamMembershipType {
    @Description("Includes immediate and child team members for the team.")
    ALL,
    @Description("Includes only child team members for the team.")
    CHILD_TEAM,
    @Description("Includes only immediate members of the team.")
    IMMEDIATE,
}
