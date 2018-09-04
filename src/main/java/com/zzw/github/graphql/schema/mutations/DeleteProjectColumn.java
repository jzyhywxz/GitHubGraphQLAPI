package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Deletes a project column.")
public class DeleteProjectColumn {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.DeleteProjectColumnInput input;
    public com.zzw.github.graphql.schema.inputobjects.DeleteProjectColumnInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.DeleteProjectColumnInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The deleted column ID.")
    private com.zzw.github.graphql.schema.scalars.ID deletedColumnId;
    public com.zzw.github.graphql.schema.scalars.ID getDeletedColumnId() { return this.deletedColumnId; }
    public void setDeletedColumnId(com.zzw.github.graphql.schema.scalars.ID deletedColumnId) { this.deletedColumnId = deletedColumnId; }

    @NonNull("!")
    @Description("The project the deleted column was in.")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }
}
