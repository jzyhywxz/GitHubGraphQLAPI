package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Information from a check run analysis to specific lines of code.")
public class CheckAnnotationData {
    @NonNull("!")
    @Description("Represents an annotation's information level")
    private com.zzw.github.graphql.schema.enums.CheckAnnotationLevel annotationLevel;
    public com.zzw.github.graphql.schema.enums.CheckAnnotationLevel getAnnotationLevel() { return this.annotationLevel; }
    public void setAnnotationLevel(com.zzw.github.graphql.schema.enums.CheckAnnotationLevel annotationLevel) { this.annotationLevel = annotationLevel; }

    @NonNull("!")
    @Description("The location of the annotation")
    private com.zzw.github.graphql.schema.inputobjects.CheckAnnotationRange location;
    public com.zzw.github.graphql.schema.inputobjects.CheckAnnotationRange getLocation() { return this.location; }
    public void setLocation(com.zzw.github.graphql.schema.inputobjects.CheckAnnotationRange location) { this.location = location; }

    @NonNull("!")
    @Description("A short description of the feedback for these lines of code.")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("The path of the file to add an annotation to.")
    private com.zzw.github.graphql.schema.scalars.String path;
    public com.zzw.github.graphql.schema.scalars.String getPath() { return this.path; }
    public void setPath(com.zzw.github.graphql.schema.scalars.String path) { this.path = path; }

    @Description("Details about this annotation.")
    private com.zzw.github.graphql.schema.scalars.String rawDetails;
    public com.zzw.github.graphql.schema.scalars.String getRawDetails() { return this.rawDetails; }
    public void setRawDetails(com.zzw.github.graphql.schema.scalars.String rawDetails) { this.rawDetails = rawDetails; }

    @Description("The title that represents the annotation.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }
}
