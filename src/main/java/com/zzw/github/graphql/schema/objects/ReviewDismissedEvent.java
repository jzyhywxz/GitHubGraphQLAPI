package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'review_dismissed' event on a given issue or pull request.")
public class ReviewDismissedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the message associated with the 'review_dismissed' event.")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("The message associated with the event, rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML messageHtml;
    public com.zzw.github.graphql.schema.scalars.HTML getMessageHtml() { return this.messageHtml; }
    public void setMessageHtml(com.zzw.github.graphql.schema.scalars.HTML messageHtml) { this.messageHtml = messageHtml; }

    @NonNull("!")
    @Description("Identifies the previous state of the review with the 'review_dismissed' event.")
    private com.zzw.github.graphql.schema.enums.PullRequestReviewState previousReviewState;
    public com.zzw.github.graphql.schema.enums.PullRequestReviewState getPreviousReviewState() { return this.previousReviewState; }
    public void setPreviousReviewState(com.zzw.github.graphql.schema.enums.PullRequestReviewState previousReviewState) { this.previousReviewState = previousReviewState; }

    @NonNull("!")
    @Description("PullRequest referenced by event.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @Description("Identifies the commit which caused the review to become stale.")
    private com.zzw.github.graphql.schema.objects.PullRequestCommit pullRequestCommit;
    public com.zzw.github.graphql.schema.objects.PullRequestCommit getPullRequestCommit() { return this.pullRequestCommit; }
    public void setPullRequestCommit(com.zzw.github.graphql.schema.objects.PullRequestCommit pullRequestCommit) { this.pullRequestCommit = pullRequestCommit; }

    @NonNull("!")
    @Description("The HTTP path for this review dismissed event.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("Identifies the review associated with the 'review_dismissed' event.")
    private com.zzw.github.graphql.schema.objects.PullRequestReview review;
    public com.zzw.github.graphql.schema.objects.PullRequestReview getReview() { return this.review; }
    public void setReview(com.zzw.github.graphql.schema.objects.PullRequestReview review) { this.review = review; }

    @NonNull("!")
    @Description("The HTTP URL for this review dismissed event.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
