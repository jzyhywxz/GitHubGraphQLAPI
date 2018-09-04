package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A list of repositories owned by the subject.")
public class RepositoryConnection extends com.zzw.github.graphql.schema.Metadata {
    @Description("A list of edges.")
    private com.zzw.github.graphql.schema.objects.RepositoryEdge[] edges;
    public com.zzw.github.graphql.schema.objects.RepositoryEdge[] getEdges() { return this.edges; }
    public void setEdges(com.zzw.github.graphql.schema.objects.RepositoryEdge[] edges) { this.edges = edges; }

    @Description("A list of nodes.")
    private com.zzw.github.graphql.schema.objects.Repository[] nodes;
    public com.zzw.github.graphql.schema.objects.Repository[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.objects.Repository[] nodes) { this.nodes = nodes; }

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
    @Description("The total size in kilobytes of all repositories in the connection.")
    private com.zzw.github.graphql.schema.scalars.Int totalDiskUsage;
    public com.zzw.github.graphql.schema.scalars.Int getTotalDiskUsage() { return this.totalDiskUsage; }
    public void setTotalDiskUsage(com.zzw.github.graphql.schema.scalars.Int totalDiskUsage) { this.totalDiskUsage = totalDiskUsage; }
}
