package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A check suite.")
public class CheckSuite extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="filterBy", type="com.zzw.github.graphql.schema.inputobjects.CheckRunFilter", nonNull=@NonNull(""), description=@Description("Filters the check runs by this type.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @Description("The check runs associated with a check suite.")
    private com.zzw.github.graphql.schema.objects.CheckRunConnection checkRuns;
    public com.zzw.github.graphql.schema.objects.CheckRunConnection getCheckRuns() { return this.checkRuns; }
    public void setCheckRuns(com.zzw.github.graphql.schema.objects.CheckRunConnection checkRuns) { this.checkRuns = checkRuns; }

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
    @Description("A list of open pull requests matching the check suite.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection matchingPullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getMatchingPullRequests() { return this.matchingPullRequests; }
    public void setMatchingPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection matchingPullRequests) { this.matchingPullRequests = matchingPullRequests; }

    @Description("The GitHub App which created this check suite.")
    private com.zzw.github.graphql.schema.objects.App app;
    public com.zzw.github.graphql.schema.objects.App getApp() { return this.app; }
    public void setApp(com.zzw.github.graphql.schema.objects.App app) { this.app = app; }

    @Description("The name of the branch for this check suite.")
    private com.zzw.github.graphql.schema.objects.Ref branch;
    public com.zzw.github.graphql.schema.objects.Ref getBranch() { return this.branch; }
    public void setBranch(com.zzw.github.graphql.schema.objects.Ref branch) { this.branch = branch; }

    @NonNull("!")
    @Description("The commit for this check suite")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @Description("The conclusion of this check suite.")
    private com.zzw.github.graphql.schema.enums.CheckConclusionState conclusion;
    public com.zzw.github.graphql.schema.enums.CheckConclusionState getConclusion() { return this.conclusion; }
    public void setConclusion(com.zzw.github.graphql.schema.enums.CheckConclusionState conclusion) { this.conclusion = conclusion; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The push that triggered this check suite.")
    private com.zzw.github.graphql.schema.objects.Push push;
    public com.zzw.github.graphql.schema.objects.Push getPush() { return this.push; }
    public void setPush(com.zzw.github.graphql.schema.objects.Push push) { this.push = push; }

    @NonNull("!")
    @Description("The repository associated with this check suite.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The status of this check suite.")
    private com.zzw.github.graphql.schema.enums.CheckStatusState status;
    public com.zzw.github.graphql.schema.enums.CheckStatusState getStatus() { return this.status; }
    public void setStatus(com.zzw.github.graphql.schema.enums.CheckStatusState status) { this.status = status; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }
}
