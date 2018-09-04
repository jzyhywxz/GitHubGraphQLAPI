package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of UpdatePullRequestReviewComment")
public class UpdatePullRequestReviewCommentInput {
    @NonNull("!")
    @Description("The text of the comment.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The Node ID of the comment to modify.")
    private com.zzw.github.graphql.schema.scalars.ID pullRequestReviewCommentId;
    public com.zzw.github.graphql.schema.scalars.ID getPullRequestReviewCommentId() { return this.pullRequestReviewCommentId; }
    public void setPullRequestReviewCommentId(com.zzw.github.graphql.schema.scalars.ID pullRequestReviewCommentId) { this.pullRequestReviewCommentId = pullRequestReviewCommentId; }
}