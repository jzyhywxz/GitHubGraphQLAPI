package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Set review requests on a pull request.")
public class RequestReviews {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.RequestReviewsInput input;
    public com.zzw.github.graphql.schema.inputobjects.RequestReviewsInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.RequestReviewsInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The pull request that is getting requests.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @NonNull("!")
    @Description("The edge from the pull request to the requested reviewers.")
    private com.zzw.github.graphql.schema.objects.UserEdge requestedReviewersEdge;
    public com.zzw.github.graphql.schema.objects.UserEdge getRequestedReviewersEdge() { return this.requestedReviewersEdge; }
    public void setRequestedReviewersEdge(com.zzw.github.graphql.schema.objects.UserEdge requestedReviewersEdge) { this.requestedReviewersEdge = requestedReviewersEdge; }
}
