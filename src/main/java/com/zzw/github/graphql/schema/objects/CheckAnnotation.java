package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A single check annotation.")
public class CheckAnnotation extends com.zzw.github.graphql.schema.Metadata {
    @Description("The annotation's severity level.")
    private com.zzw.github.graphql.schema.enums.CheckAnnotationLevel annotationLevel;
    public com.zzw.github.graphql.schema.enums.CheckAnnotationLevel getAnnotationLevel() { return this.annotationLevel; }
    public void setAnnotationLevel(com.zzw.github.graphql.schema.enums.CheckAnnotationLevel annotationLevel) { this.annotationLevel = annotationLevel; }

    @NonNull("!")
    @Description("The path to the file that this annotation was made on.")
    private com.zzw.github.graphql.schema.scalars.URI blobUrl;
    public com.zzw.github.graphql.schema.scalars.URI getBlobUrl() { return this.blobUrl; }
    public void setBlobUrl(com.zzw.github.graphql.schema.scalars.URI blobUrl) { this.blobUrl = blobUrl; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    @Description("The position of this annotation.")
    private com.zzw.github.graphql.schema.objects.CheckAnnotationSpan location;
    public com.zzw.github.graphql.schema.objects.CheckAnnotationSpan getLocation() { return this.location; }
    public void setLocation(com.zzw.github.graphql.schema.objects.CheckAnnotationSpan location) { this.location = location; }

    @NonNull("!")
    @Description("The annotation's message.")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("The path that this annotation was made on.")
    private com.zzw.github.graphql.schema.scalars.String path;
    public com.zzw.github.graphql.schema.scalars.String getPath() { return this.path; }
    public void setPath(com.zzw.github.graphql.schema.scalars.String path) { this.path = path; }

    @Description("Additional information about the annotation.")
    private com.zzw.github.graphql.schema.scalars.String rawDetails;
    public com.zzw.github.graphql.schema.scalars.String getRawDetails() { return this.rawDetails; }
    public void setRawDetails(com.zzw.github.graphql.schema.scalars.String rawDetails) { this.rawDetails = rawDetails; }

    @Description("The annotation's title")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }
}
