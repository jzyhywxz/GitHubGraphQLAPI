package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds a card to a ProjectColumn. Either contentId or note must be provided but not both.")
public class AddProjectCard {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddProjectCardInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddProjectCardInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddProjectCardInput input) { this.input = input; }

    @NonNull("!")
    @Description("The edge from the ProjectColumn's card connection.")
    private com.zzw.github.graphql.schema.objects.ProjectCardEdge cardEdge;
    public com.zzw.github.graphql.schema.objects.ProjectCardEdge getCardEdge() { return this.cardEdge; }
    public void setCardEdge(com.zzw.github.graphql.schema.objects.ProjectCardEdge cardEdge) { this.cardEdge = cardEdge; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The ProjectColumn")
    private com.zzw.github.graphql.schema.objects.Project projectColumn;
    public com.zzw.github.graphql.schema.objects.Project getProjectColumn() { return this.projectColumn; }
    public void setProjectColumn(com.zzw.github.graphql.schema.objects.Project projectColumn) { this.projectColumn = projectColumn; }
}
