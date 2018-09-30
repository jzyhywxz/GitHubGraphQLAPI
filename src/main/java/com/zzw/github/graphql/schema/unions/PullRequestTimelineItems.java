package com.zzw.github.graphql.schema.unions;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.AddedToProjectEvent",
        "com.zzw.github.graphql.schema.objects.AssignedEvent",
        "com.zzw.github.graphql.schema.objects.BaseRefChangedEvent",
        "com.zzw.github.graphql.schema.objects.BaseRefForcePushedEvent",
        "com.zzw.github.graphql.schema.objects.ClosedEvent",
        "com.zzw.github.graphql.schema.objects.CommentDeletedEvent",
        "com.zzw.github.graphql.schema.objects.ConvertedNoteToIssueEvent",
        "com.zzw.github.graphql.schema.objects.CrossReferencedEvent",
        "com.zzw.github.graphql.schema.objects.DemilestonedEvent",
        "com.zzw.github.graphql.schema.objects.DeployedEvent",
        "com.zzw.github.graphql.schema.objects.DeploymentEnvironmentChangedEvent",
        "com.zzw.github.graphql.schema.objects.HeadRefDeletedEvent",
        "com.zzw.github.graphql.schema.objects.HeadRefForcePushedEvent",
        "com.zzw.github.graphql.schema.objects.HeadRefRestoredEvent",
        "com.zzw.github.graphql.schema.objects.IssueComment",
        "com.zzw.github.graphql.schema.objects.LabeledEvent",
        "com.zzw.github.graphql.schema.objects.LockedEvent",
        "com.zzw.github.graphql.schema.objects.MentionedEvent",
        "com.zzw.github.graphql.schema.objects.MergedEvent",
        "com.zzw.github.graphql.schema.objects.MilestonedEvent",
        "com.zzw.github.graphql.schema.objects.MovedColumnsInProjectEvent",
        "com.zzw.github.graphql.schema.objects.PullRequestCommit",
        "com.zzw.github.graphql.schema.objects.PullRequestCommitCommentThread",
        "com.zzw.github.graphql.schema.objects.PullRequestReview",
        "com.zzw.github.graphql.schema.objects.PullRequestReviewThread",
        "com.zzw.github.graphql.schema.objects.PullRequestRevisionMarker",
        "com.zzw.github.graphql.schema.objects.ReferencedEvent",
        "com.zzw.github.graphql.schema.objects.RemovedFromProjectEvent",
        "com.zzw.github.graphql.schema.objects.RenamedTitleEvent",
        "com.zzw.github.graphql.schema.objects.ReopenedEvent",
        "com.zzw.github.graphql.schema.objects.ReviewDismissedEvent",
        "com.zzw.github.graphql.schema.objects.ReviewRequestRemovedEvent",
        "com.zzw.github.graphql.schema.objects.ReviewRequestedEvent",
        "com.zzw.github.graphql.schema.objects.SubscribedEvent",
        "com.zzw.github.graphql.schema.objects.UnassignedEvent",
        "com.zzw.github.graphql.schema.objects.UnlabeledEvent",
        "com.zzw.github.graphql.schema.objects.UnlockedEvent",
        "com.zzw.github.graphql.schema.objects.UnsubscribedEvent",
})
@Description("An item in a pull request timeline")
public interface PullRequestTimelineItems {
}
