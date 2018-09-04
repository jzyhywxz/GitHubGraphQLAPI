package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A list of results that matched against a search query.")
public class SearchResultItemConnection extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("The number of pieces of code that matched the search query.")
    private com.zzw.github.graphql.schema.scalars.Int codeCount;
    public com.zzw.github.graphql.schema.scalars.Int getCodeCount() { return this.codeCount; }
    public void setCodeCount(com.zzw.github.graphql.schema.scalars.Int codeCount) { this.codeCount = codeCount; }

    @Description("A list of edges.")
    private com.zzw.github.graphql.schema.objects.SearchResultItemEdge[] edges;
    public com.zzw.github.graphql.schema.objects.SearchResultItemEdge[] getEdges() { return this.edges; }
    public void setEdges(com.zzw.github.graphql.schema.objects.SearchResultItemEdge[] edges) { this.edges = edges; }

    @NonNull("!")
    @Description("The number of issues that matched the search query.")
    private com.zzw.github.graphql.schema.scalars.Int issueCount;
    public com.zzw.github.graphql.schema.scalars.Int getIssueCount() { return this.issueCount; }
    public void setIssueCount(com.zzw.github.graphql.schema.scalars.Int issueCount) { this.issueCount = issueCount; }

    @Description("A list of nodes.")
    private com.zzw.github.graphql.schema.unions.SearchResultItem[] nodes;
    public com.zzw.github.graphql.schema.unions.SearchResultItem[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.unions.SearchResultItem[] nodes) { this.nodes = nodes; }

    @NonNull("!")
    @Description("Information to aid in pagination.")
    private com.zzw.github.graphql.schema.objects.PageInfo pageInfo;
    public com.zzw.github.graphql.schema.objects.PageInfo getPageInfo() { return this.pageInfo; }
    public void setPageInfo(com.zzw.github.graphql.schema.objects.PageInfo pageInfo) { this.pageInfo = pageInfo; }

    @NonNull("!")
    @Description("The number of repositories that matched the search query.")
    private com.zzw.github.graphql.schema.scalars.Int repositoryCount;
    public com.zzw.github.graphql.schema.scalars.Int getRepositoryCount() { return this.repositoryCount; }
    public void setRepositoryCount(com.zzw.github.graphql.schema.scalars.Int repositoryCount) { this.repositoryCount = repositoryCount; }

    @NonNull("!")
    @Description("The number of users that matched the search query.")
    private com.zzw.github.graphql.schema.scalars.Int userCount;
    public com.zzw.github.graphql.schema.scalars.Int getUserCount() { return this.userCount; }
    public void setUserCount(com.zzw.github.graphql.schema.scalars.Int userCount) { this.userCount = userCount; }

    @NonNull("!")
    @Description("The number of wiki pages that matched the search query.")
    private com.zzw.github.graphql.schema.scalars.Int wikiCount;
    public com.zzw.github.graphql.schema.scalars.Int getWikiCount() { return this.wikiCount; }
    public void setWikiCount(com.zzw.github.graphql.schema.scalars.Int wikiCount) { this.wikiCount = wikiCount; }
}
