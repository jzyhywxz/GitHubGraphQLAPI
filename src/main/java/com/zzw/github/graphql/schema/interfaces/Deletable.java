package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.CommitComment",
        "com.zzw.github.graphql.schema.objects.GistComment",
        "com.zzw.github.graphql.schema.objects.IssueComment",
        "com.zzw.github.graphql.schema.objects.PullRequestReview",
        "com.zzw.github.graphql.schema.objects.PullRequestReviewComment",
        "com.zzw.github.graphql.schema.objects.TeamDiscussion",
        "com.zzw.github.graphql.schema.objects.TeamDiscussionComment",
})
@Description("Entities that can be deleted.")
public interface Deletable {
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanDelete();
    public void setViewerCanDelete(com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelete);
}
