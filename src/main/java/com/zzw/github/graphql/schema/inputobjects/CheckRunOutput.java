package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Descriptive details about the check run.")
public class CheckRunOutput {
    @NonNull("[!]")
    @Description("The annotations that are made as part of the check run.")
    private com.zzw.github.graphql.schema.inputobjects.CheckAnnotationData[] annotations;
    public com.zzw.github.graphql.schema.inputobjects.CheckAnnotationData[] getAnnotations() { return this.annotations; }
    public void setAnnotations(com.zzw.github.graphql.schema.inputobjects.CheckAnnotationData[] annotations) { this.annotations = annotations; }

    @NonNull("[!]")
    @Description("Images attached to the check run output displayed in the GitHub pull request UI.")
    private com.zzw.github.graphql.schema.inputobjects.CheckRunOutputImage[] images;
    public com.zzw.github.graphql.schema.inputobjects.CheckRunOutputImage[] getImages() { return this.images; }
    public void setImages(com.zzw.github.graphql.schema.inputobjects.CheckRunOutputImage[] images) { this.images = images; }

    @NonNull("!")
    @Description("The summary of the check run (supports Commonmark).")
    private com.zzw.github.graphql.schema.scalars.String summary;
    public com.zzw.github.graphql.schema.scalars.String getSummary() { return this.summary; }
    public void setSummary(com.zzw.github.graphql.schema.scalars.String summary) { this.summary = summary; }

    @Description("The details of the check run (supports Commonmark).")
    private com.zzw.github.graphql.schema.scalars.String text;
    public com.zzw.github.graphql.schema.scalars.String getText() { return this.text; }
    public void setText(com.zzw.github.graphql.schema.scalars.String text) { this.text = text; }

    @NonNull("!")
    @Description("A title to provide for this check run.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }
}
