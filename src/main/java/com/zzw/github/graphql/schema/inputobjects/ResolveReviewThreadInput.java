package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of ResolveReviewThread")
public class ResolveReviewThreadInput {
    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The ID of the thread to resolve")
    private com.zzw.github.graphql.schema.scalars.ID threadId;
    public com.zzw.github.graphql.schema.scalars.ID getThreadId() { return this.threadId; }
    public void setThreadId(com.zzw.github.graphql.schema.scalars.ID threadId) { this.threadId = threadId; }
}
