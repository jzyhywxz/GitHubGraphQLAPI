package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Collaborators affiliation level with a subject.")
public enum CollaboratorAffiliation {
    @Description("All collaborators the authenticated user can see.")
    ALL,
    @Description("All collaborators with permissions to an organization-owned subject, regardless of organization membership status.")
    DIRECT,
    @Description("All outside collaborators of an organization-owned subject.")
    OUTSIDE,
}
