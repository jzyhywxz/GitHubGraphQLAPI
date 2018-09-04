package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds a comment to a review.")
public class AddPullRequestReviewComment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddPullRequestReviewCommentInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddPullRequestReviewCommentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddPullRequestReviewCommentInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The newly created comment.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewComment comment;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewComment getComment() { return this.comment; }
    public void setComment(com.zzw.github.graphql.schema.objects.PullRequestReviewComment comment) { this.comment = comment; }

    @NonNull("!")
    @Description("The edge from the review's comment connection.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewCommentEdge commentEdge;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewCommentEdge getCommentEdge() { return this.commentEdge; }
    public void setCommentEdge(com.zzw.github.graphql.schema.objects.PullRequestReviewCommentEdge commentEdge) { this.commentEdge = commentEdge; }
}
