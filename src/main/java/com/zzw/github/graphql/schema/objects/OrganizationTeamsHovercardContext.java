package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An organization teams hovercard context")
public class OrganizationTeamsHovercardContext extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.HovercardContext {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("Teams in this organization the user is a member of that are relevant")
    private com.zzw.github.graphql.schema.objects.TeamConnection relevantTeams;
    public com.zzw.github.graphql.schema.objects.TeamConnection getRelevantTeams() { return this.relevantTeams; }
    public void setRelevantTeams(com.zzw.github.graphql.schema.objects.TeamConnection relevantTeams) { this.relevantTeams = relevantTeams; }

    @NonNull("!")
    @Description("A string describing this context")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("An octicon to accompany this context")
    private com.zzw.github.graphql.schema.scalars.String octicon;
    public com.zzw.github.graphql.schema.scalars.String getOcticon() { return this.octicon; }
    public void setOcticon(com.zzw.github.graphql.schema.scalars.String octicon) { this.octicon = octicon; }

    @NonNull("!")
    @Description("The path for the full team list for this user")
    private com.zzw.github.graphql.schema.scalars.URI teamsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsResourcePath() { return this.teamsResourcePath; }
    public void setTeamsResourcePath(com.zzw.github.graphql.schema.scalars.URI teamsResourcePath) { this.teamsResourcePath = teamsResourcePath; }

    @NonNull("!")
    @Description("The URL for the full team list for this user")
    private com.zzw.github.graphql.schema.scalars.URI teamsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTeamsUrl() { return this.teamsUrl; }
    public void setTeamsUrl(com.zzw.github.graphql.schema.scalars.URI teamsUrl) { this.teamsUrl = teamsUrl; }

    @NonNull("!")
    @Description("The total number of teams the user is on in the organization")
    private com.zzw.github.graphql.schema.scalars.Int totalTeamCount;
    public com.zzw.github.graphql.schema.scalars.Int getTotalTeamCount() { return this.totalTeamCount; }
    public void setTotalTeamCount(com.zzw.github.graphql.schema.scalars.Int totalTeamCount) { this.totalTeamCount = totalTeamCount; }
}
