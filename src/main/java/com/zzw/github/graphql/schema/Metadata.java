package com.zzw.github.graphql.schema;

public class Metadata implements com.zzw.github.graphql.schema.unions.Closer, com.zzw.github.graphql.schema.unions.CollectionItemContent, com.zzw.github.graphql.schema.unions.IssueOrPullRequest, com.zzw.github.graphql.schema.unions.IssueTimelineItem, com.zzw.github.graphql.schema.unions.MilestoneItem, com.zzw.github.graphql.schema.unions.ProjectCardItem, com.zzw.github.graphql.schema.unions.PullRequestTimelineItem, com.zzw.github.graphql.schema.unions.PushAllowanceActor, com.zzw.github.graphql.schema.unions.ReferencedSubject, com.zzw.github.graphql.schema.unions.RenamedTitleSubject, com.zzw.github.graphql.schema.unions.RequestedReviewer, com.zzw.github.graphql.schema.unions.ReviewDismissalAllowanceActor, com.zzw.github.graphql.schema.unions.SearchResultItem {
    protected String __typename;
    public String getTypename() { return __typename; }
    public void setTypename(String typename) { this.__typename = typename; }
}
