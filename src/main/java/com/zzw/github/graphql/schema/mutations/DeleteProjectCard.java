package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Deletes a project card.")
public class DeleteProjectCard {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.DeleteProjectCardInput input;
    public com.zzw.github.graphql.schema.inputobjects.DeleteProjectCardInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.DeleteProjectCardInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The column the deleted card was in.")
    private com.zzw.github.graphql.schema.objects.ProjectColumn column;
    public com.zzw.github.graphql.schema.objects.ProjectColumn getColumn() { return this.column; }
    public void setColumn(com.zzw.github.graphql.schema.objects.ProjectColumn column) { this.column = column; }

    @NonNull("!")
    @Description("The deleted card ID.")
    private com.zzw.github.graphql.schema.scalars.ID deletedCardId;
    public com.zzw.github.graphql.schema.scalars.ID getDeletedCardId() { return this.deletedCardId; }
    public void setDeletedCardId(com.zzw.github.graphql.schema.scalars.ID deletedCardId) { this.deletedCardId = deletedCardId; }
}
