package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A repository contains the content for a project.")
public class Repository extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.ProjectOwner, com.zzw.github.graphql.schema.interfaces.RegistryPackageOwner, com.zzw.github.graphql.schema.interfaces.RepositoryInfo, com.zzw.github.graphql.schema.interfaces.Starrable, com.zzw.github.graphql.schema.interfaces.Subscribable, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of users that can be assigned to issues in this repository.")
    private com.zzw.github.graphql.schema.objects.UserConnection assignableUsers;
    public com.zzw.github.graphql.schema.objects.UserConnection getAssignableUsers() { return this.assignableUsers; }
    public void setAssignableUsers(com.zzw.github.graphql.schema.objects.UserConnection assignableUsers) { this.assignableUsers = assignableUsers; }

    @Arguments({
        @Argument(name="affiliation", type="com.zzw.github.graphql.schema.enums.CollaboratorAffiliation", nonNull=@NonNull(""), description=@Description("Collaborators affiliation level with a repository.")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("A list of collaborators associated with the repository.")
    private com.zzw.github.graphql.schema.objects.RepositoryCollaboratorConnection collaborators;
    public com.zzw.github.graphql.schema.objects.RepositoryCollaboratorConnection getCollaborators() { return this.collaborators; }
    public void setCollaborators(com.zzw.github.graphql.schema.objects.RepositoryCollaboratorConnection collaborators) { this.collaborators = collaborators; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of commit comments associated with the repository.")
    private com.zzw.github.graphql.schema.objects.CommitCommentConnection commitComments;
    public com.zzw.github.graphql.schema.objects.CommitCommentConnection getCommitComments() { return this.commitComments; }
    public void setCommitComments(com.zzw.github.graphql.schema.objects.CommitCommentConnection commitComments) { this.commitComments = commitComments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="dependenciesAfter", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Cursor to paginate dependencies")),
        @Argument(name="dependenciesFirst", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Number of dependencies to fetch")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="withDependencies", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @Description("A list of dependency manifests contained in the repository")
    private com.zzw.github.graphql.schema.objects.DependencyGraphManifestConnection dependencyGraphManifests;
    public com.zzw.github.graphql.schema.objects.DependencyGraphManifestConnection getDependencyGraphManifests() { return this.dependencyGraphManifests; }
    public void setDependencyGraphManifests(com.zzw.github.graphql.schema.objects.DependencyGraphManifestConnection dependencyGraphManifests) { this.dependencyGraphManifests = dependencyGraphManifests; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of deploy keys that are on this repository.")
    private com.zzw.github.graphql.schema.objects.DeployKeyConnection deployKeys;
    public com.zzw.github.graphql.schema.objects.DeployKeyConnection getDeployKeys() { return this.deployKeys; }
    public void setDeployKeys(com.zzw.github.graphql.schema.objects.DeployKeyConnection deployKeys) { this.deployKeys = deployKeys; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="environments", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("Environments to list deployments for")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("Deployments associated with the repository")
    private com.zzw.github.graphql.schema.objects.DeploymentConnection deployments;
    public com.zzw.github.graphql.schema.objects.DeploymentConnection getDeployments() { return this.deployments; }
    public void setDeployments(com.zzw.github.graphql.schema.objects.DeploymentConnection deployments) { this.deployments = deployments; }

    @Arguments({
        @Argument(name="affiliations", type="com.zzw.github.graphql.schema.enums.RepositoryAffiliation[]", nonNull=@NonNull(""), description=@Description("Affiliation options for repositories returned from the connection")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("The default value is")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description(".")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
    })
    @NonNull("!")
    @Description("A list of direct forked repositories.")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection forks;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getForks() { return this.forks; }
    public void setForks(com.zzw.github.graphql.schema.objects.RepositoryConnection forks) { this.forks = forks; }

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
    @Description("A list of issues that have been opened in the repository.")
    private com.zzw.github.graphql.schema.objects.IssueConnection issues;
    public com.zzw.github.graphql.schema.objects.IssueConnection getIssues() { return this.issues; }
    public void setIssues(com.zzw.github.graphql.schema.objects.IssueConnection issues) { this.issues = issues; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="query", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @Description("A list of labels associated with the repository.")
    private com.zzw.github.graphql.schema.objects.LabelConnection labels;
    public com.zzw.github.graphql.schema.objects.LabelConnection getLabels() { return this.labels; }
    public void setLabels(com.zzw.github.graphql.schema.objects.LabelConnection labels) { this.labels = labels; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.LanguageOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @Description("A list containing a breakdown of the language composition of the repository.")
    private com.zzw.github.graphql.schema.objects.LanguageConnection languages;
    public com.zzw.github.graphql.schema.objects.LanguageConnection getLanguages() { return this.languages; }
    public void setLanguages(com.zzw.github.graphql.schema.objects.LanguageConnection languages) { this.languages = languages; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of Users that can be mentioned in the context of the repository.")
    private com.zzw.github.graphql.schema.objects.UserConnection mentionableUsers;
    public com.zzw.github.graphql.schema.objects.UserConnection getMentionableUsers() { return this.mentionableUsers; }
    public void setMentionableUsers(com.zzw.github.graphql.schema.objects.UserConnection mentionableUsers) { this.mentionableUsers = mentionableUsers; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.MilestoneOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.MilestoneState[]", nonNull=@NonNull("[!]"), description=@Description("elements from the list.")),
    })
    @Description("A list of milestones associated with the repository.")
    private com.zzw.github.graphql.schema.objects.MilestoneConnection milestones;
    public com.zzw.github.graphql.schema.objects.MilestoneConnection getMilestones() { return this.milestones; }
    public void setMilestones(com.zzw.github.graphql.schema.objects.MilestoneConnection milestones) { this.milestones = milestones; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.ProjectOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="search", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.ProjectState[]", nonNull=@NonNull("[!]"), description=@Description("Ordering options for projects returned from the connection")),
    })
    @NonNull("!")
    @Description("A list of projects under the owner.")
    private com.zzw.github.graphql.schema.objects.ProjectConnection projects;
    public com.zzw.github.graphql.schema.objects.ProjectConnection getProjects() { return this.projects; }
    public void setProjects(com.zzw.github.graphql.schema.objects.ProjectConnection projects) { this.projects = projects; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of protected branches that are on this repository.")
    private com.zzw.github.graphql.schema.objects.ProtectedBranchConnection protectedBranches;
    public com.zzw.github.graphql.schema.objects.ProtectedBranchConnection getProtectedBranches() { return this.protectedBranches; }
    public void setProtectedBranches(com.zzw.github.graphql.schema.objects.ProtectedBranchConnection protectedBranches) { this.protectedBranches = protectedBranches; }

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
    @Description("A list of pull requests that have been opened in the repository.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getPullRequests() { return this.pullRequests; }
    public void setPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests) { this.pullRequests = pullRequests; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="direction", type="com.zzw.github.graphql.schema.enums.OrderDirection", nonNull=@NonNull(""), description=@Description("DEPRECATED: use orderBy. The ordering direction.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RefOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="refPrefix", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("elements from the list.")),
    })
    @Description("Fetch a list of refs from the repository")
    private com.zzw.github.graphql.schema.objects.RefConnection refs;
    public com.zzw.github.graphql.schema.objects.RefConnection getRefs() { return this.refs; }
    public void setRefs(com.zzw.github.graphql.schema.objects.RefConnection refs) { this.refs = refs; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.ReleaseOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @NonNull("!")
    @Description("List of releases which are dependent on this repository.")
    private com.zzw.github.graphql.schema.objects.ReleaseConnection releases;
    public com.zzw.github.graphql.schema.objects.ReleaseConnection getReleases() { return this.releases; }
    public void setReleases(com.zzw.github.graphql.schema.objects.ReleaseConnection releases) { this.releases = releases; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of applied repository-topic associations for this repository.")
    private com.zzw.github.graphql.schema.objects.RepositoryTopicConnection repositoryTopics;
    public com.zzw.github.graphql.schema.objects.RepositoryTopicConnection getRepositoryTopics() { return this.repositoryTopics; }
    public void setRepositoryTopics(com.zzw.github.graphql.schema.objects.RepositoryTopicConnection repositoryTopics) { this.repositoryTopics = repositoryTopics; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.StarOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @NonNull("!")
    @Description("A list of users who have starred this starrable.")
    private com.zzw.github.graphql.schema.objects.StargazerConnection stargazers;
    public com.zzw.github.graphql.schema.objects.StargazerConnection getStargazers() { return this.stargazers; }
    public void setStargazers(com.zzw.github.graphql.schema.objects.StargazerConnection stargazers) { this.stargazers = stargazers; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("A list of vulnerability alerts that are on this repository.")
    private com.zzw.github.graphql.schema.objects.RepositoryVulnerabilityAlertConnection vulnerabilityAlerts;
    public com.zzw.github.graphql.schema.objects.RepositoryVulnerabilityAlertConnection getVulnerabilityAlerts() { return this.vulnerabilityAlerts; }
    public void setVulnerabilityAlerts(com.zzw.github.graphql.schema.objects.RepositoryVulnerabilityAlertConnection vulnerabilityAlerts) { this.vulnerabilityAlerts = vulnerabilityAlerts; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of users watching the repository.")
    private com.zzw.github.graphql.schema.objects.UserConnection watchers;
    public com.zzw.github.graphql.schema.objects.UserConnection getWatchers() { return this.watchers; }
    public void setWatchers(com.zzw.github.graphql.schema.objects.UserConnection watchers) { this.watchers = watchers; }

    @Description("Returns the code of conduct for this repository")
    private com.zzw.github.graphql.schema.objects.CodeOfConduct codeOfConduct;
    public com.zzw.github.graphql.schema.objects.CodeOfConduct getCodeOfConduct() { return this.codeOfConduct; }
    public void setCodeOfConduct(com.zzw.github.graphql.schema.objects.CodeOfConduct codeOfConduct) { this.codeOfConduct = codeOfConduct; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @Description("The Ref associated with the repository's default branch.")
    private com.zzw.github.graphql.schema.objects.Ref defaultBranchRef;
    public com.zzw.github.graphql.schema.objects.Ref getDefaultBranchRef() { return this.defaultBranchRef; }
    public void setDefaultBranchRef(com.zzw.github.graphql.schema.objects.Ref defaultBranchRef) { this.defaultBranchRef = defaultBranchRef; }

    @Description("The description of the repository.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    @Description("The description of the repository rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML descriptionHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getDescriptionHTML() { return this.descriptionHTML; }
    public void setDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML descriptionHTML) { this.descriptionHTML = descriptionHTML; }

    @Description("The number of kilobytes this repository occupies on disk.")
    private com.zzw.github.graphql.schema.scalars.Int diskUsage;
    public com.zzw.github.graphql.schema.scalars.Int getDiskUsage() { return this.diskUsage; }
    public void setDiskUsage(com.zzw.github.graphql.schema.scalars.Int diskUsage) { this.diskUsage = diskUsage; }

    @NonNull("!")
    @Description("Returns how many forks there are of this repository in the whole network.")
    private com.zzw.github.graphql.schema.scalars.Int forkCount;
    public com.zzw.github.graphql.schema.scalars.Int getForkCount() { return this.forkCount; }
    public void setForkCount(com.zzw.github.graphql.schema.scalars.Int forkCount) { this.forkCount = forkCount; }

    @NonNull("!")
    @Description("Indicates if the repository has issues feature enabled.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasIssuesEnabled;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasIssuesEnabled() { return this.hasIssuesEnabled; }
    public void setHasIssuesEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasIssuesEnabled) { this.hasIssuesEnabled = hasIssuesEnabled; }

    @NonNull("!")
    @Description("Indicates if the repository has wiki feature enabled.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasWikiEnabled;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasWikiEnabled() { return this.hasWikiEnabled; }
    public void setHasWikiEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasWikiEnabled) { this.hasWikiEnabled = hasWikiEnabled; }

    @Description("The repository's URL.")
    private com.zzw.github.graphql.schema.scalars.URI homepageUrl;
    public com.zzw.github.graphql.schema.scalars.URI getHomepageUrl() { return this.homepageUrl; }
    public void setHomepageUrl(com.zzw.github.graphql.schema.scalars.URI homepageUrl) { this.homepageUrl = homepageUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Indicates if the repository is unmaintained.")
    private com.zzw.github.graphql.schema.scalars.Boolean isArchived;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsArchived() { return this.isArchived; }
    public void setIsArchived(com.zzw.github.graphql.schema.scalars.Boolean isArchived) { this.isArchived = isArchived; }

    @NonNull("!")
    @Description("Identifies if the repository is a fork.")
    private com.zzw.github.graphql.schema.scalars.Boolean isFork;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsFork() { return this.isFork; }
    public void setIsFork(com.zzw.github.graphql.schema.scalars.Boolean isFork) { this.isFork = isFork; }

    @NonNull("!")
    @Description("Indicates if the repository has been locked or not.")
    private com.zzw.github.graphql.schema.scalars.Boolean isLocked;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsLocked() { return this.isLocked; }
    public void setIsLocked(com.zzw.github.graphql.schema.scalars.Boolean isLocked) { this.isLocked = isLocked; }

    @NonNull("!")
    @Description("Identifies if the repository is a mirror.")
    private com.zzw.github.graphql.schema.scalars.Boolean isMirror;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsMirror() { return this.isMirror; }
    public void setIsMirror(com.zzw.github.graphql.schema.scalars.Boolean isMirror) { this.isMirror = isMirror; }

    @NonNull("!")
    @Description("Identifies if the repository is private.")
    private com.zzw.github.graphql.schema.scalars.Boolean isPrivate;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPrivate() { return this.isPrivate; }
    public void setIsPrivate(com.zzw.github.graphql.schema.scalars.Boolean isPrivate) { this.isPrivate = isPrivate; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The number for the issue to be returned.")),
    })
    @Description("Returns a single issue from the current repository by number.")
    private com.zzw.github.graphql.schema.objects.Issue issue;
    public com.zzw.github.graphql.schema.objects.Issue getIssue() { return this.issue; }
    public void setIssue(com.zzw.github.graphql.schema.objects.Issue issue) { this.issue = issue; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The number for the issue to be returned.")),
    })
    @Description("Returns a single issue-like object from the current repository by number.")
    private com.zzw.github.graphql.schema.unions.IssueOrPullRequest issueOrPullRequest;
    public com.zzw.github.graphql.schema.unions.IssueOrPullRequest getIssueOrPullRequest() { return this.issueOrPullRequest; }
    public void setIssueOrPullRequest(com.zzw.github.graphql.schema.unions.IssueOrPullRequest issueOrPullRequest) { this.issueOrPullRequest = issueOrPullRequest; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("Label name")),
    })
    @Description("Returns a single label by name")
    private com.zzw.github.graphql.schema.objects.Label label;
    public com.zzw.github.graphql.schema.objects.Label getLabel() { return this.label; }
    public void setLabel(com.zzw.github.graphql.schema.objects.Label label) { this.label = label; }

    @Description("The license associated with the repository")
    private com.zzw.github.graphql.schema.objects.License licenseInfo;
    public com.zzw.github.graphql.schema.objects.License getLicenseInfo() { return this.licenseInfo; }
    public void setLicenseInfo(com.zzw.github.graphql.schema.objects.License licenseInfo) { this.licenseInfo = licenseInfo; }

    @Description("The reason the repository has been locked.")
    private com.zzw.github.graphql.schema.enums.RepositoryLockReason lockReason;
    public com.zzw.github.graphql.schema.enums.RepositoryLockReason getLockReason() { return this.lockReason; }
    public void setLockReason(com.zzw.github.graphql.schema.enums.RepositoryLockReason lockReason) { this.lockReason = lockReason; }

    @NonNull("!")
    @Description("Whether or not PRs are merged with a merge commit on this repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean mergeCommitAllowed;
    public com.zzw.github.graphql.schema.scalars.Boolean getMergeCommitAllowed() { return this.mergeCommitAllowed; }
    public void setMergeCommitAllowed(com.zzw.github.graphql.schema.scalars.Boolean mergeCommitAllowed) { this.mergeCommitAllowed = mergeCommitAllowed; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The number for the milestone to be returned.")),
    })
    @Description("Returns a single milestone from the current repository by number.")
    private com.zzw.github.graphql.schema.objects.Milestone milestone;
    public com.zzw.github.graphql.schema.objects.Milestone getMilestone() { return this.milestone; }
    public void setMilestone(com.zzw.github.graphql.schema.objects.Milestone milestone) { this.milestone = milestone; }

    @Description("The repository's original mirror URL.")
    private com.zzw.github.graphql.schema.scalars.URI mirrorUrl;
    public com.zzw.github.graphql.schema.scalars.URI getMirrorUrl() { return this.mirrorUrl; }
    public void setMirrorUrl(com.zzw.github.graphql.schema.scalars.URI mirrorUrl) { this.mirrorUrl = mirrorUrl; }

    @NonNull("!")
    @Description("The name of the repository.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The repository's name with owner.")
    private com.zzw.github.graphql.schema.scalars.String nameWithOwner;
    public com.zzw.github.graphql.schema.scalars.String getNameWithOwner() { return this.nameWithOwner; }
    public void setNameWithOwner(com.zzw.github.graphql.schema.scalars.String nameWithOwner) { this.nameWithOwner = nameWithOwner; }

    @Arguments({
        @Argument(name="expression", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("A Git revision expression suitable for rev-parse")),
        @Argument(name="oid", type="com.zzw.github.graphql.schema.scalars.GitObjectID", nonNull=@NonNull(""), description=@Description("The Git object ID")),
    })
    @Description("A Git object in the repository")
    private com.zzw.github.graphql.schema.interfaces.GitObject object;
    public com.zzw.github.graphql.schema.interfaces.GitObject getObject() { return this.object; }
    public void setObject(com.zzw.github.graphql.schema.interfaces.GitObject object) { this.object = object; }

    @NonNull("!")
    @Description("The User owner of the repository.")
    private com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner;
    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getOwner() { return this.owner; }
    public void setOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner) { this.owner = owner; }

    @Description("The repository parent, if this is a fork.")
    private com.zzw.github.graphql.schema.objects.Repository parent;
    public com.zzw.github.graphql.schema.objects.Repository getParent() { return this.parent; }
    public void setParent(com.zzw.github.graphql.schema.objects.Repository parent) { this.parent = parent; }

    @Description("The primary language of the repository's code.")
    private com.zzw.github.graphql.schema.objects.Language primaryLanguage;
    public com.zzw.github.graphql.schema.objects.Language getPrimaryLanguage() { return this.primaryLanguage; }
    public void setPrimaryLanguage(com.zzw.github.graphql.schema.objects.Language primaryLanguage) { this.primaryLanguage = primaryLanguage; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The project number to find.")),
    })
    @Description("Find project by number.")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }

    @NonNull("!")
    @Description("The HTTP path listing repository's projects")
    private com.zzw.github.graphql.schema.scalars.URI projectsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getProjectsResourcePath() { return this.projectsResourcePath; }
    public void setProjectsResourcePath(com.zzw.github.graphql.schema.scalars.URI projectsResourcePath) { this.projectsResourcePath = projectsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL listing repository's projects")
    private com.zzw.github.graphql.schema.scalars.URI projectsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getProjectsUrl() { return this.projectsUrl; }
    public void setProjectsUrl(com.zzw.github.graphql.schema.scalars.URI projectsUrl) { this.projectsUrl = projectsUrl; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The number for the pull request to be returned.")),
    })
    @Description("Returns a single pull request from the current repository by number.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @Description("Identifies when the repository was last pushed to.")
    private com.zzw.github.graphql.schema.scalars.DateTime pushedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getPushedAt() { return this.pushedAt; }
    public void setPushedAt(com.zzw.github.graphql.schema.scalars.DateTime pushedAt) { this.pushedAt = pushedAt; }

    @NonNull("!")
    @Description("Whether or not rebase-merging is enabled on this repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean rebaseMergeAllowed;
    public com.zzw.github.graphql.schema.scalars.Boolean getRebaseMergeAllowed() { return this.rebaseMergeAllowed; }
    public void setRebaseMergeAllowed(com.zzw.github.graphql.schema.scalars.Boolean rebaseMergeAllowed) { this.rebaseMergeAllowed = rebaseMergeAllowed; }

    @Arguments({
        @Argument(name="qualifiedName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The ref to retrieve. Fully qualified matches are checked in order (")),
    })
    @Description("Fetch a given ref from the repository")
    private com.zzw.github.graphql.schema.objects.Ref ref;
    public com.zzw.github.graphql.schema.objects.Ref getRef() { return this.ref; }
    public void setRef(com.zzw.github.graphql.schema.objects.Ref ref) { this.ref = ref; }

    @Arguments({
        @Argument(name="tagName", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The name of the Tag the Release was created from")),
    })
    @Description("Lookup a single release given various criteria.")
    private com.zzw.github.graphql.schema.objects.Release release;
    public com.zzw.github.graphql.schema.objects.Release getRelease() { return this.release; }
    public void setRelease(com.zzw.github.graphql.schema.objects.Release release) { this.release = release; }

    @NonNull("!")
    @Description("The HTTP path for this repository")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Arguments({
        @Argument(name="limit", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("How many characters to return.")),
    })
    @NonNull("!")
    @Description("A description of the repository, rendered to HTML without any links in it.")
    private com.zzw.github.graphql.schema.scalars.HTML shortDescriptionHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getShortDescriptionHTML() { return this.shortDescriptionHTML; }
    public void setShortDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML shortDescriptionHTML) { this.shortDescriptionHTML = shortDescriptionHTML; }

    @NonNull("!")
    @Description("Whether or not squash-merging is enabled on this repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean squashMergeAllowed;
    public com.zzw.github.graphql.schema.scalars.Boolean getSquashMergeAllowed() { return this.squashMergeAllowed; }
    public void setSquashMergeAllowed(com.zzw.github.graphql.schema.scalars.Boolean squashMergeAllowed) { this.squashMergeAllowed = squashMergeAllowed; }

    @NonNull("!")
    @Description("The SSH URL to clone this repository")
    private com.zzw.github.graphql.schema.scalars.GitSSHRemote sshUrl;
    public com.zzw.github.graphql.schema.scalars.GitSSHRemote getSshUrl() { return this.sshUrl; }
    public void setSshUrl(com.zzw.github.graphql.schema.scalars.GitSSHRemote sshUrl) { this.sshUrl = sshUrl; }

    @Description("Temporary authentication token for cloning this repository.")
    private com.zzw.github.graphql.schema.scalars.String tempCloneToken;
    public com.zzw.github.graphql.schema.scalars.String getTempCloneToken() { return this.tempCloneToken; }
    public void setTempCloneToken(com.zzw.github.graphql.schema.scalars.String tempCloneToken) { this.tempCloneToken = tempCloneToken; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this repository")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Indicates whether the viewer has admin permissions on this repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanAdminister() { return this.viewerCanAdminister; }
    public void setViewerCanAdminister(com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister) { this.viewerCanAdminister = viewerCanAdminister; }

    @NonNull("!")
    @Description("Can the current viewer create new projects on this owner.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateProjects;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanCreateProjects() { return this.viewerCanCreateProjects; }
    public void setViewerCanCreateProjects(com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateProjects) { this.viewerCanCreateProjects = viewerCanCreateProjects; }

    @NonNull("!")
    @Description("Check if the viewer is able to change their subscription status for the repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanSubscribe() { return this.viewerCanSubscribe; }
    public void setViewerCanSubscribe(com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe) { this.viewerCanSubscribe = viewerCanSubscribe; }

    @NonNull("!")
    @Description("Indicates whether the viewer can update the topics of this repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdateTopics;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanUpdateTopics() { return this.viewerCanUpdateTopics; }
    public void setViewerCanUpdateTopics(com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdateTopics) { this.viewerCanUpdateTopics = viewerCanUpdateTopics; }

    @NonNull("!")
    @Description("Returns a boolean indicating whether the viewing user has starred this starrable.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasStarred;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasStarred() { return this.viewerHasStarred; }
    public void setViewerHasStarred(com.zzw.github.graphql.schema.scalars.Boolean viewerHasStarred) { this.viewerHasStarred = viewerHasStarred; }

    @Description("The users permission level on the repository. Will return null if authenticated as an GitHub App.")
    private com.zzw.github.graphql.schema.enums.RepositoryPermission viewerPermission;
    public com.zzw.github.graphql.schema.enums.RepositoryPermission getViewerPermission() { return this.viewerPermission; }
    public void setViewerPermission(com.zzw.github.graphql.schema.enums.RepositoryPermission viewerPermission) { this.viewerPermission = viewerPermission; }

    @Description("Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.")
    private com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription;
    public com.zzw.github.graphql.schema.enums.SubscriptionState getViewerSubscription() { return this.viewerSubscription; }
    public void setViewerSubscription(com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription) { this.viewerSubscription = viewerSubscription; }
}
