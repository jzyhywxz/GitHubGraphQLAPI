package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates the state for subscribable subjects.")
public class UpdateSubscription {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateSubscriptionInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateSubscriptionInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateSubscriptionInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The input subscribable entity.")
    private com.zzw.github.graphql.schema.interfaces.Subscribable subscribable;
    public com.zzw.github.graphql.schema.interfaces.Subscribable getSubscribable() { return this.subscribable; }
    public void setSubscribable(com.zzw.github.graphql.schema.interfaces.Subscribable subscribable) { this.subscribable = subscribable; }
}
