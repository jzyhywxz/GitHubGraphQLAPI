package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents the language of a repository.")
public class LanguageEdge extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.String cursor;
    public com.zzw.github.graphql.schema.scalars.String getCursor() { return this.cursor; }
    public void setCursor(com.zzw.github.graphql.schema.scalars.String cursor) { this.cursor = cursor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.objects.Language node;
    public com.zzw.github.graphql.schema.objects.Language getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.objects.Language node) { this.node = node; }

    @NonNull("!")
    @Description("The number of bytes of code written in the language.")
    private com.zzw.github.graphql.schema.scalars.Int size;
    public com.zzw.github.graphql.schema.scalars.Int getSize() { return this.size; }
    public void setSize(com.zzw.github.graphql.schema.scalars.Int size) { this.size = size; }
}
