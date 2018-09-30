package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A label for categorizing Issues or Milestones with a given Repository.")
public class Label extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="filterBy", type="com.zzw.github.graphql.schema.inputobjects.IssueFilters", nonNull=@NonNull(""), description=@Description("Filtering options for issues returned from the connection.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="labels", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("A list of label names to filter the pull requests by.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.IssueOrder", nonNull=@NonNull(""), description=@Description("Ordering options for issues returned from the connection.")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.IssueState[]", nonNull=@NonNull("[!]"), description=@Description("A list of states to filter the issues by.")),
    })
    @NonNull("!")
    @Description("A list of issues associated with this label.")
    private com.zzw.github.graphql.schema.objects.IssueConnection issues;
    public com.zzw.github.graphql.schema.objects.IssueConnection getIssues() { return this.issues; }
    public void setIssues(com.zzw.github.graphql.schema.objects.IssueConnection issues) { this.issues = issues; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="baseRefName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("The base ref name to filter the pull requests by.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="headRefName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("The head ref name to filter the pull requests by.")),
        @Argument(name="labels", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("A list of label names to filter the pull requests by.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.IssueOrder", nonNull=@NonNull(""), description=@Description("Ordering options for pull requests returned from the connection.")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.PullRequestState[]", nonNull=@NonNull("[!]"), description=@Description("A list of states to filter the pull requests by.")),
    })
    @NonNull("!")
    @Description("A list of pull requests associated with this label.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getPullRequests() { return this.pullRequests; }
    public void setPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests) { this.pullRequests = pullRequests; }

    @NonNull("!")
    @Description("Identifies the label color.")
    private com.zzw.github.graphql.schema.scalars.String color;
    public com.zzw.github.graphql.schema.scalars.String getColor() { return this.color; }
    public void setColor(com.zzw.github.graphql.schema.scalars.String color) { this.color = color; }

    @Description("Identifies the date and time when the label was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("A brief description of this label.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Indicates whether or not this is a default label.")
    private com.zzw.github.graphql.schema.scalars.Boolean isDefault;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDefault() { return this.isDefault; }
    public void setIsDefault(com.zzw.github.graphql.schema.scalars.Boolean isDefault) { this.isDefault = isDefault; }

    @NonNull("!")
    @Description("Identifies the label name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The repository associated with this label.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this label.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("Identifies the date and time when the label was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this label.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
