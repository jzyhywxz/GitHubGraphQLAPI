package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git reference.")
public class Ref extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
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
    @Description("A list of pull requests with this ref as the head ref.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection associatedPullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getAssociatedPullRequests() { return this.associatedPullRequests; }
    public void setAssociatedPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection associatedPullRequests) { this.associatedPullRequests = associatedPullRequests; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The ref name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The ref's prefix, such as refs/heads/ or refs/tags/.")
    private com.zzw.github.graphql.schema.scalars.String prefix;
    public com.zzw.github.graphql.schema.scalars.String getPrefix() { return this.prefix; }
    public void setPrefix(com.zzw.github.graphql.schema.scalars.String prefix) { this.prefix = prefix; }

    @NonNull("!")
    @Description("The repository the ref belongs to.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The object the ref points to.")
    private com.zzw.github.graphql.schema.interfaces.GitObject target;
    public com.zzw.github.graphql.schema.interfaces.GitObject getTarget() { return this.target; }
    public void setTarget(com.zzw.github.graphql.schema.interfaces.GitObject target) { this.target = target; }
}
