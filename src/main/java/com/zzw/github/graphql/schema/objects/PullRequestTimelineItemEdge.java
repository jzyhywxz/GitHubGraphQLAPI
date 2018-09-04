package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An edge in a connection.")
public class PullRequestTimelineItemEdge extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("A cursor for use in pagination.")
    private com.zzw.github.graphql.schema.scalars.String cursor;
    public com.zzw.github.graphql.schema.scalars.String getCursor() { return this.cursor; }
    public void setCursor(com.zzw.github.graphql.schema.scalars.String cursor) { this.cursor = cursor; }

    @Description("The item at the end of the edge.")
    private com.zzw.github.graphql.schema.unions.PullRequestTimelineItem node;
    public com.zzw.github.graphql.schema.unions.PullRequestTimelineItem getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.unions.PullRequestTimelineItem node) { this.node = node; }
}
