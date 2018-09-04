package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Detail needed to display a hovercard for a user")
public class Hovercard extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("[!]!")
    @Description("Each of the contexts for this hovercard")
    private com.zzw.github.graphql.schema.interfaces.HovercardContext[] contexts;
    public com.zzw.github.graphql.schema.interfaces.HovercardContext[] getContexts() { return this.contexts; }
    public void setContexts(com.zzw.github.graphql.schema.interfaces.HovercardContext[] contexts) { this.contexts = contexts; }
}
