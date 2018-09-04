package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Removes outside collaborator from all repositories in an organization.")
public class RemoveOutsideCollaborator {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.RemoveOutsideCollaboratorInput input;
    public com.zzw.github.graphql.schema.inputobjects.RemoveOutsideCollaboratorInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.RemoveOutsideCollaboratorInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The user that was removed as an outside collaborator.")
    private com.zzw.github.graphql.schema.objects.User removedUser;
    public com.zzw.github.graphql.schema.objects.User getRemovedUser() { return this.removedUser; }
    public void setRemovedUser(com.zzw.github.graphql.schema.objects.User removedUser) { this.removedUser = removedUser; }
}
