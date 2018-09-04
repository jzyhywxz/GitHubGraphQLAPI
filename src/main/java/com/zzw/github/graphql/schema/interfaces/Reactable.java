package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.CommitComment",
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.IssueComment",
        "com.zzw.github.graphql.schema.objects.PullRequest",
        "com.zzw.github.graphql.schema.objects.PullRequestReviewComment",
        "com.zzw.github.graphql.schema.objects.TeamDiscussion",
        "com.zzw.github.graphql.schema.objects.TeamDiscussionComment",
})
@Description("Represents a subject that can be reacted on.")
public interface Reactable {
    @Description("Identifies the primary key from the database.")
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId();
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId);

    @NonNull("!")
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    @NonNull("[!]")
    @Description("A list of reactions grouped by content left on the subject.")
    public com.zzw.github.graphql.schema.objects.ReactionGroup[] getReactionGroups();
    public void setReactionGroups(com.zzw.github.graphql.schema.objects.ReactionGroup[] reactionGroups);

    @NonNull("!")
    @Description("Can user react to this subject")
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanReact();
    public void setViewerCanReact(com.zzw.github.graphql.schema.scalars.Boolean viewerCanReact);
}
