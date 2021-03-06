package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of RequestReviews")
public class RequestReviewsInput {
    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The Node ID of the pull request to modify.")
    private com.zzw.github.graphql.schema.scalars.ID pullRequestId;
    public com.zzw.github.graphql.schema.scalars.ID getPullRequestId() { return this.pullRequestId; }
    public void setPullRequestId(com.zzw.github.graphql.schema.scalars.ID pullRequestId) { this.pullRequestId = pullRequestId; }

    @NonNull("[!]")
    @Description("The Node IDs of the team to request.")
    private com.zzw.github.graphql.schema.scalars.ID[] teamIds;
    public com.zzw.github.graphql.schema.scalars.ID[] getTeamIds() { return this.teamIds; }
    public void setTeamIds(com.zzw.github.graphql.schema.scalars.ID[] teamIds) { this.teamIds = teamIds; }

    @Description("Add users to the set rather than replace.")
    private com.zzw.github.graphql.schema.scalars.Boolean union;
    public com.zzw.github.graphql.schema.scalars.Boolean getUnion() { return this.union; }
    public void setUnion(com.zzw.github.graphql.schema.scalars.Boolean union) { this.union = union; }

    @NonNull("[!]")
    @Description("The Node IDs of the user to request.")
    private com.zzw.github.graphql.schema.scalars.ID[] userIds;
    public com.zzw.github.graphql.schema.scalars.ID[] getUserIds() { return this.userIds; }
    public void setUserIds(com.zzw.github.graphql.schema.scalars.ID[] userIds) { this.userIds = userIds; }
}
