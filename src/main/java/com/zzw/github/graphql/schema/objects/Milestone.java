package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Milestone object on a given repository.")
public class Milestone extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Closable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="labels", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("A list of label names to filter the pull requests by.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.IssueOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.IssueState[]", nonNull=@NonNull("[!]"), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of issues associated with the milestone.")
    private com.zzw.github.graphql.schema.objects.IssueConnection issues;
    public com.zzw.github.graphql.schema.objects.IssueConnection getIssues() { return this.issues; }
    public void setIssues(com.zzw.github.graphql.schema.objects.IssueConnection issues) { this.issues = issues; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="baseRefName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("The base ref name to filter the pull requests by.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="headRefName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="labels", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("The head ref name to filter the pull requests by.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("A list of label names to filter the pull requests by.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.IssueOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.PullRequestState[]", nonNull=@NonNull("[!]"), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of pull requests associated with the milestone.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getPullRequests() { return this.pullRequests; }
    public void setPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests) { this.pullRequests = pullRequests; }

    @NonNull("!")
    @Description(" if the object is closed (definition of closed may depend on type)")
    private com.zzw.github.graphql.schema.scalars.Boolean closed;
    public com.zzw.github.graphql.schema.scalars.Boolean getClosed() { return this.closed; }
    public void setClosed(com.zzw.github.graphql.schema.scalars.Boolean closed) { this.closed = closed; }

    @Description("Identifies the date and time when the object was closed.")
    private com.zzw.github.graphql.schema.scalars.DateTime closedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getClosedAt() { return this.closedAt; }
    public void setClosedAt(com.zzw.github.graphql.schema.scalars.DateTime closedAt) { this.closedAt = closedAt; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the actor who created the milestone.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @Description("Identifies the description of the milestone.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("Identifies the due date of the milestone.")
    private com.zzw.github.graphql.schema.scalars.DateTime dueOn;
    public com.zzw.github.graphql.schema.scalars.DateTime getDueOn() { return this.dueOn; }
    public void setDueOn(com.zzw.github.graphql.schema.scalars.DateTime dueOn) { this.dueOn = dueOn; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the number of the milestone.")
    private com.zzw.github.graphql.schema.scalars.Int number;
    public com.zzw.github.graphql.schema.scalars.Int getNumber() { return this.number; }
    public void setNumber(com.zzw.github.graphql.schema.scalars.Int number) { this.number = number; }

    @NonNull("!")
    @Description("The repository associated with this milestone.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this milestone")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Identifies the state of the milestone.")
    private com.zzw.github.graphql.schema.enums.MilestoneState state;
    public com.zzw.github.graphql.schema.enums.MilestoneState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.MilestoneState state) { this.state = state; }

    @NonNull("!")
    @Description("Identifies the title of the milestone.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this milestone")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
