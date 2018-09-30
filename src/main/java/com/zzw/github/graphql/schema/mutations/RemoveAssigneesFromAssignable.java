package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Removes assignees from an assignable object.")
public class RemoveAssigneesFromAssignable {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.RemoveAssigneesFromAssignableInput input;
    public com.zzw.github.graphql.schema.inputobjects.RemoveAssigneesFromAssignableInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.RemoveAssigneesFromAssignableInput input) { this.input = input; }

    @Description("The item that was unassigned.")
    private com.zzw.github.graphql.schema.interfaces.Assignable assignable;
    public com.zzw.github.graphql.schema.interfaces.Assignable getAssignable() { return this.assignable; }
    public void setAssignable(com.zzw.github.graphql.schema.interfaces.Assignable assignable) { this.assignable = assignable; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
