package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A public description of a Marketplace category.")
public class MarketplaceCategory extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("The category's description.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("The technical description of how apps listed in this category work with GitHub.")
    private com.zzw.github.graphql.schema.scalars.String howItWorks;
    public com.zzw.github.graphql.schema.scalars.String getHowItWorks() { return this.howItWorks; }
    public void setHowItWorks(com.zzw.github.graphql.schema.scalars.String howItWorks) { this.howItWorks = howItWorks; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The category's name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("How many Marketplace listings have this as their primary category.")
    private com.zzw.github.graphql.schema.scalars.Int primaryListingCount;
    public com.zzw.github.graphql.schema.scalars.Int getPrimaryListingCount() { return this.primaryListingCount; }
    public void setPrimaryListingCount(com.zzw.github.graphql.schema.scalars.Int primaryListingCount) { this.primaryListingCount = primaryListingCount; }

    @NonNull("!")
    @Description("The HTTP path for this Marketplace category.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("How many Marketplace listings have this as their secondary category.")
    private com.zzw.github.graphql.schema.scalars.Int secondaryListingCount;
    public com.zzw.github.graphql.schema.scalars.Int getSecondaryListingCount() { return this.secondaryListingCount; }
    public void setSecondaryListingCount(com.zzw.github.graphql.schema.scalars.Int secondaryListingCount) { this.secondaryListingCount = secondaryListingCount; }

    @NonNull("!")
    @Description("The short name of the category used in its URL.")
    private com.zzw.github.graphql.schema.scalars.String slug;
    public com.zzw.github.graphql.schema.scalars.String getSlug() { return this.slug; }
    public void setSlug(com.zzw.github.graphql.schema.scalars.String slug) { this.slug = slug; }

    @NonNull("!")
    @Description("The HTTP URL for this Marketplace category.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
