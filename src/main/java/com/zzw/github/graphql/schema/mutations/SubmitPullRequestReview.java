package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Submits a pending pull request review.")
public class SubmitPullRequestReview {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.SubmitPullRequestReviewInput input;
    public com.zzw.github.graphql.schema.inputobjects.SubmitPullRequestReviewInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.SubmitPullRequestReviewInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The submitted pull request review.")
    private com.zzw.github.graphql.schema.objects.PullRequestReview pullRequestReview;
    public com.zzw.github.graphql.schema.objects.PullRequestReview getPullRequestReview() { return this.pullRequestReview; }
    public void setPullRequestReview(com.zzw.github.graphql.schema.objects.PullRequestReview pullRequestReview) { this.pullRequestReview = pullRequestReview; }
}
