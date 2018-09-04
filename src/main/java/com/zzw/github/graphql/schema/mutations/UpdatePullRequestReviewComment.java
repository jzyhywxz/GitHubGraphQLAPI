package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates a pull request review comment.")
public class UpdatePullRequestReviewComment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewCommentInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewCommentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewCommentInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The updated comment.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewComment pullRequestReviewComment;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewComment getPullRequestReviewComment() { return this.pullRequestReviewComment; }
    public void setPullRequestReviewComment(com.zzw.github.graphql.schema.objects.PullRequestReviewComment pullRequestReviewComment) { this.pullRequestReviewComment = pullRequestReviewComment; }
}
