package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An external identity provisioned by SAML SSO or SCIM.")
public class ExternalIdentity extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("The GUID for this identity")
    private com.zzw.github.graphql.schema.scalars.String guid;
    public com.zzw.github.graphql.schema.scalars.String getGuid() { return this.guid; }
    public void setGuid(com.zzw.github.graphql.schema.scalars.String guid) { this.guid = guid; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("Organization invitation for this SCIM-provisioned external identity")
    private com.zzw.github.graphql.schema.objects.OrganizationInvitation organizationInvitation;
    public com.zzw.github.graphql.schema.objects.OrganizationInvitation getOrganizationInvitation() { return this.organizationInvitation; }
    public void setOrganizationInvitation(com.zzw.github.graphql.schema.objects.OrganizationInvitation organizationInvitation) { this.organizationInvitation = organizationInvitation; }

    @Description("SAML Identity attributes")
    private com.zzw.github.graphql.schema.objects.ExternalIdentitySamlAttributes samlIdentity;
    public com.zzw.github.graphql.schema.objects.ExternalIdentitySamlAttributes getSamlIdentity() { return this.samlIdentity; }
    public void setSamlIdentity(com.zzw.github.graphql.schema.objects.ExternalIdentitySamlAttributes samlIdentity) { this.samlIdentity = samlIdentity; }

    @Description("SCIM Identity attributes")
    private com.zzw.github.graphql.schema.objects.ExternalIdentityScimAttributes scimIdentity;
    public com.zzw.github.graphql.schema.objects.ExternalIdentityScimAttributes getScimIdentity() { return this.scimIdentity; }
    public void setScimIdentity(com.zzw.github.graphql.schema.objects.ExternalIdentityScimAttributes scimIdentity) { this.scimIdentity = scimIdentity; }

    @Description("User linked to this external identity. Will be NULL if this identity has not been claimed by an organization member.")
    private com.zzw.github.graphql.schema.objects.User user;
    public com.zzw.github.graphql.schema.objects.User getUser() { return this.user; }
    public void setUser(com.zzw.github.graphql.schema.objects.User user) { this.user = user; }
}
