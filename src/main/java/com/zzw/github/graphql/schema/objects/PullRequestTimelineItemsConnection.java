package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The connection type for PullRequestTimelineItems.")
public class PullRequestTimelineItemsConnection extends com.zzw.github.graphql.schema.Metadata {
    @Description("A list of edges.")
    private com.zzw.github.graphql.schema.objects.PullRequestTimelineItemsEdge[] edges;
    public com.zzw.github.graphql.schema.objects.PullRequestTimelineItemsEdge[] getEdges() { return this.edges; }
    public void setEdges(com.zzw.github.graphql.schema.objects.PullRequestTimelineItemsEdge[] edges) { this.edges = edges; }

    @NonNull("!")
    @Description("Identifies the count of items after applying before and after filters.")
    private com.zzw.github.graphql.schema.scalars.Int filteredCount;
    public com.zzw.github.graphql.schema.scalars.Int getFilteredCount() { return this.filteredCount; }
    public void setFilteredCount(com.zzw.github.graphql.schema.scalars.Int filteredCount) { this.filteredCount = filteredCount; }

    @Description("A list of nodes.")
    private com.zzw.github.graphql.schema.unions.PullRequestTimelineItems[] nodes;
    public com.zzw.github.graphql.schema.unions.PullRequestTimelineItems[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.unions.PullRequestTimelineItems[] nodes) { this.nodes = nodes; }

    @NonNull("!")
    @Description("Identifies the count of items after applying before/after filters and first/last/skip slicing.")
    private com.zzw.github.graphql.schema.scalars.Int pageCount;
    public com.zzw.github.graphql.schema.scalars.Int getPageCount() { return this.pageCount; }
    public void setPageCount(com.zzw.github.graphql.schema.scalars.Int pageCount) { this.pageCount = pageCount; }

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
    @Description("Identifies the date and time when the timeline was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }
}
