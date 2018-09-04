package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Unlock a lockable object")
public class UnlockLockable {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UnlockLockableInput input;
    public com.zzw.github.graphql.schema.inputobjects.UnlockLockableInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UnlockLockableInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The item that was unlocked.")
    private com.zzw.github.graphql.schema.interfaces.Lockable unlockedRecord;
    public com.zzw.github.graphql.schema.interfaces.Lockable getUnlockedRecord() { return this.unlockedRecord; }
    public void setUnlockedRecord(com.zzw.github.graphql.schema.interfaces.Lockable unlockedRecord) { this.unlockedRecord = unlockedRecord; }
}
