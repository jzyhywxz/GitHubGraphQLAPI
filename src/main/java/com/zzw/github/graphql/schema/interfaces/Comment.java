package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.CommitComment",
        "com.zzw.github.graphql.schema.objects.GistComment",
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.IssueComment",
        "com.zzw.github.graphql.schema.objects.PullRequest",
        "com.zzw.github.graphql.schema.objects.PullRequestReview",
        "com.zzw.github.graphql.schema.objects.PullRequestReviewComment",
        "com.zzw.github.graphql.schema.objects.TeamDiscussion",
        "com.zzw.github.graphql.schema.objects.TeamDiscussionComment",
})
@Description("Represents a comment.")
public interface Comment {
    @Description("The actor who authored the comment.")
    public com.zzw.github.graphql.schema.interfaces.Actor getAuthor();
    public void setAuthor(com.zzw.github.graphql.schema.interfaces.Actor author);

    @NonNull("!")
    @Description("Author's association with the subject of the comment.")
    public com.zzw.github.graphql.schema.enums.CommentAuthorAssociation getAuthorAssociation();
    public void setAuthorAssociation(com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation);

    @NonNull("!")
    @Description("The body as Markdown.")
    public com.zzw.github.graphql.schema.scalars.String getBody();
    public void setBody(com.zzw.github.graphql.schema.scalars.String body);

    @NonNull("!")
    @Description("The body rendered to HTML.")
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML();
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML);

    @NonNull("!")
    @Description("The body rendered to text.")
    public com.zzw.github.graphql.schema.scalars.String getBodyText();
    public void setBodyText(com.zzw.github.graphql.schema.scalars.String bodyText);

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt();
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt);

    @NonNull("!")
    @Description("Check if this comment was created via an email reply.")
    public com.zzw.github.graphql.schema.scalars.Boolean getCreatedViaEmail();
    public void setCreatedViaEmail(com.zzw.github.graphql.schema.scalars.Boolean createdViaEmail);

    @Description("The actor who edited the comment.")
    public com.zzw.github.graphql.schema.interfaces.Actor getEditor();
    public void setEditor(com.zzw.github.graphql.schema.interfaces.Actor editor);

    @NonNull("!")
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    @NonNull("!")
    @Description("Check if this comment was edited and includes an edit with the creation data")
    public com.zzw.github.graphql.schema.scalars.Boolean getIncludesCreatedEdit();
    public void setIncludesCreatedEdit(com.zzw.github.graphql.schema.scalars.Boolean includesCreatedEdit);

    @Description("The moment the editor made the last edit")
    public com.zzw.github.graphql.schema.scalars.DateTime getLastEditedAt();
    public void setLastEditedAt(com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt);

    @Description("Identifies when the comment was published at.")
    public com.zzw.github.graphql.schema.scalars.DateTime getPublishedAt();
    public void setPublishedAt(com.zzw.github.graphql.schema.scalars.DateTime publishedAt);

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt();
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt);

    @NonNull("!")
    @Description("Did the viewer author this comment.")
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerDidAuthor();
    public void setViewerDidAuthor(com.zzw.github.graphql.schema.scalars.Boolean viewerDidAuthor);
}
