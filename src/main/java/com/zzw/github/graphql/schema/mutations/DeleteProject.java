package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Deletes a project.")
public class DeleteProject {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.DeleteProjectInput input;
    public com.zzw.github.graphql.schema.inputobjects.DeleteProjectInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.DeleteProjectInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The repository or organization the project was removed from.")
    private com.zzw.github.graphql.schema.interfaces.ProjectOwner owner;
    public com.zzw.github.graphql.schema.interfaces.ProjectOwner getOwner() { return this.owner; }
    public void setOwner(com.zzw.github.graphql.schema.interfaces.ProjectOwner owner) { this.owner = owner; }
}
