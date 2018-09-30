package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A threaded list of comments for a given pull request.")
public class PullRequestReviewThread extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of pull request comments associated with the thread.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.PullRequestReviewCommentConnection comments) { this.comments = comments; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether this thread has been resolved")
    private com.zzw.github.graphql.schema.scalars.Boolean isResolved;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsResolved() { return this.isResolved; }
    public void setIsResolved(com.zzw.github.graphql.schema.scalars.Boolean isResolved) { this.isResolved = isResolved; }

    @NonNull("!")
    @Description("Identifies the pull request associated with this thread.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @NonNull("!")
    @Description("Identifies the repository associated with this thread.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("The user who resolved this thread")
    private com.zzw.github.graphql.schema.objects.User resolvedBy;
    public com.zzw.github.graphql.schema.objects.User getResolvedBy() { return this.resolvedBy; }
    public void setResolvedBy(com.zzw.github.graphql.schema.objects.User resolvedBy) { this.resolvedBy = resolvedBy; }

    @NonNull("!")
    @Description("Whether or not the viewer can resolve this thread")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanResolve;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanResolve() { return this.viewerCanResolve; }
    public void setViewerCanResolve(com.zzw.github.graphql.schema.scalars.Boolean viewerCanResolve) { this.viewerCanResolve = viewerCanResolve; }

    @NonNull("!")
    @Description("Whether or not the viewer can unresolve this thread")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanUnresolve;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanUnresolve() { return this.viewerCanUnresolve; }
    public void setViewerCanUnresolve(com.zzw.github.graphql.schema.scalars.Boolean viewerCanUnresolve) { this.viewerCanUnresolve = viewerCanUnresolve; }
}
