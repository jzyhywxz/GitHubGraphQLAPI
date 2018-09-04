package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Images attached to the check run output displayed in the GitHub pull request UI.")
public class CheckRunOutputImage {
    @NonNull("!")
    @Description("The alternative text for the image.")
    private com.zzw.github.graphql.schema.scalars.String alt;
    public com.zzw.github.graphql.schema.scalars.String getAlt() { return this.alt; }
    public void setAlt(com.zzw.github.graphql.schema.scalars.String alt) { this.alt = alt; }

    @Description("A short image description.")
    private com.zzw.github.graphql.schema.scalars.String caption;
    public com.zzw.github.graphql.schema.scalars.String getCaption() { return this.caption; }
    public void setCaption(com.zzw.github.graphql.schema.scalars.String caption) { this.caption = caption; }

    @NonNull("!")
    @Description("The full URL of the image.")
    private com.zzw.github.graphql.schema.scalars.URI imageUrl;
    public com.zzw.github.graphql.schema.scalars.URI getImageUrl() { return this.imageUrl; }
    public void setImageUrl(com.zzw.github.graphql.schema.scalars.URI imageUrl) { this.imageUrl = imageUrl; }
}
