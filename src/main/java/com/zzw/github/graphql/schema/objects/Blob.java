package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git blob.")
public class Blob extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.GitObject, com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("An abbreviated version of the Git object ID")
    private com.zzw.github.graphql.schema.scalars.String abbreviatedOid;
    public com.zzw.github.graphql.schema.scalars.String getAbbreviatedOid() { return this.abbreviatedOid; }
    public void setAbbreviatedOid(com.zzw.github.graphql.schema.scalars.String abbreviatedOid) { this.abbreviatedOid = abbreviatedOid; }

    @NonNull("!")
    @Description("Byte size of Blob object")
    private com.zzw.github.graphql.schema.scalars.Int byteSize;
    public com.zzw.github.graphql.schema.scalars.Int getByteSize() { return this.byteSize; }
    public void setByteSize(com.zzw.github.graphql.schema.scalars.Int byteSize) { this.byteSize = byteSize; }

    @NonNull("!")
    @Description("The HTTP path for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getCommitResourcePath() { return this.commitResourcePath; }
    public void setCommitResourcePath(com.zzw.github.graphql.schema.scalars.URI commitResourcePath) { this.commitResourcePath = commitResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitUrl;
    public com.zzw.github.graphql.schema.scalars.URI getCommitUrl() { return this.commitUrl; }
    public void setCommitUrl(com.zzw.github.graphql.schema.scalars.URI commitUrl) { this.commitUrl = commitUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Indicates whether the Blob is binary or text")
    private com.zzw.github.graphql.schema.scalars.Boolean isBinary;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsBinary() { return this.isBinary; }
    public void setIsBinary(com.zzw.github.graphql.schema.scalars.Boolean isBinary) { this.isBinary = isBinary; }

    @NonNull("!")
    @Description("Indicates whether the contents is truncated")
    private com.zzw.github.graphql.schema.scalars.Boolean isTruncated;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsTruncated() { return this.isTruncated; }
    public void setIsTruncated(com.zzw.github.graphql.schema.scalars.Boolean isTruncated) { this.isTruncated = isTruncated; }

    @NonNull("!")
    @Description("The Git object ID")
    private com.zzw.github.graphql.schema.scalars.GitObjectID oid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid() { return this.oid; }
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid) { this.oid = oid; }

    @NonNull("!")
    @Description("The Repository the Git object belongs to")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("UTF8 text data or null if the Blob is binary")
    private com.zzw.github.graphql.schema.scalars.String text;
    public com.zzw.github.graphql.schema.scalars.String getText() { return this.text; }
    public void setText(com.zzw.github.graphql.schema.scalars.String text) { this.text = text; }
}
