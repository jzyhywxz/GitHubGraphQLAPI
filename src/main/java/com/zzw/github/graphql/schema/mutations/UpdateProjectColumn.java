package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates an existing project column.")
public class UpdateProjectColumn {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateProjectColumnInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateProjectColumnInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateProjectColumnInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The updated project column.")
    private com.zzw.github.graphql.schema.objects.ProjectColumn projectColumn;
    public com.zzw.github.graphql.schema.objects.ProjectColumn getProjectColumn() { return this.projectColumn; }
    public void setProjectColumn(com.zzw.github.graphql.schema.objects.ProjectColumn projectColumn) { this.projectColumn = projectColumn; }
}
