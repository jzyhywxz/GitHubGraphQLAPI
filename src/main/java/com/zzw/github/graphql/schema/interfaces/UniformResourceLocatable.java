package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Bot",
        "com.zzw.github.graphql.schema.objects.CheckRun",
        "com.zzw.github.graphql.schema.objects.ClosedEvent",
        "com.zzw.github.graphql.schema.objects.CrossReferencedEvent",
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.MergedEvent",
        "com.zzw.github.graphql.schema.objects.Milestone",
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.PullRequest",
        "com.zzw.github.graphql.schema.objects.PullRequestCommit",
        "com.zzw.github.graphql.schema.objects.Release",
        "com.zzw.github.graphql.schema.objects.Repository",
        "com.zzw.github.graphql.schema.objects.RepositoryTopic",
        "com.zzw.github.graphql.schema.objects.ReviewDismissedEvent",
        "com.zzw.github.graphql.schema.objects.TeamDiscussion",
        "com.zzw.github.graphql.schema.objects.TeamDiscussionComment",
        "com.zzw.github.graphql.schema.objects.User",
})
@Description("Represents a type that can be retrieved by a URL.")
public interface UniformResourceLocatable {
    @NonNull("!")
    @Description("The HTML path to this resource.")
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath();
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath);

    @NonNull("!")
    @Description("The URL to this resource.")
    public com.zzw.github.graphql.schema.scalars.URI getUrl();
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url);
}
