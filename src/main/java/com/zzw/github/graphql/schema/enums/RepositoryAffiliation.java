package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The affiliation of a user to a repository")
public enum RepositoryAffiliation {
    @Description("Repositories that the user has been added to as a collaborator.")
     COLLABORATOR,
    @Description("Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.")
     ORGANIZATION_MEMBER,
    @Description("Repositories that are owned by the authenticated user.")
     OWNER,
}
