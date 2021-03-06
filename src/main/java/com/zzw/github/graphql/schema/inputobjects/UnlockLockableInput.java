package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of UnlockLockable")
public class UnlockLockableInput {
    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("ID of the issue or pull request to be unlocked.")
    private com.zzw.github.graphql.schema.scalars.ID lockableId;
    public com.zzw.github.graphql.schema.scalars.ID getLockableId() { return this.lockableId; }
    public void setLockableId(com.zzw.github.graphql.schema.scalars.ID lockableId) { this.lockableId = lockableId; }
}
