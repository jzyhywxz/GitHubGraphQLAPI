package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A release asset contains the content for a release asset.")
public class ReleaseAsset extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("The asset's content-type")
    private com.zzw.github.graphql.schema.scalars.String contentType;
    public com.zzw.github.graphql.schema.scalars.String getContentType() { return this.contentType; }
    public void setContentType(com.zzw.github.graphql.schema.scalars.String contentType) { this.contentType = contentType; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    @Description("The number of times this asset was downloaded")
    private com.zzw.github.graphql.schema.scalars.Int downloadCount;
    public com.zzw.github.graphql.schema.scalars.Int getDownloadCount() { return this.downloadCount; }
    public void setDownloadCount(com.zzw.github.graphql.schema.scalars.Int downloadCount) { this.downloadCount = downloadCount; }

    @NonNull("!")
    @Description("Identifies the URL where you can download the release asset via the browser.")
    private com.zzw.github.graphql.schema.scalars.URI downloadUrl;
    public com.zzw.github.graphql.schema.scalars.URI getDownloadUrl() { return this.downloadUrl; }
    public void setDownloadUrl(com.zzw.github.graphql.schema.scalars.URI downloadUrl) { this.downloadUrl = downloadUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the title of the release asset.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("Release that the asset is associated with")
    private com.zzw.github.graphql.schema.objects.Release release;
    public com.zzw.github.graphql.schema.objects.Release getRelease() { return this.release; }
    public void setRelease(com.zzw.github.graphql.schema.objects.Release release) { this.release = release; }

    @NonNull("!")
    @Description("The size (in bytes) of the asset")
    private com.zzw.github.graphql.schema.scalars.Int size;
    public com.zzw.github.graphql.schema.scalars.Int getSize() { return this.size; }
    public void setSize(com.zzw.github.graphql.schema.scalars.Int size) { this.size = size; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The user that performed the upload")
    private com.zzw.github.graphql.schema.objects.User uploadedBy;
    public com.zzw.github.graphql.schema.objects.User getUploadedBy() { return this.uploadedBy; }
    public void setUploadedBy(com.zzw.github.graphql.schema.objects.User uploadedBy) { this.uploadedBy = uploadedBy; }

    @NonNull("!")
    @Description("Identifies the URL of the release asset.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
