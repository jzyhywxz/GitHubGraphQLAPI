package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A repository's open source license")
public class License extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("The full text of the license")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("The conditions set by the license")
    private com.zzw.github.graphql.schema.objects.LicenseRule[] conditions;
    public com.zzw.github.graphql.schema.objects.LicenseRule[] getConditions() { return this.conditions; }
    public void setConditions(com.zzw.github.graphql.schema.objects.LicenseRule[] conditions) { this.conditions = conditions; }

    @Description("A human-readable description of the license")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    @Description("Whether the license should be featured")
    private com.zzw.github.graphql.schema.scalars.Boolean featured;
    public com.zzw.github.graphql.schema.scalars.Boolean getFeatured() { return this.featured; }
    public void setFeatured(com.zzw.github.graphql.schema.scalars.Boolean featured) { this.featured = featured; }

    @NonNull("!")
    @Description("Whether the license should be displayed in license pickers")
    private com.zzw.github.graphql.schema.scalars.Boolean hidden;
    public com.zzw.github.graphql.schema.scalars.Boolean getHidden() { return this.hidden; }
    public void setHidden(com.zzw.github.graphql.schema.scalars.Boolean hidden) { this.hidden = hidden; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("Instructions on how to implement the license")
    private com.zzw.github.graphql.schema.scalars.String implementation;
    public com.zzw.github.graphql.schema.scalars.String getImplementation() { return this.implementation; }
    public void setImplementation(com.zzw.github.graphql.schema.scalars.String implementation) { this.implementation = implementation; }

    @NonNull("!")
    @Description("The lowercased SPDX ID of the license")
    private com.zzw.github.graphql.schema.scalars.String key;
    public com.zzw.github.graphql.schema.scalars.String getKey() { return this.key; }
    public void setKey(com.zzw.github.graphql.schema.scalars.String key) { this.key = key; }

    @NonNull("!")
    @Description("The limitations set by the license")
    private com.zzw.github.graphql.schema.objects.LicenseRule[] limitations;
    public com.zzw.github.graphql.schema.objects.LicenseRule[] getLimitations() { return this.limitations; }
    public void setLimitations(com.zzw.github.graphql.schema.objects.LicenseRule[] limitations) { this.limitations = limitations; }

    @NonNull("!")
    @Description("The license full name specified by ")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("Customary short name if applicable (e.g, GPLv3)")
    private com.zzw.github.graphql.schema.scalars.String nickname;
    public com.zzw.github.graphql.schema.scalars.String getNickname() { return this.nickname; }
    public void setNickname(com.zzw.github.graphql.schema.scalars.String nickname) { this.nickname = nickname; }

    @NonNull("!")
    @Description("The permissions set by the license")
    private com.zzw.github.graphql.schema.objects.LicenseRule[] permissions;
    public com.zzw.github.graphql.schema.objects.LicenseRule[] getPermissions() { return this.permissions; }
    public void setPermissions(com.zzw.github.graphql.schema.objects.LicenseRule[] permissions) { this.permissions = permissions; }

    @NonNull("!")
    @Description("Whether the license is a pseudo-license placeholder (e.g., other, no-license)")
    private com.zzw.github.graphql.schema.scalars.Boolean pseudoLicense;
    public com.zzw.github.graphql.schema.scalars.Boolean getPseudoLicense() { return this.pseudoLicense; }
    public void setPseudoLicense(com.zzw.github.graphql.schema.scalars.Boolean pseudoLicense) { this.pseudoLicense = pseudoLicense; }

    @Description("Short identifier specified by ")
    private com.zzw.github.graphql.schema.scalars.String spdxId;
    public com.zzw.github.graphql.schema.scalars.String getSpdxId() { return this.spdxId; }
    public void setSpdxId(com.zzw.github.graphql.schema.scalars.String spdxId) { this.spdxId = spdxId; }

    @Description("URL to the license on ")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
