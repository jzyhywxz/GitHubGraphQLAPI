package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a user who is a member of a team.")
public class TeamMemberEdge extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("A cursor for use in pagination.")
    private com.zzw.github.graphql.schema.scalars.String cursor;
    public com.zzw.github.graphql.schema.scalars.String getCursor() { return this.cursor; }
    public void setCursor(com.zzw.github.graphql.schema.scalars.String cursor) { this.cursor = cursor; }

    @NonNull("!")
    @Description("The HTTP path to the organization's member access page.")
    private com.zzw.github.graphql.schema.scalars.URI memberAccessResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getMemberAccessResourcePath() { return this.memberAccessResourcePath; }
    public void setMemberAccessResourcePath(com.zzw.github.graphql.schema.scalars.URI memberAccessResourcePath) { this.memberAccessResourcePath = memberAccessResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL to the organization's member access page.")
    private com.zzw.github.graphql.schema.scalars.URI memberAccessUrl;
    public com.zzw.github.graphql.schema.scalars.URI getMemberAccessUrl() { return this.memberAccessUrl; }
    public void setMemberAccessUrl(com.zzw.github.graphql.schema.scalars.URI memberAccessUrl) { this.memberAccessUrl = memberAccessUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.objects.User node;
    public com.zzw.github.graphql.schema.objects.User getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.objects.User node) { this.node = node; }

    @NonNull("!")
    @Description("The role the member has on the team.")
    private com.zzw.github.graphql.schema.enums.TeamMemberRole role;
    public com.zzw.github.graphql.schema.enums.TeamMemberRole getRole() { return this.role; }
    public void setRole(com.zzw.github.graphql.schema.enums.TeamMemberRole role) { this.role = role; }
}
