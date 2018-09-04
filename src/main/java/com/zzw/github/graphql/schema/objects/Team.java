package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A team of users in an organization.")
public class Team extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Subscribable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of teams that are ancestors of this team.")
    private com.zzw.github.graphql.schema.objects.TeamConnection ancestors;
    public com.zzw.github.graphql.schema.objects.TeamConnection getAncestors() { return this.ancestors; }
    public void setAncestors(com.zzw.github.graphql.schema.objects.TeamConnection ancestors) { this.ancestors = ancestors; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="immediateOnly", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Whether to list immediate child teams or all descendant child teams.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamOrder", nonNull=@NonNull(""), description=@Description("The default value is")),
        @Argument(name="userLogins", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description(".")),
    })
    @NonNull("!")
    @Description("List of child teams belonging to this team")
    private com.zzw.github.graphql.schema.objects.TeamConnection childTeams;
    public com.zzw.github.graphql.schema.objects.TeamConnection getChildTeams() { return this.childTeams; }
    public void setChildTeams(com.zzw.github.graphql.schema.objects.TeamConnection childTeams) { this.childTeams = childTeams; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="isPinned", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("If provided, filters discussions according to whether or not they are pinned.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamDiscussionOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @NonNull("!")
    @Description("A list of team discussions.")
    private com.zzw.github.graphql.schema.objects.TeamDiscussionConnection discussions;
    public com.zzw.github.graphql.schema.objects.TeamDiscussionConnection getDiscussions() { return this.discussions; }
    public void setDiscussions(com.zzw.github.graphql.schema.objects.TeamDiscussionConnection discussions) { this.discussions = discussions; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("A list of pending invitations for users to this team")
    private com.zzw.github.graphql.schema.objects.OrganizationInvitationConnection invitations;
    public com.zzw.github.graphql.schema.objects.OrganizationInvitationConnection getInvitations() { return this.invitations; }
    public void setInvitations(com.zzw.github.graphql.schema.objects.OrganizationInvitationConnection invitations) { this.invitations = invitations; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="membership", type="com.zzw.github.graphql.schema.enums.TeamMembershipType", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamMemberOrder", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="query", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Filter by membership type")),
        @Argument(name="role", type="com.zzw.github.graphql.schema.enums.TeamMemberRole", nonNull=@NonNull(""), description=@Description("The default value is")),
    })
    @NonNull("!")
    @Description("A list of users who are members of this team.")
    private com.zzw.github.graphql.schema.objects.TeamMemberConnection members;
    public com.zzw.github.graphql.schema.objects.TeamMemberConnection getMembers() { return this.members; }
    public void setMembers(com.zzw.github.graphql.schema.objects.TeamMemberConnection members) { this.members = members; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamRepositoryOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="query", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of repositories this team has access to.")
    private com.zzw.github.graphql.schema.objects.TeamRepositoryConnection repositories;
    public com.zzw.github.graphql.schema.objects.TeamRepositoryConnection getRepositories() { return this.repositories; }
    public void setRepositories(com.zzw.github.graphql.schema.objects.TeamRepositoryConnection repositories) { this.repositories = repositories; }

    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size in pixels of the resulting square image.")),
    })
    @Description("A URL pointing to the team's avatar.")
    private com.zzw.github.graphql.schema.scalars.URI avatarUrl;
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl() { return this.avatarUrl; }
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl) { this.avatarUrl = avatarUrl; }

    @NonNull("!")
    @Description("The slug corresponding to the organization and team.")
    private com.zzw.github.graphql.schema.scalars.String combinedSlug;
    public com.zzw.github.graphql.schema.scalars.String getCombinedSlug() { return this.combinedSlug; }
    public void setCombinedSlug(com.zzw.github.graphql.schema.scalars.String combinedSlug) { this.combinedSlug = combinedSlug; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The description of the team.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The sequence number of the discussion to find.")),
    })
    @Description("Find a team discussion by its number.")
    private com.zzw.github.graphql.schema.objects.TeamDiscussion discussion;
    public com.zzw.github.graphql.schema.objects.TeamDiscussion getDiscussion() { return this.discussion; }
    public void setDiscussion(com.zzw.github.graphql.schema.objects.TeamDiscussion discussion) { this.discussion = discussion; }

    @NonNull("!")
    @Description("The HTTP path for team discussions")
    private com.zzw.github.graphql.schema.scalars.URI discussionsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getDiscussionsResourcePath() { return this.discussionsResourcePath; }
    public void setDiscussionsResourcePath(com.zzw.github.graphql.schema.scalars.URI discussionsResourcePath) { this.discussionsResourcePath = discussionsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for team discussions")
    private com.zzw.github.graphql.schema.scalars.URI discussionsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getDiscussionsUrl() { return this.discussionsUrl; }
    public void setDiscussionsUrl(com.zzw.github.graphql.schema.scalars.URI discussionsUrl) { this.discussionsUrl = discussionsUrl; }

    @NonNull("!")
    @Description("The HTTP path for editing this team")
    private com.zzw.github.graphql.schema.scalars.URI editTeamResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getEditTeamResourcePath() { return this.editTeamResourcePath; }
    public void setEditTeamResourcePath(com.zzw.github.graphql.schema.scalars.URI editTeamResourcePath) { this.editTeamResourcePath = editTeamResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for editing this team")
    private com.zzw.github.graphql.schema.scalars.URI editTeamUrl;
    public com.zzw.github.graphql.schema.scalars.URI getEditTeamUrl() { return this.editTeamUrl; }
    public void setEditTeamUrl(com.zzw.github.graphql.schema.scalars.URI editTeamUrl) { this.editTeamUrl = editTeamUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The HTTP path for the team' members")
    private com.zzw.github.graphql.schema.scalars.URI membersResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getMembersResourcePath() { return this.membersResourcePath; }
    public void setMembersResourcePath(com.zzw.github.graphql.schema.scalars.URI membersResourcePath) { this.membersResourcePath = membersResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for the team' members")
    private com.zzw.github.graphql.schema.scalars.URI membersUrl;
    public com.zzw.github.graphql.schema.scalars.URI getMembersUrl() { return this.membersUrl; }
    public void setMembersUrl(com.zzw.github.graphql.schema.scalars.URI membersUrl) { this.membersUrl = membersUrl; }

    @NonNull("!")
    @Description("The name of the team.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The HTTP path creating a new team")
    private com.zzw.github.graphql.schema.scalars.URI newTeamResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getNewTeamResourcePath() { return this.newTeamResourcePath; }
    public void setNewTeamResourcePath(com.zzw.github.graphql.schema.scalars.URI newTeamResourcePath) { this.newTeamResourcePath = newTeamResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL creating a new team")
    private com.zzw.github.graphql.schema.scalars.URI newTeamUrl;
    public com.zzw.github.graphql.schema.scalars.URI getNewTeamUrl() { return this.newTeamUrl; }
    public void setNewTeamUrl(com.zzw.github.graphql.schema.scalars.URI newTeamUrl) { this.newTeamUrl = newTeamUrl; }

    @NonNull("!")
    @Description("The organization that owns this team.")
    private com.zzw.github.graphql.schema.objects.Organization organization;
    public com.zzw.github.graphql.schema.objects.Organization getOrganization() { return this.organization; }
    public void setOrganization(com.zzw.github.graphql.schema.objects.Organization organization) { this.organization = organization; }

    @Description("The parent team of the team.")
    private com.zzw.github.graphql.schema.objects.Team parentTeam;
    public com.zzw.github.graphql.schema.objects.Team getParentTeam() { return this.parentTeam; }
    public void setParentTeam(com.zzw.github.graphql.schema.objects.Team parentTeam) { this.parentTeam = parentTeam; }

    @NonNull("!")
    @Description("The level of privacy the team has.")
    private com.zzw.github.graphql.schema.enums.TeamPrivacy privacy;
    public com.zzw.github.graphql.schema.enums.TeamPrivacy getPrivacy() { return this.privacy; }
    public void setPrivacy(com.zzw.github.graphql.schema.enums.TeamPrivacy privacy) { this.privacy = privacy; }

    @NonNull("!")
    @Description("The HTTP path for this team's repositories")
    private com.zzw.github.graphql.schema.scalars.URI repositoriesResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getRepositoriesResourcePath() { return this.repositoriesResourcePath; }
    public void setRepositoriesResourcePath(com.zzw.github.graphql.schema.scalars.URI repositoriesResourcePath) { this.repositoriesResourcePath = repositoriesResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for this team's repositories")
    private com.zzw.github.graphql.schema.scalars.URI repositoriesUrl;
    public com.zzw.github.graphql.schema.scalars.URI getRepositoriesUrl() { return this.repositoriesUrl; }
    public void setRepositoriesUrl(com.zzw.github.graphql.schema.scalars.URI repositoriesUrl) { this.repositoriesUrl = repositoriesUrl; }

    @NonNull("!")
    @Description("The HTTP path for this team")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("The slug corresponding to the team.")
    private com.zzw.github.graphql.schema.scalars.String slug;
    public com.zzw.github.graphql.schema.scalars.String getSlug() { return this.slug; }
    public void setSlug(com.zzw.github.graphql.schema.scalars.String slug) { this.slug = slug; }

    @NonNull("!")
    @Description("The HTTP path for this team's teams")
    private com.zzw.github.graphql.schema.scalars.URI teamsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsResourcePath() { return this.teamsResourcePath; }
    public void setTeamsResourcePath(com.zzw.github.graphql.schema.scalars.URI teamsResourcePath) { this.teamsResourcePath = teamsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for this team's teams")
    private com.zzw.github.graphql.schema.scalars.URI teamsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsUrl() { return this.teamsUrl; }
    public void setTeamsUrl(com.zzw.github.graphql.schema.scalars.URI teamsUrl) { this.teamsUrl = teamsUrl; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this team")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Team is adminable by the viewer.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanAdminister() { return this.viewerCanAdminister; }
    public void setViewerCanAdminister(com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister) { this.viewerCanAdminister = viewerCanAdminister; }

    @NonNull("!")
    @Description("Check if the viewer is able to change their subscription status for the repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanSubscribe() { return this.viewerCanSubscribe; }
    public void setViewerCanSubscribe(com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe) { this.viewerCanSubscribe = viewerCanSubscribe; }

    @Description("Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.")
    private com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription;
    public com.zzw.github.graphql.schema.enums.SubscriptionState getViewerSubscription() { return this.viewerSubscription; }
    public void setViewerSubscription(com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription) { this.viewerSubscription = viewerSubscription; }
}
