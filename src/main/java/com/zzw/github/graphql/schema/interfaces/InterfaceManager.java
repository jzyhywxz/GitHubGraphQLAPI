package com.zzw.github.graphql.schema.interfaces;

public class InterfaceManager {
    public static final Class[] Actor_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Bot.class,
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] Assignable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] Closable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.Milestone.class,
            com.zzw.github.graphql.schema.objects.Project.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] Comment_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.GistComment.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
    };

    public static final Class[] Deletable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.GistComment.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
    };

    public static final Class[] GitObject_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Blob.class,
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.Tag.class,
            com.zzw.github.graphql.schema.objects.Tree.class,
    };

    public static final Class[] GitSignature_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.GpgSignature.class,
            com.zzw.github.graphql.schema.objects.SmimeSignature.class,
            com.zzw.github.graphql.schema.objects.UnknownSignature.class,
    };

    public static final Class[] HovercardContext_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.GenericHovercardContext.class,
            com.zzw.github.graphql.schema.objects.OrganizationTeamsHovercardContext.class,
            com.zzw.github.graphql.schema.objects.OrganizationsHovercardContext.class,
    };

    public static final Class[] Labelable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] Lockable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
    };

    public static final Class[] Node_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.AddedToProjectEvent.class,
            com.zzw.github.graphql.schema.objects.App.class,
            com.zzw.github.graphql.schema.objects.AssignedEvent.class,
            com.zzw.github.graphql.schema.objects.BaseRefChangedEvent.class,
            com.zzw.github.graphql.schema.objects.BaseRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.Blob.class,
            com.zzw.github.graphql.schema.objects.Bot.class,
            com.zzw.github.graphql.schema.objects.CheckRun.class,
            com.zzw.github.graphql.schema.objects.CheckSuite.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.CommentDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.CommitCommentThread.class,
            com.zzw.github.graphql.schema.objects.ConvertedNoteToIssueEvent.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.DemilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.DependencyGraphManifest.class,
            com.zzw.github.graphql.schema.objects.DeployKey.class,
            com.zzw.github.graphql.schema.objects.DeployedEvent.class,
            com.zzw.github.graphql.schema.objects.Deployment.class,
            com.zzw.github.graphql.schema.objects.DeploymentEnvironmentChangedEvent.class,
            com.zzw.github.graphql.schema.objects.DeploymentStatus.class,
            com.zzw.github.graphql.schema.objects.ExternalIdentity.class,
            com.zzw.github.graphql.schema.objects.Gist.class,
            com.zzw.github.graphql.schema.objects.GistComment.class,
            com.zzw.github.graphql.schema.objects.HeadRefDeletedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefForcePushedEvent.class,
            com.zzw.github.graphql.schema.objects.HeadRefRestoredEvent.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.Label.class,
            com.zzw.github.graphql.schema.objects.LabeledEvent.class,
            com.zzw.github.graphql.schema.objects.Language.class,
            com.zzw.github.graphql.schema.objects.License.class,
            com.zzw.github.graphql.schema.objects.LockedEvent.class,
            com.zzw.github.graphql.schema.objects.MarketplaceCategory.class,
            com.zzw.github.graphql.schema.objects.MarketplaceListing.class,
            com.zzw.github.graphql.schema.objects.MentionedEvent.class,
            com.zzw.github.graphql.schema.objects.MergedEvent.class,
            com.zzw.github.graphql.schema.objects.Milestone.class,
            com.zzw.github.graphql.schema.objects.MilestonedEvent.class,
            com.zzw.github.graphql.schema.objects.MovedColumnsInProjectEvent.class,
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.OrganizationIdentityProvider.class,
            com.zzw.github.graphql.schema.objects.OrganizationInvitation.class,
            com.zzw.github.graphql.schema.objects.Project.class,
            com.zzw.github.graphql.schema.objects.ProjectCard.class,
            com.zzw.github.graphql.schema.objects.ProjectColumn.class,
            com.zzw.github.graphql.schema.objects.ProtectedBranch.class,
            com.zzw.github.graphql.schema.objects.PublicKey.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestCommit.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewThread.class,
            com.zzw.github.graphql.schema.objects.Push.class,
            com.zzw.github.graphql.schema.objects.PushAllowance.class,
            com.zzw.github.graphql.schema.objects.Reaction.class,
            com.zzw.github.graphql.schema.objects.Ref.class,
            com.zzw.github.graphql.schema.objects.ReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.Release.class,
            com.zzw.github.graphql.schema.objects.ReleaseAsset.class,
            com.zzw.github.graphql.schema.objects.RemovedFromProjectEvent.class,
            com.zzw.github.graphql.schema.objects.RenamedTitleEvent.class,
            com.zzw.github.graphql.schema.objects.ReopenedEvent.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.RepositoryInvitation.class,
            com.zzw.github.graphql.schema.objects.RepositoryTopic.class,
            com.zzw.github.graphql.schema.objects.RepositoryVulnerabilityAlert.class,
            com.zzw.github.graphql.schema.objects.ReviewDismissalAllowance.class,
            com.zzw.github.graphql.schema.objects.ReviewDismissedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequest.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestRemovedEvent.class,
            com.zzw.github.graphql.schema.objects.ReviewRequestedEvent.class,
            com.zzw.github.graphql.schema.objects.Status.class,
            com.zzw.github.graphql.schema.objects.StatusContext.class,
            com.zzw.github.graphql.schema.objects.SubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.Tag.class,
            com.zzw.github.graphql.schema.objects.Team.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
            com.zzw.github.graphql.schema.objects.Topic.class,
            com.zzw.github.graphql.schema.objects.Tree.class,
            com.zzw.github.graphql.schema.objects.UnassignedEvent.class,
            com.zzw.github.graphql.schema.objects.UnlabeledEvent.class,
            com.zzw.github.graphql.schema.objects.UnlockedEvent.class,
            com.zzw.github.graphql.schema.objects.UnsubscribedEvent.class,
            com.zzw.github.graphql.schema.objects.User.class,
            com.zzw.github.graphql.schema.objects.UserContentEdit.class,
    };

    public static final Class[] ProjectOwner_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
    };

    public static final Class[] Reactable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
    };

    public static final Class[] RegistryPackageOwner_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] RegistryPackageSearch_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] RepositoryInfo_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Repository.class,
    };

    public static final Class[] RepositoryNode_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.CommitCommentThread.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.RepositoryVulnerabilityAlert.class,
    };

    public static final Class[] RepositoryOwner_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] Starrable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Gist.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
    };

    public static final Class[] Subscribable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Commit.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.Team.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
    };

    public static final Class[] UniformResourceLocatable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.Bot.class,
            com.zzw.github.graphql.schema.objects.CheckRun.class,
            com.zzw.github.graphql.schema.objects.ClosedEvent.class,
            com.zzw.github.graphql.schema.objects.CrossReferencedEvent.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.MergedEvent.class,
            com.zzw.github.graphql.schema.objects.Milestone.class,
            com.zzw.github.graphql.schema.objects.Organization.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestCommit.class,
            com.zzw.github.graphql.schema.objects.Release.class,
            com.zzw.github.graphql.schema.objects.Repository.class,
            com.zzw.github.graphql.schema.objects.RepositoryTopic.class,
            com.zzw.github.graphql.schema.objects.ReviewDismissedEvent.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
            com.zzw.github.graphql.schema.objects.User.class,
    };

    public static final Class[] Updatable_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.GistComment.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.Project.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
    };

    public static final Class[] UpdatableComment_TYPES = new Class[]{
            com.zzw.github.graphql.schema.objects.CommitComment.class,
            com.zzw.github.graphql.schema.objects.GistComment.class,
            com.zzw.github.graphql.schema.objects.Issue.class,
            com.zzw.github.graphql.schema.objects.IssueComment.class,
            com.zzw.github.graphql.schema.objects.PullRequest.class,
            com.zzw.github.graphql.schema.objects.PullRequestReview.class,
            com.zzw.github.graphql.schema.objects.PullRequestReviewComment.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussion.class,
            com.zzw.github.graphql.schema.objects.TeamDiscussionComment.class,
    };
}
