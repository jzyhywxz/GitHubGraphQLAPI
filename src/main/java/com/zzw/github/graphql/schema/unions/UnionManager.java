package com.zzw.github.graphql.schema.unions;

public class UnionManager {
    public static final Class[] Closer_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] CollectionItemContent_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] IssueOrPullRequest_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] IssueTimelineItem_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.AssignedEvent.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.DemilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.LabeledEvent.class,
            com.zzw.github.graphql.schema.objects.LockedEvent.class,
            com.zzw.github.graphql.schema.objects.MilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.ReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.RenamedTitleEvent.class,
            com.zzw.github.graphql.schema.objects.ReopenedEvent.class,
            com.zzw.github.graphql.schema.objects.SubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.UnassignedEvent.class,
            com.zzw.github.graphql.schema.objects.UnlabeledEvent.class,
            com.zzw.github.graphql.schema.objects.UnlockedEvent.class,
            com.zzw.github.graphql.schema.objects.UnsubscribedEvent.class,
    };

    public static final Class[] IssueTimelineItems_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.AddedToProjectEvent.class,
            com.zzw.github.graphql.schema.objects.AssignedEvent.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.CommentDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.ConvertedNoteToIssueEvent.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.DemilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.LabeledEvent.class,
            com.zzw.github.graphql.schema.objects.LockedEvent.class,
            com.zzw.github.graphql.schema.objects.MentionedEvent.class,
            com.zzw.github.graphql.schema.objects.MilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.MovedColumnsInProjectEvent.class,
            com.zzw.github.graphql.schema.objects.ReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.RemovedFromProjectEvent.class,
            com.zzw.github.graphql.schema.objects.RenamedTitleEvent.class,
            com.zzw.github.graphql.schema.objects.ReopenedEvent.class,
            com.zzw.github.graphql.schema.objects.SubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.UnassignedEvent.class,
            com.zzw.github.graphql.schema.objects.UnlabeledEvent.class,
            com.zzw.github.graphql.schema.objects.UnlockedEvent.class,
            com.zzw.github.graphql.schema.objects.UnsubscribedEvent.class,
    };

    public static final Class[] MilestoneItem_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] ProjectCardItem_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] PullRequestTimelineItem_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.AssignedEvent.class,
            com.zzw.github.graphql.schema.objects.BaseRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.CommitCommentThread.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.DemilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.DeployedEvent.class,
            com.zzw.github.graphql.schema.objects.DeploymentEnvironmentChangedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefRestoredEvent.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.LabeledEvent.class,
            com.zzw.github.graphql.schema.objects.LockedEvent.class,
            com.zzw.github.graphql.schema.objects.MergedEvent.class,
            com.zzw.github.graphql.schema.objects.MilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewThread.class,
            com.zzw.github.graphql.schema.objects.ReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.RenamedTitleEvent.class,
            com.zzw.github.graphql.schema.objects.ReopenedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewDismissedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestRemovedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestedEvent.class,
            com.zzw.github.graphql.schema.objects.SubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.UnassignedEvent.class,
            com.zzw.github.graphql.schema.objects.UnlabeledEvent.class,
            com.zzw.github.graphql.schema.objects.UnlockedEvent.class,
            com.zzw.github.graphql.schema.objects.UnsubscribedEvent.class,
    };

    public static final Class[] PullRequestTimelineItems_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.AddedToProjectEvent.class,
            com.zzw.github.graphql.schema.objects.AssignedEvent.class,
            com.zzw.github.graphql.schema.objects.BaseRefChangedEvent.class,
            com.zzw.github.graphql.schema.objects.BaseRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.CommentDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.ConvertedNoteToIssueEvent.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.DemilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.DeployedEvent.class,
            com.zzw.github.graphql.schema.objects.DeploymentEnvironmentChangedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefRestoredEvent.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.LabeledEvent.class,
            com.zzw.github.graphql.schema.objects.LockedEvent.class,
            com.zzw.github.graphql.schema.objects.MentionedEvent.class,
            com.zzw.github.graphql.schema.objects.MergedEvent.class,
            com.zzw.github.graphql.schema.objects.MilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.MovedColumnsInProjectEvent.class,
            com.zzw.github.graphql.schema.objects.PullRequestCommit.class,
            com.zzw.github.graphql.schema.objects.PullRequestCommitCommentThread.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewThread.class,
            com.zzw.github.graphql.schema.objects.PullRequestRevisionMarker.class,
            com.zzw.github.graphql.schema.objects.ReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.RemovedFromProjectEvent.class,
            com.zzw.github.graphql.schema.objects.RenamedTitleEvent.class,
            com.zzw.github.graphql.schema.objects.ReopenedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewDismissedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestRemovedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestedEvent.class,
            com.zzw.github.graphql.schema.objects.SubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.UnassignedEvent.class,
            com.zzw.github.graphql.schema.objects.UnlabeledEvent.class,
            com.zzw.github.graphql.schema.objects.UnlockedEvent.class,
            com.zzw.github.graphql.schema.objects.UnsubscribedEvent.class,
    };

    public static final Class[] PushAllowanceActor_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Team.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] ReferencedSubject_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] RenamedTitleSubject_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] RequestedReviewer_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Team.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] ReviewDismissalAllowanceActor_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Team.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] SearchResultItem_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.MarketplaceListing.class,
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };
}
