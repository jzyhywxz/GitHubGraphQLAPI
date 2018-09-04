package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The role of a user on a team.")
public enum TeamRole {
    @Description("User has admin rights on the team.")
     ADMIN,
    @Description("User is a member of the team.")
     MEMBER,
}
