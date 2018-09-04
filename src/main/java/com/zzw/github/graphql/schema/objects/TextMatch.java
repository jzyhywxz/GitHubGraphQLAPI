package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A text match within a search result.")
public class TextMatch extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("The specific text fragment within the property matched on.")
    private com.zzw.github.graphql.schema.scalars.String fragment;
    public com.zzw.github.graphql.schema.scalars.String getFragment() { return this.fragment; }
    public void setFragment(com.zzw.github.graphql.schema.scalars.String fragment) { this.fragment = fragment; }

    @NonNull("[!]!")
    @Description("Highlights within the matched fragment.")
    private com.zzw.github.graphql.schema.objects.TextMatchHighlight[] highlights;
    public com.zzw.github.graphql.schema.objects.TextMatchHighlight[] getHighlights() { return this.highlights; }
    public void setHighlights(com.zzw.github.graphql.schema.objects.TextMatchHighlight[] highlights) { this.highlights = highlights; }

    @NonNull("!")
    @Description("The property matched on.")
    private com.zzw.github.graphql.schema.scalars.String property;
    public com.zzw.github.graphql.schema.scalars.String getProperty() { return this.property; }
    public void setProperty(com.zzw.github.graphql.schema.scalars.String property) { this.property = property; }
}
