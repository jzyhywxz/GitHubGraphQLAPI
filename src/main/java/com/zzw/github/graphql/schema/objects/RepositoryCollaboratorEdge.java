package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a user who is a collaborator of a repository.")
public class RepositoryCollaboratorEdge extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("A cursor for use in pagination.")
    private com.zzw.github.graphql.schema.scalars.String cursor;
    public com.zzw.github.graphql.schema.scalars.String getCursor() { return this.cursor; }
    public void setCursor(com.zzw.github.graphql.schema.scalars.String cursor) { this.cursor = cursor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.objects.User node;
    public com.zzw.github.graphql.schema.objects.User getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.objects.User node) { this.node = node; }

    @NonNull("!")
    @Description("The permission the user has on the repository.")
    private com.zzw.github.graphql.schema.enums.RepositoryPermission permission;
    public com.zzw.github.graphql.schema.enums.RepositoryPermission getPermission() { return this.permission; }
    public void setPermission(com.zzw.github.graphql.schema.enums.RepositoryPermission permission) { this.permission = permission; }
}
