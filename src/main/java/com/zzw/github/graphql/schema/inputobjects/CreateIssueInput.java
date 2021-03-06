package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of CreateIssue")
public class CreateIssueInput {
    @NonNull("[!]")
    @Description("The Node ID for the user assignee for this issue.")
    private com.zzw.github.graphql.schema.scalars.ID[] assigneeIds;
    public com.zzw.github.graphql.schema.scalars.ID[] getAssigneeIds() { return this.assigneeIds; }
    public void setAssigneeIds(com.zzw.github.graphql.schema.scalars.ID[] assigneeIds) { this.assigneeIds = assigneeIds; }

    @Description("The body for the issue description.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("[!]")
    @Description("An array of Node IDs of labels for this issue.")
    private com.zzw.github.graphql.schema.scalars.ID[] labelIds;
    public com.zzw.github.graphql.schema.scalars.ID[] getLabelIds() { return this.labelIds; }
    public void setLabelIds(com.zzw.github.graphql.schema.scalars.ID[] labelIds) { this.labelIds = labelIds; }

    @Description("The Node ID of the milestone for this issue.")
    private com.zzw.github.graphql.schema.scalars.ID milestoneId;
    public com.zzw.github.graphql.schema.scalars.ID getMilestoneId() { return this.milestoneId; }
    public void setMilestoneId(com.zzw.github.graphql.schema.scalars.ID milestoneId) { this.milestoneId = milestoneId; }

    @NonNull("[!]")
    @Description("An array of Node IDs for projects associated with this issue.")
    private com.zzw.github.graphql.schema.scalars.ID[] projectIds;
    public com.zzw.github.graphql.schema.scalars.ID[] getProjectIds() { return this.projectIds; }
    public void setProjectIds(com.zzw.github.graphql.schema.scalars.ID[] projectIds) { this.projectIds = projectIds; }

    @NonNull("!")
    @Description("The Node ID of the repository.")
    private com.zzw.github.graphql.schema.scalars.ID repositoryId;
    public com.zzw.github.graphql.schema.scalars.ID getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(com.zzw.github.graphql.schema.scalars.ID repositoryId) { this.repositoryId = repositoryId; }

    @NonNull("!")
    @Description("The title for the issue.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }
}
