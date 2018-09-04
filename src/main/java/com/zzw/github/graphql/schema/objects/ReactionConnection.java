package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A list of reactions that have been left on the subject.")
public class ReactionConnection extends com.zzw.github.graphql.schema.Metadata {
    @Description("A list of edges.")
    private com.zzw.github.graphql.schema.objects.ReactionEdge[] edges;
    public com.zzw.github.graphql.schema.objects.ReactionEdge[] getEdges() { return this.edges; }
    public void setEdges(com.zzw.github.graphql.schema.objects.ReactionEdge[] edges) { this.edges = edges; }

    @Description("A list of nodes.")
    private com.zzw.github.graphql.schema.objects.Reaction[] nodes;
    public com.zzw.github.graphql.schema.objects.Reaction[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.objects.Reaction[] nodes) { this.nodes = nodes; }

    @NonNull("!")
    @Description("Information to aid in pagination.")
    private com.zzw.github.graphql.schema.objects.PageInfo pageInfo;
    public com.zzw.github.graphql.schema.objects.PageInfo getPageInfo() { return this.pageInfo; }
    public void setPageInfo(com.zzw.github.graphql.schema.objects.PageInfo pageInfo) { this.pageInfo = pageInfo; }

    @NonNull("!")
    @Description("Identifies the total count of items in the connection.")
    private com.zzw.github.graphql.schema.scalars.Int totalCount;
    public com.zzw.github.graphql.schema.scalars.Int getTotalCount() { return this.totalCount; }
    public void setTotalCount(com.zzw.github.graphql.schema.scalars.Int totalCount) { this.totalCount = totalCount; }

    @NonNull("!")
    @Description("Whether or not the authenticated user has left a reaction on the subject.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasReacted;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasReacted() { return this.viewerHasReacted; }
    public void setViewerHasReacted(com.zzw.github.graphql.schema.scalars.Boolean viewerHasReacted) { this.viewerHasReacted = viewerHasReacted; }
}
