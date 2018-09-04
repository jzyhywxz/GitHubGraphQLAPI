package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An Invitation for a user to an organization.")
public class OrganizationInvitation extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The email address of the user invited to the organization.")
    private com.zzw.github.graphql.schema.scalars.String email;
    public com.zzw.github.graphql.schema.scalars.String getEmail() { return this.email; }
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email) { this.email = email; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The type of invitation that was sent (e.g. email, user).")
    private com.zzw.github.graphql.schema.enums.OrganizationInvitationType invitationType;
    public com.zzw.github.graphql.schema.enums.OrganizationInvitationType getInvitationType() { return this.invitationType; }
    public void setInvitationType(com.zzw.github.graphql.schema.enums.OrganizationInvitationType invitationType) { this.invitationType = invitationType; }

    @Description("The user who was invited to the organization.")
    private com.zzw.github.graphql.schema.objects.User invitee;
    public com.zzw.github.graphql.schema.objects.User getInvitee() { return this.invitee; }
    public void setInvitee(com.zzw.github.graphql.schema.objects.User invitee) { this.invitee = invitee; }

    @NonNull("!")
    @Description("The user who created the invitation.")
    private com.zzw.github.graphql.schema.objects.User inviter;
    public com.zzw.github.graphql.schema.objects.User getInviter() { return this.inviter; }
    public void setInviter(com.zzw.github.graphql.schema.objects.User inviter) { this.inviter = inviter; }

    @NonNull("!")
    @Description("The organization the invite is for")
    private com.zzw.github.graphql.schema.objects.Organization organization;
    public com.zzw.github.graphql.schema.objects.Organization getOrganization() { return this.organization; }
    public void setOrganization(com.zzw.github.graphql.schema.objects.Organization organization) { this.organization = organization; }

    @NonNull("!")
    @Description("The user's pending role in the organization (e.g. member, owner).")
    private com.zzw.github.graphql.schema.enums.OrganizationInvitationRole role;
    public com.zzw.github.graphql.schema.enums.OrganizationInvitationRole getRole() { return this.role; }
    public void setRole(com.zzw.github.graphql.schema.enums.OrganizationInvitationRole role) { this.role = role; }
}
