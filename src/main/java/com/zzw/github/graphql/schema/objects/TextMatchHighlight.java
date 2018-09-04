package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a single highlight in a search result match.")
public class TextMatchHighlight extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("The indice in the fragment where the matched text begins.")
    private com.zzw.github.graphql.schema.scalars.Int beginIndice;
    public com.zzw.github.graphql.schema.scalars.Int getBeginIndice() { return this.beginIndice; }
    public void setBeginIndice(com.zzw.github.graphql.schema.scalars.Int beginIndice) { this.beginIndice = beginIndice; }

    @NonNull("!")
    @Description("The indice in the fragment where the matched text ends.")
    private com.zzw.github.graphql.schema.scalars.Int endIndice;
    public com.zzw.github.graphql.schema.scalars.Int getEndIndice() { return this.endIndice; }
    public void setEndIndice(com.zzw.github.graphql.schema.scalars.Int endIndice) { this.endIndice = endIndice; }

    @NonNull("!")
    @Description("The text matched.")
    private com.zzw.github.graphql.schema.scalars.String text;
    public com.zzw.github.graphql.schema.scalars.String getText() { return this.text; }
    public void setText(com.zzw.github.graphql.schema.scalars.String text) { this.text = text; }
}
