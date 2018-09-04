package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An account on GitHub, with one or more owners, that has repositories, members and teams.")
public class Organization extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Actor, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.ProjectOwner, com.zzw.github.graphql.schema.interfaces.RegistryPackageOwner, com.zzw.github.graphql.schema.interfaces.RegistryPackageSearch, com.zzw.github.graphql.schema.interfaces.RepositoryOwner, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of users who are members of this organization.")
    private com.zzw.github.graphql.schema.objects.UserConnection members;
    public com.zzw.github.graphql.schema.objects.UserConnection getMembers() { return this.members; }
    public void setMembers(com.zzw.github.graphql.schema.objects.UserConnection members) { this.members = members; }

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
    @Description("A list of repositories this user has pinned to their profile")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection pinnedRepositories;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getPinnedRepositories() { return this.pinnedRepositories; }
    public void setPinnedRepositories(com.zzw.github.graphql.schema.objects.RepositoryConnection pinnedRepositories) { this.pinnedRepositories = pinnedRepositories; }

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
        @Argument(name="affiliations", type="com.zzw.github.graphql.schema.enums.RepositoryAffiliation[]", nonNull=@NonNull(""), description=@Description("Affiliation options for repositories returned from the connection")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("The default value is")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description(".")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="isFork", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="isLocked", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.RepositoryOrder", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they are forks of another repository")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.RepositoryPrivacy", nonNull=@NonNull(""), description=@Description("If non-null, filters repositories according to whether they have been locked")),
    })
    @NonNull("!")
    @Description("A list of repositories that the user owns.")
    private com.zzw.github.graphql.schema.objects.RepositoryConnection repositories;
    public com.zzw.github.graphql.schema.objects.RepositoryConnection getRepositories() { return this.repositories; }
    public void setRepositories(com.zzw.github.graphql.schema.objects.RepositoryConnection repositories) { this.repositories = repositories; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="ldapMapped", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamOrder", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="privacy", type="com.zzw.github.graphql.schema.enums.TeamPrivacy", nonNull=@NonNull(""), description=@Description("If true, filters teams that are mapped to an LDAP Group (Enterprise only)")),
        @Argument(name="query", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Ordering options for teams returned from the connection")),
        @Argument(name="role", type="com.zzw.github.graphql.schema.enums.TeamRole", nonNull=@NonNull(""), description=@Description("If non-null, filters teams according to privacy")),
        @Argument(name="rootTeamsOnly", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If non-null, filters teams with query on team name and team slug")),
        @Argument(name="userLogins", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("If non-null, filters teams according to whether the viewer is an admin or member on team")),
    })
    @NonNull("!")
    @Description("A list of teams in this organization.")
    private com.zzw.github.graphql.schema.objects.TeamConnection teams;
    public com.zzw.github.graphql.schema.objects.TeamConnection getTeams() { return this.teams; }
    public void setTeams(com.zzw.github.graphql.schema.objects.TeamConnection teams) { this.teams = teams; }

    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size of the resulting square image.")),
    })
    @NonNull("!")
    @Description("A URL pointing to the organization's public avatar.")
    private com.zzw.github.graphql.schema.scalars.URI avatarUrl;
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl() { return this.avatarUrl; }
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl) { this.avatarUrl = avatarUrl; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @Description("The organization's public profile description.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("The organization's public email.")
    private com.zzw.github.graphql.schema.scalars.String email;
    public com.zzw.github.graphql.schema.scalars.String getEmail() { return this.email; }
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email) { this.email = email; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether the organization has verified its profile email and website.")
    private com.zzw.github.graphql.schema.scalars.Boolean isVerified;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsVerified() { return this.isVerified; }
    public void setIsVerified(com.zzw.github.graphql.schema.scalars.Boolean isVerified) { this.isVerified = isVerified; }

    @Description("The organization's public profile location.")
    private com.zzw.github.graphql.schema.scalars.String location;
    public com.zzw.github.graphql.schema.scalars.String getLocation() { return this.location; }
    public void setLocation(com.zzw.github.graphql.schema.scalars.String location) { this.location = location; }

    @NonNull("!")
    @Description("The organization's login name.")
    private com.zzw.github.graphql.schema.scalars.String login;
    public com.zzw.github.graphql.schema.scalars.String getLogin() { return this.login; }
    public void setLogin(com.zzw.github.graphql.schema.scalars.String login) { this.login = login; }

    @Description("The organization's public profile name.")
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

    @Description("The billing email for the organization.")
    private com.zzw.github.graphql.schema.scalars.String organizationBillingEmail;
    public com.zzw.github.graphql.schema.scalars.String getOrganizationBillingEmail() { return this.organizationBillingEmail; }
    public void setOrganizationBillingEmail(com.zzw.github.graphql.schema.scalars.String organizationBillingEmail) { this.organizationBillingEmail = organizationBillingEmail; }

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The project number to find.")),
    })
    @Description("Find project by number.")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }

    @NonNull("!")
    @Description("The HTTP path listing organization's projects")
    private com.zzw.github.graphql.schema.scalars.URI projectsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getProjectsResourcePath() { return this.projectsResourcePath; }
    public void setProjectsResourcePath(com.zzw.github.graphql.schema.scalars.URI projectsResourcePath) { this.projectsResourcePath = projectsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL listing organization's projects")
    private com.zzw.github.graphql.schema.scalars.URI projectsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getProjectsUrl() { return this.projectsUrl; }
    public void setProjectsUrl(com.zzw.github.graphql.schema.scalars.URI projectsUrl) { this.projectsUrl = projectsUrl; }

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

    @Description("The Organization's SAML Identity Providers")
    private com.zzw.github.graphql.schema.objects.OrganizationIdentityProvider samlIdentityProvider;
    public com.zzw.github.graphql.schema.objects.OrganizationIdentityProvider getSamlIdentityProvider() { return this.samlIdentityProvider; }
    public void setSamlIdentityProvider(com.zzw.github.graphql.schema.objects.OrganizationIdentityProvider samlIdentityProvider) { this.samlIdentityProvider = samlIdentityProvider; }

    @Arguments({
        @Argument(name="slug", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The name or slug of the team to find.")),
    })
    @Description("Find an organization's team by its slug.")
    private com.zzw.github.graphql.schema.objects.Team team;
    public com.zzw.github.graphql.schema.objects.Team getTeam() { return this.team; }
    public void setTeam(com.zzw.github.graphql.schema.objects.Team team) { this.team = team; }

    @NonNull("!")
    @Description("The HTTP path listing organization's teams")
    private com.zzw.github.graphql.schema.scalars.URI teamsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsResourcePath() { return this.teamsResourcePath; }
    public void setTeamsResourcePath(com.zzw.github.graphql.schema.scalars.URI teamsResourcePath) { this.teamsResourcePath = teamsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL listing organization's teams")
    private com.zzw.github.graphql.schema.scalars.URI teamsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsUrl() { return this.teamsUrl; }
    public void setTeamsUrl(com.zzw.github.graphql.schema.scalars.URI teamsUrl) { this.teamsUrl = teamsUrl; }

    @NonNull("!")
    @Description("The HTTP URL for this user")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Organization is adminable by the viewer.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanAdminister() { return this.viewerCanAdminister; }
    public void setViewerCanAdminister(com.zzw.github.graphql.schema.scalars.Boolean viewerCanAdminister) { this.viewerCanAdminister = viewerCanAdminister; }

    @NonNull("!")
    @Description("Can the current viewer create new projects on this owner.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateProjects;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanCreateProjects() { return this.viewerCanCreateProjects; }
    public void setViewerCanCreateProjects(com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateProjects) { this.viewerCanCreateProjects = viewerCanCreateProjects; }

    @NonNull("!")
    @Description("Viewer can create repositories on this organization")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateRepositories;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanCreateRepositories() { return this.viewerCanCreateRepositories; }
    public void setViewerCanCreateRepositories(com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateRepositories) { this.viewerCanCreateRepositories = viewerCanCreateRepositories; }

    @NonNull("!")
    @Description("Viewer can create teams on this organization.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateTeams;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanCreateTeams() { return this.viewerCanCreateTeams; }
    public void setViewerCanCreateTeams(com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateTeams) { this.viewerCanCreateTeams = viewerCanCreateTeams; }

    @NonNull("!")
    @Description("Viewer is an active member of this organization.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerIsAMember;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerIsAMember() { return this.viewerIsAMember; }
    public void setViewerIsAMember(com.zzw.github.graphql.schema.scalars.Boolean viewerIsAMember) { this.viewerIsAMember = viewerIsAMember; }

    @Description("The organization's public profile URL.")
    private com.zzw.github.graphql.schema.scalars.URI websiteUrl;
    public com.zzw.github.graphql.schema.scalars.URI getWebsiteUrl() { return this.websiteUrl; }
    public void setWebsiteUrl(com.zzw.github.graphql.schema.scalars.URI websiteUrl) { this.websiteUrl = websiteUrl; }
}
