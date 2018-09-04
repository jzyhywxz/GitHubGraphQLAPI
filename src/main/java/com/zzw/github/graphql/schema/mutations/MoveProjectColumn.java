package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Moves a project column to another place.")
public class MoveProjectColumn {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.MoveProjectColumnInput input;
    public com.zzw.github.graphql.schema.inputobjects.MoveProjectColumnInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.MoveProjectColumnInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The new edge of the moved column.")
    private com.zzw.github.graphql.schema.objects.ProjectColumnEdge columnEdge;
    public com.zzw.github.graphql.schema.objects.ProjectColumnEdge getColumnEdge() { return this.columnEdge; }
    public void setColumnEdge(com.zzw.github.graphql.schema.objects.ProjectColumnEdge columnEdge) { this.columnEdge = columnEdge; }
}
