package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of MoveProjectCard")
public class MoveProjectCardInput {
    @Description("Place the new card after the card with this id. Pass null to place it at the top.")
    private com.zzw.github.graphql.schema.scalars.ID afterCardId;
    public com.zzw.github.graphql.schema.scalars.ID getAfterCardId() { return this.afterCardId; }
    public void setAfterCardId(com.zzw.github.graphql.schema.scalars.ID afterCardId) { this.afterCardId = afterCardId; }

    @NonNull("!")
    @Description("The id of the card to move.")
    private com.zzw.github.graphql.schema.scalars.ID cardId;
    public com.zzw.github.graphql.schema.scalars.ID getCardId() { return this.cardId; }
    public void setCardId(com.zzw.github.graphql.schema.scalars.ID cardId) { this.cardId = cardId; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The id of the column to move it into.")
    private com.zzw.github.graphql.schema.scalars.ID columnId;
    public com.zzw.github.graphql.schema.scalars.ID getColumnId() { return this.columnId; }
    public void setColumnId(com.zzw.github.graphql.schema.scalars.ID columnId) { this.columnId = columnId; }
}