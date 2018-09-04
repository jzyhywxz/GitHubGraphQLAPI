package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a starred repository.")
public class StarredRepositoryEdge extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("A cursor for use in pagination.")
    private com.zzw.github.graphql.schema.scalars.String cursor;
    public com.zzw.github.graphql.schema.scalars.String getCursor() { return this.cursor; }
    public void setCursor(com.zzw.github.graphql.schema.scalars.String cursor) { this.cursor = cursor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.objects.Repository node;
    public com.zzw.github.graphql.schema.objects.Repository getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.objects.Repository node) { this.node = node; }

    @NonNull("!")
    @Description("Identifies when the item was starred.")
    private com.zzw.github.graphql.schema.scalars.DateTime starredAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getStarredAt() { return this.starredAt; }
    public void setStarredAt(com.zzw.github.graphql.schema.scalars.DateTime starredAt) { this.starredAt = starredAt; }
}
