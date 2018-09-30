package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents the latest point in the pull request timeline for which the viewer has seen the pull request's commits.")
public class PullRequestRevisionMarker extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    @Description("The last commit the viewer has seen.")
    private com.zzw.github.graphql.schema.objects.Commit lastSeenCommit;
    public com.zzw.github.graphql.schema.objects.Commit getLastSeenCommit() { return this.lastSeenCommit; }
    public void setLastSeenCommit(com.zzw.github.graphql.schema.objects.Commit lastSeenCommit) { this.lastSeenCommit = lastSeenCommit; }

    @NonNull("!")
    @Description("The pull request to which the marker belongs.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }
}
