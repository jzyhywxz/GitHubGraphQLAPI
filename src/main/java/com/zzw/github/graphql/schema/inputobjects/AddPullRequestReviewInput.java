package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of AddPullRequestReview")
public class AddPullRequestReviewInput {
    @Description("The contents of the review body comment.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The review line comments.")
    private com.zzw.github.graphql.schema.inputobjects.DraftPullRequestReviewComment[] comments;
    public com.zzw.github.graphql.schema.inputobjects.DraftPullRequestReviewComment[] getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.inputobjects.DraftPullRequestReviewComment[] comments) { this.comments = comments; }

    @Description("The commit OID the review pertains to.")
    private com.zzw.github.graphql.schema.scalars.GitObjectID commitOID;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getCommitOID() { return this.commitOID; }
    public void setCommitOID(com.zzw.github.graphql.schema.scalars.GitObjectID commitOID) { this.commitOID = commitOID; }

    @Description("The event to perform on the pull request review.")
    private com.zzw.github.graphql.schema.enums.PullRequestReviewEvent event;
    public com.zzw.github.graphql.schema.enums.PullRequestReviewEvent getEvent() { return this.event; }
    public void setEvent(com.zzw.github.graphql.schema.enums.PullRequestReviewEvent event) { this.event = event; }

    @NonNull("!")
    @Description("The Node ID of the pull request to modify.")
    private com.zzw.github.graphql.schema.scalars.ID pullRequestId;
    public com.zzw.github.graphql.schema.scalars.ID getPullRequestId() { return this.pullRequestId; }
    public void setPullRequestId(com.zzw.github.graphql.schema.scalars.ID pullRequestId) { this.pullRequestId = pullRequestId; }
}
