package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A user is an individual's account on GitHub that owns repositories and can make new content.")
public class User extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Actor, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.RegistryPackageOwner, com.zzw.github.graphql.schema.interfaces.RegistryPackageSearch, com.zzw.github.graphql.schema.interfaces.RepositoryOwner, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of commit comments made by this user.")
    private com.zzw.github.graphql.schema.objects.CommitCommentConnection commitComments;
    public com.zzw.github.graphql.schema.objects.CommitCommentConnection getCommitComments() { return this.commitComments; }
    public void setCommitComments(com.zzw.github.graphql.schema.objects.CommitCommentConnection commitComments) { this.commitComments = commitComments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of users the given user is followed by.")
    private com.zzw.github.graphql.schema.objects.FollowerConnection followers;
    public com.zzw.github.graphql.schema.objects.FollowerConnection getFollowers() { return this.followers; }
    public void setFollowers(com.zzw.github.graphql.schema.objects.FollowerConnection followers) { this.followers = followers; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of users the given user is following.")
    private com.zzw.github.graphql.schema.objects.FollowingConnection following;
    public com.zzw.github.graphql.schema.objects.FollowingConnection getFollowing() { return this.following; }
    public void setFollowing(com.zzw.github.graphql.schema.objects.FollowingConnection following) { this.following = following; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of gist comments made by this user.")
    private com.zzw.github.graphql.schema.objects.GistCommentConnection gistComments;
    public com.zzw.github.graphql.schema.objects.GistCommentConnection getGistComments() { return this.gistComments; }
    public void setGistComments(com.zzw.github.graphql.schema.objects.GistCommentConnection gistComments) { this.gistComments = gistComments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.GistOrder", nonNull=@NonNull(""), description=@Description("Ordering options for gists returned from the connection")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.GistPrivacy", nonNull=@NonNull(""), description=@Description("Filters Gists according to privacy.")),
    })
    @NonNull("!")
    @Description("A list of the Gists the user has created.")
    private com.zzw.github.graphql.schema.objects.GistConnection gists;
    public com.zzw.github.graphql.schema.objects.GistConnection getGists() { return this.gists; }
    public void setGists(com.zzw.github.graphql.schema.objects.GistConnection gists) { this.gists = gists; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of issue comments made by this user.")
    private com.zzw.github.graphql.schema.objects.IssueCommentConnection issueComments;
    public com.zzw.github.graphql.schema.objects.IssueCommentConnection getIssueComments() { return this.issueComments; }
    public void setIssueComments(com.zzw.github.graphql.schema.objects.IssueCommentConnection issueComments) { this.issueComments = issueComments; }

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
    @Description("A list of issues associated with this user.")
    private com.zzw.github.graphql.schema.objects.IssueConnection issues;
    public com.zzw.github.graphql.schema.objects.IssueConnection getIssues() { return this.issues; }
    public void setIssues(com.zzw.github.graphql.schema.objects.IssueConnection issues) { this.issues = issues; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of organizations the user belongs to.")
    private com.zzw.github.graphql.schema.objects.OrganizationConnection organizations;
    public com.zzw.github.graphql.schema.objects.OrganizationConnection getOrganizations() { return this.organizations; }
    public void setOrganizations(com.zzw.github.graphql.schema.objects.OrganizationConnection organizations) { this.organizations = organizations; }

    @Arguments({
        @Argument(name="affiliations", type="com.zzw.github.graphql.schema.enums.RepositoryAffiliation[]", nonNull=@NonNull(""), description=@Description("Affiliation options for repositories returned from the connection")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("Ordering options for repositories returned from the connection")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to privacy")),
    })
    @NonNull("!")
    @Description("A list of repositories this user has pinned to their profile")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection pinnedRepositories;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getPinnedRepositories() { return this.pinnedRepositories; }
    public void setPinnedRepositories(com.zzw.github.graphql.schema.objects.RepositoryConnection pinnedRepositories) { this.pinnedRepositories = pinnedRepositories; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of public keys associated with this user.")
    private com.zzw.github.graphql.schema.objects.PublicKeyConnection publicKeys;
    public com.zzw.github.graphql.schema.objects.PublicKeyConnection getPublicKeys() { return this.publicKeys; }
    public void setPublicKeys(com.zzw.github.graphql.schema.objects.PublicKeyConnection publicKeys) { this.publicKeys = publicKeys; }

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
    @Description("A list of pull requests associated with this user.")
    private com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests;
    public com.zzw.github.graphql.schema.objects.PullRequestConnection getPullRequests() { return this.pullRequests; }
    public void setPullRequests(com.zzw.github.graphql.schema.objects.PullRequestConnection pullRequests) { this.pullRequests = pullRequests; }

    @Arguments({
        @Argument(name="affiliations", type="com.zzw.github.graphql.schema.enums.RepositoryAffiliation[]", nonNull=@NonNull(""), description=@Description("Affiliation options for repositories returned from the connection")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="isFork", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they are forks of another repository")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("Ordering options for repositories returned from the connection")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to privacy")),
    })
    @NonNull("!")
    @Description("A list of repositories that the user owns.")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection repositories;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getRepositories() { return this.repositories; }
    public void setRepositories(com.zzw.github.graphql.schema.objects.RepositoryConnection repositories) { this.repositories = repositories; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="contributionTypes", type="com.zzw.github.graphql.schema.enums.RepositoryContributionType[]", nonNull=@NonNull(""), description=@Description("If non-null, include only the specified types of contributions. The GitHub.com UI uses [COMMIT, ISSUE, PULL_REQUEST, REPOSITORY]")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="includeUserRepositories", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If true, include user repositories")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("Ordering options for repositories returned from the connection")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to privacy")),
    })
    @NonNull("!")
    @Description("A list of repositories that the user recently contributed to.")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection repositoriesContributedTo;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getRepositoriesContributedTo() { return this.repositoriesContributedTo; }
    public void setRepositoriesContributedTo(com.zzw.github.graphql.schema.objects.RepositoryConnection repositoriesContributedTo) { this.repositoriesContributedTo = repositoriesContributedTo; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.StarOrder", nonNull=@NonNull(""), description=@Description("Order for connection")),
        @Argument(name="ownedByViewer", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Filters starred repositories to only return repositories owned by the viewer.")),
    })
    @NonNull("!")
    @Description("Repositories the user has starred.")
    private com.zzw.github.graphql.schema.objects.StarredRepositoryConnection starredRepositories;
    public com.zzw.github.graphql.schema.objects.StarredRepositoryConnection getStarredRepositories() { return this.starredRepositories; }
    public void setStarredRepositories(com.zzw.github.graphql.schema.objects.StarredRepositoryConnection starredRepositories) { this.starredRepositories = starredRepositories; }

    @Arguments({
        @Argument(name="affiliations", type="com.zzw.github.graphql.schema.enums.RepositoryAffiliation[]", nonNull=@NonNull(""), description=@Description("Affiliation options for repositories returned from the connection")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("Ordering options for repositories returned from the connection")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to privacy")),
    })
    @NonNull("!")
    @Description("A list of repositories the given user is watching.")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection watching;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getWatching() { return this.watching; }
    public void setWatching(com.zzw.github.graphql.schema.objects.RepositoryConnection watching) { this.watching = watching; }

    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size of the resulting square image.")),
    })
    @NonNull("!")
    @Description("A URL pointing to the user's public avatar.")
    private com.zzw.github.graphql.schema.scalars.URI avatarUrl;
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl() { return this.avatarUrl; }
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl) { this.avatarUrl = avatarUrl; }

    @Description("The user's public profile bio.")
    private com.zzw.github.graphql.schema.scalars.String bio;
    public com.zzw.github.graphql.schema.scalars.String getBio() { return this.bio; }
    public void setBio(com.zzw.github.graphql.schema.scalars.String bio) { this.bio = bio; }

    @NonNull("!")
    @Description("The user's public profile bio as HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bioHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBioHTML() { return this.bioHTML; }
    public void setBioHTML(com.zzw.github.graphql.schema.scalars.HTML bioHTML) { this.bioHTML = bioHTML; }

    @Description("The user's public profile company.")
    private com.zzw.github.graphql.schema.scalars.String company;
    public com.zzw.github.graphql.schema.scalars.String getCompany() { return this.company; }
    public void setCompany(com.zzw.github.graphql.schema.scalars.String company) { this.company = company; }

    @NonNull("!")
    @Description("The user's public profile company as HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML companyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getCompanyHTML() { return this.companyHTML; }
    public void setCompanyHTML(com.zzw.github.graphql.schema.scalars.HTML companyHTML) { this.companyHTML = companyHTML; }

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
    @Description("The user's publicly visible profile email.")
    private com.zzw.github.graphql.schema.scalars.String email;
    public com.zzw.github.graphql.schema.scalars.String getEmail() { return this.email; }
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email) { this.email = email; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The gist name to find.")),
    })
    @Description("Find gist by repo name.")
    private com.zzw.github.graphql.schema.objects.Gist gist;
    public com.zzw.github.graphql.schema.objects.Gist getGist() { return this.gist; }
    public void setGist(com.zzw.github.graphql.schema.objects.Gist gist) { this.gist = gist; }

    @Arguments({
        @Argument(name="primarySubjectId", type="com.zzw.github.graphql.schema.scalars.ID", nonNull=@NonNull(""), description=@Description("The ID of the subject to get the hovercard in the context of")),
    })
    @NonNull("!")
    @Description("The hovercard information for this user in a given context")
    private com.zzw.github.graphql.schema.objects.Hovercard hovercard;
    public com.zzw.github.graphql.schema.objects.Hovercard getHovercard() { return this.hovercard; }
    public void setHovercard(com.zzw.github.graphql.schema.objects.Hovercard hovercard) { this.hovercard = hovercard; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether or not this user is a participant in the GitHub Security Bug Bounty.")
    private com.zzw.github.graphql.schema.scalars.Boolean isBountyHunter;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsBountyHunter() { return this.isBountyHunter; }
    public void setIsBountyHunter(com.zzw.github.graphql.schema.scalars.Boolean isBountyHunter) { this.isBountyHunter = isBountyHunter; }

    @NonNull("!")
    @Description("Whether or not this user is a participant in the GitHub Campus Experts Program.")
    private com.zzw.github.graphql.schema.scalars.Boolean isCampusExpert;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsCampusExpert() { return this.isCampusExpert; }
    public void setIsCampusExpert(com.zzw.github.graphql.schema.scalars.Boolean isCampusExpert) { this.isCampusExpert = isCampusExpert; }

    @NonNull("!")
    @Description("Whether or not this user is a GitHub Developer Program member.")
    private com.zzw.github.graphql.schema.scalars.Boolean isDeveloperProgramMember;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDeveloperProgramMember() { return this.isDeveloperProgramMember; }
    public void setIsDeveloperProgramMember(com.zzw.github.graphql.schema.scalars.Boolean isDeveloperProgramMember) { this.isDeveloperProgramMember = isDeveloperProgramMember; }

    @NonNull("!")
    @Description("Whether or not this user is a GitHub employee.")
    private com.zzw.github.graphql.schema.scalars.Boolean isEmployee;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsEmployee() { return this.isEmployee; }
    public void setIsEmployee(com.zzw.github.graphql.schema.scalars.Boolean isEmployee) { this.isEmployee = isEmployee; }

    @NonNull("!")
    @Description("Whether or not the user has marked themselves as for hire.")
    private com.zzw.github.graphql.schema.scalars.Boolean isHireable;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsHireable() { return this.isHireable; }
    public void setIsHireable(com.zzw.github.graphql.schema.scalars.Boolean isHireable) { this.isHireable = isHireable; }

    @NonNull("!")
    @Description("Whether or not this user is a site administrator.")
    private com.zzw.github.graphql.schema.scalars.Boolean isSiteAdmin;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsSiteAdmin() { return this.isSiteAdmin; }
    public void setIsSiteAdmin(com.zzw.github.graphql.schema.scalars.Boolean isSiteAdmin) { this.isSiteAdmin = isSiteAdmin; }

    @NonNull("!")
    @Description("Whether or not this user is the viewing user.")
    private com.zzw.github.graphql.schema.scalars.Boolean isViewer;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsViewer() { return this.isViewer; }
    public void setIsViewer(com.zzw.github.graphql.schema.scalars.Boolean isViewer) { this.isViewer = isViewer; }

    @Description("The user's public profile location.")
    private com.zzw.github.graphql.schema.scalars.String location;
    public com.zzw.github.graphql.schema.scalars.String getLocation() { return this.location; }
    public void setLocation(com.zzw.github.graphql.schema.scalars.String location) { this.location = location; }

    @NonNull("!")
    @Description("The username used to login.")
    private com.zzw.github.graphql.schema.scalars.String login;
    public com.zzw.github.graphql.schema.scalars.String getLogin() { return this.login; }
    public void setLogin(com.zzw.github.graphql.schema.scalars.String login) { this.login = login; }

    @Description("The user's public profile name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Arguments({
        @Argument(name="login", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The login of the organization to find.")),
    })
    @Description("Find an organization by its login that the user belongs to.")
    private com.zzw.github.graphql.schema.objects.Organization organization;
    public com.zzw.github.graphql.schema.objects.Organization getOrganization() { return this.organization; }
    public void setOrganization(com.zzw.github.graphql.schema.objects.Organization organization) { this.organization = organization; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("Name of Repository to find.")),
    })
    @Description("Find Repository.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this user")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this user")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Whether or not the viewer is able to follow the user.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanFollow;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanFollow() { return this.viewerCanFollow; }
    public void setViewerCanFollow(com.zzw.github.graphql.schema.scalars.Boolean viewerCanFollow) { this.viewerCanFollow = viewerCanFollow; }

    @NonNull("!")
    @Description("Whether or not this user is followed by the viewer.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerIsFollowing;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerIsFollowing() { return this.viewerIsFollowing; }
    public void setViewerIsFollowing(com.zzw.github.graphql.schema.scalars.Boolean viewerIsFollowing) { this.viewerIsFollowing = viewerIsFollowing; }

    @Description("A URL pointing to the user's public website/blog.")
    private com.zzw.github.graphql.schema.scalars.URI websiteUrl;
    public com.zzw.github.graphql.schema.scalars.URI getWebsiteUrl() { return this.websiteUrl; }
    public void setWebsiteUrl(com.zzw.github.graphql.schema.scalars.URI websiteUrl) { this.websiteUrl = websiteUrl; }
}
