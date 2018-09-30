package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds assignees to an assignable object.")
public class AddAssigneesToAssignable {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddAssigneesToAssignableInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddAssigneesToAssignableInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddAssigneesToAssignableInput input) { this.input = input; }

    @Description("The item that was assigned.")
    private com.zzw.github.graphql.schema.interfaces.Assignable assignable;
    public com.zzw.github.graphql.schema.interfaces.Assignable getAssignable() { return this.assignable; }
    public void setAssignable(com.zzw.github.graphql.schema.interfaces.Assignable assignable) { this.assignable = assignable; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
