package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Moves a project card to another place.")
public class MoveProjectCard {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.MoveProjectCardInput input;
    public com.zzw.github.graphql.schema.inputobjects.MoveProjectCardInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.MoveProjectCardInput input) { this.input = input; }

    @NonNull("!")
    @Description("The new edge of the moved card.")
    private com.zzw.github.graphql.schema.objects.ProjectCardEdge cardEdge;
    public com.zzw.github.graphql.schema.objects.ProjectCardEdge getCardEdge() { return this.cardEdge; }
    public void setCardEdge(com.zzw.github.graphql.schema.objects.ProjectCardEdge cardEdge) { this.cardEdge = cardEdge; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
