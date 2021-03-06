package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of RemoveOutsideCollaborator")
public class RemoveOutsideCollaboratorInput {
    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The ID of the organization to remove the outside collaborator from.")
    private com.zzw.github.graphql.schema.scalars.ID organizationId;
    public com.zzw.github.graphql.schema.scalars.ID getOrganizationId() { return this.organizationId; }
    public void setOrganizationId(com.zzw.github.graphql.schema.scalars.ID organizationId) { this.organizationId = organizationId; }

    @NonNull("!")
    @Description("The ID of the outside collaborator to remove.")
    private com.zzw.github.graphql.schema.scalars.ID userId;
    public com.zzw.github.graphql.schema.scalars.ID getUserId() { return this.userId; }
    public void setUserId(com.zzw.github.graphql.schema.scalars.ID userId) { this.userId = userId; }
}
