package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The connection type for Commit.")
public class CommitHistoryConnection extends com.zzw.github.graphql.schema.Metadata {
    private com.zzw.github.graphql.schema.objects.CommitEdge[] edges;
    public com.zzw.github.graphql.schema.objects.CommitEdge[] getEdges() { return this.edges; }
    public void setEdges(com.zzw.github.graphql.schema.objects.CommitEdge[] edges) { this.edges = edges; }

    @Description("A list of nodes.")
    private com.zzw.github.graphql.schema.objects.Commit[] nodes;
    public com.zzw.github.graphql.schema.objects.Commit[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.objects.Commit[] nodes) { this.nodes = nodes; }

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
}
