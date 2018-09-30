package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a commit comment thread part of a pull request.")
public class PullRequestCommitCommentThread extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.RepositoryNode {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("The comments that exist in this thread.")
    private com.zzw.github.graphql.schema.objects.CommitCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.CommitCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.CommitCommentConnection comments) { this.comments = comments; }

    @NonNull("!")
    @Description("The commit the comments were made on.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The file the comments were made on.")
    private com.zzw.github.graphql.schema.scalars.String path;
    public com.zzw.github.graphql.schema.scalars.String getPath() { return this.path; }
    public void setPath(com.zzw.github.graphql.schema.scalars.String path) { this.path = path; }

    @Description("The position in the diff for the commit that the comment was made on.")
    private com.zzw.github.graphql.schema.scalars.Int position;
    public com.zzw.github.graphql.schema.scalars.Int getPosition() { return this.position; }
    public void setPosition(com.zzw.github.graphql.schema.scalars.Int position) { this.position = position; }

    @NonNull("!")
    @Description("The pull request this commit comment thread belongs to")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @NonNull("!")
    @Description("The repository associated with this node.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }
}
