package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates the body of a pull request review.")
public class UpdatePullRequestReview {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The updated pull request review.")
    private com.zzw.github.graphql.schema.objects.PullRequestReview pullRequestReview;
    public com.zzw.github.graphql.schema.objects.PullRequestReview getPullRequestReview() { return this.pullRequestReview; }
    public void setPullRequestReview(com.zzw.github.graphql.schema.objects.PullRequestReview pullRequestReview) { this.pullRequestReview = pullRequestReview; }
}
