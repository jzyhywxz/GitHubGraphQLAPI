package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A release contains the content for a release.")
public class Release extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("A list of names to filter the assets by.")),
    })
    @NonNull("!")
    @Description("List of releases assets which are dependent on this release.")
    private com.zzw.github.graphql.schema.objects.ReleaseAssetConnection releaseAssets;
    public com.zzw.github.graphql.schema.objects.ReleaseAssetConnection getReleaseAssets() { return this.releaseAssets; }
    public void setReleaseAssets(com.zzw.github.graphql.schema.objects.ReleaseAssetConnection releaseAssets) { this.releaseAssets = releaseAssets; }

    @Description("The author of the release")
    private com.zzw.github.graphql.schema.objects.User author;
    public com.zzw.github.graphql.schema.objects.User getAuthor() { return this.author; }
    public void setAuthor(com.zzw.github.graphql.schema.objects.User author) { this.author = author; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the description of the release.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether or not the release is a draft")
    private com.zzw.github.graphql.schema.scalars.Boolean isDraft;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDraft() { return this.isDraft; }
    public void setIsDraft(com.zzw.github.graphql.schema.scalars.Boolean isDraft) { this.isDraft = isDraft; }

    @NonNull("!")
    @Description("Whether or not the release is a prerelease")
    private com.zzw.github.graphql.schema.scalars.Boolean isPrerelease;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPrerelease() { return this.isPrerelease; }
    public void setIsPrerelease(com.zzw.github.graphql.schema.scalars.Boolean isPrerelease) { this.isPrerelease = isPrerelease; }

    @Description("Identifies the title of the release.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("Identifies the date and time when the release was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime publishedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getPublishedAt() { return this.publishedAt; }
    public void setPublishedAt(com.zzw.github.graphql.schema.scalars.DateTime publishedAt) { this.publishedAt = publishedAt; }

    @NonNull("!")
    @Description("The HTTP path for this issue")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("The Git tag the release points to")
    private com.zzw.github.graphql.schema.objects.Ref tag;
    public com.zzw.github.graphql.schema.objects.Ref getTag() { return this.tag; }
    public void setTag(com.zzw.github.graphql.schema.objects.Ref tag) { this.tag = tag; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this issue")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
