package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Marks a review thread as resolved.")
public class ResolveReviewThread {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.ResolveReviewThreadInput input;
    public com.zzw.github.graphql.schema.inputobjects.ResolveReviewThreadInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.ResolveReviewThreadInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The thread to resolve.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewThread thread;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewThread getThread() { return this.thread; }
    public void setThread(com.zzw.github.graphql.schema.objects.PullRequestReviewThread thread) { this.thread = thread; }
}
