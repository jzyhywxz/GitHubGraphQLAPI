package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ways in which to filter lists of issues.")
public class IssueFilters {
    @Description("List issues assigned to given name. Pass in null for issues with no assigned user, and * for issues assigned to any user.")
    private com.zzw.github.graphql.schema.scalars.String assignee;
    public com.zzw.github.graphql.schema.scalars.String getAssignee() { return this.assignee; }
    public void setAssignee(com.zzw.github.graphql.schema.scalars.String assignee) { this.assignee = assignee; }

    @Description("List issues created by given name.")
    private com.zzw.github.graphql.schema.scalars.String createdBy;
    public com.zzw.github.graphql.schema.scalars.String getCreatedBy() { return this.createdBy; }
    public void setCreatedBy(com.zzw.github.graphql.schema.scalars.String createdBy) { this.createdBy = createdBy; }

    @NonNull("[!]")
    @Description("List issues where the list of label names exist on the issue.")
    private com.zzw.github.graphql.schema.scalars.String[] labels;
    public com.zzw.github.graphql.schema.scalars.String[] getLabels() { return this.labels; }
    public void setLabels(com.zzw.github.graphql.schema.scalars.String[] labels) { this.labels = labels; }

    @Description("List issues where the given name is mentioned in the issue.")
    private com.zzw.github.graphql.schema.scalars.String mentioned;
    public com.zzw.github.graphql.schema.scalars.String getMentioned() { return this.mentioned; }
    public void setMentioned(com.zzw.github.graphql.schema.scalars.String mentioned) { this.mentioned = mentioned; }

    @Description("List issues by given milestone argument. If an string representation of an integer is passed, it should refer to a milestone by its number field. Pass in null for issues with no milestone, and * for issues that are assigned to any milestone.")
    private com.zzw.github.graphql.schema.scalars.String milestone;
    public com.zzw.github.graphql.schema.scalars.String getMilestone() { return this.milestone; }
    public void setMilestone(com.zzw.github.graphql.schema.scalars.String milestone) { this.milestone = milestone; }

    @Description("List issues that have been updated at or after the given date.")
    private com.zzw.github.graphql.schema.scalars.DateTime since;
    public com.zzw.github.graphql.schema.scalars.DateTime getSince() { return this.since; }
    public void setSince(com.zzw.github.graphql.schema.scalars.DateTime since) { this.since = since; }

    @NonNull("[!]")
    @Description("List issues filtered by the list of states given.")
    private com.zzw.github.graphql.schema.enums.IssueState[] states;
    public com.zzw.github.graphql.schema.enums.IssueState[] getStates() { return this.states; }
    public void setStates(com.zzw.github.graphql.schema.enums.IssueState[] states) { this.states = states; }

    @Description("List issues subscribed to by viewer.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerSubscribed;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerSubscribed() { return this.viewerSubscribed; }
    public void setViewerSubscribed(com.zzw.github.graphql.schema.scalars.Boolean viewerSubscribed) { this.viewerSubscribed = viewerSubscribed; }
}
