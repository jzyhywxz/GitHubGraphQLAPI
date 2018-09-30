package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An Identity Provider configured to provision SAML and SCIM identities for Organizations")
public class OrganizationIdentityProvider extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("External Identities provisioned by this Identity Provider")
    private com.zzw.github.graphql.schema.objects.ExternalIdentityConnection externalIdentities;
    public com.zzw.github.graphql.schema.objects.ExternalIdentityConnection getExternalIdentities() { return this.externalIdentities; }
    public void setExternalIdentities(com.zzw.github.graphql.schema.objects.ExternalIdentityConnection externalIdentities) { this.externalIdentities = externalIdentities; }

    @Description("The digest algorithm used to sign SAML requests for the Identity Provider.")
    private com.zzw.github.graphql.schema.scalars.URI digestMethod;
    public com.zzw.github.graphql.schema.scalars.URI getDigestMethod() { return this.digestMethod; }
    public void setDigestMethod(com.zzw.github.graphql.schema.scalars.URI digestMethod) { this.digestMethod = digestMethod; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The x509 certificate used by the Identity Provder to sign assertions and responses.")
    private com.zzw.github.graphql.schema.scalars.X509Certificate idpCertificate;
    public com.zzw.github.graphql.schema.scalars.X509Certificate getIdpCertificate() { return this.idpCertificate; }
    public void setIdpCertificate(com.zzw.github.graphql.schema.scalars.X509Certificate idpCertificate) { this.idpCertificate = idpCertificate; }

    @Description("The Issuer Entity ID for the SAML Identity Provider")
    private com.zzw.github.graphql.schema.scalars.String issuer;
    public com.zzw.github.graphql.schema.scalars.String getIssuer() { return this.issuer; }
    public void setIssuer(com.zzw.github.graphql.schema.scalars.String issuer) { this.issuer = issuer; }

    @Description("Organization this Identity Provider belongs to")
    private com.zzw.github.graphql.schema.objects.Organization organization;
    public com.zzw.github.graphql.schema.objects.Organization getOrganization() { return this.organization; }
    public void setOrganization(com.zzw.github.graphql.schema.objects.Organization organization) { this.organization = organization; }

    @Description("The signature algorithm used to sign SAML requests for the Identity Provider.")
    private com.zzw.github.graphql.schema.scalars.URI signatureMethod;
    public com.zzw.github.graphql.schema.scalars.URI getSignatureMethod() { return this.signatureMethod; }
    public void setSignatureMethod(com.zzw.github.graphql.schema.scalars.URI signatureMethod) { this.signatureMethod = signatureMethod; }

    @Description("The URL endpoint for the Identity Provider's SAML SSO.")
    private com.zzw.github.graphql.schema.scalars.URI ssoUrl;
    public com.zzw.github.graphql.schema.scalars.URI getSsoUrl() { return this.ssoUrl; }
    public void setSsoUrl(com.zzw.github.graphql.schema.scalars.URI ssoUrl) { this.ssoUrl = ssoUrl; }
}
