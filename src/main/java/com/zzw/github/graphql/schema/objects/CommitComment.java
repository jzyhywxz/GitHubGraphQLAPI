package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a comment on a given Commit.")
public class CommitComment extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Comment, com.zzw.github.graphql.schema.interfaces.Deletable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Reactable, com.zzw.github.graphql.schema.interfaces.RepositoryNode, com.zzw.github.graphql.schema.interfaces.Updatable, com.zzw.github.graphql.schema.interfaces.UpdatableComment {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="content", type="com.zzw.github.graphql.schema.enums.ReactionContent", nonNull=@NonNull(""), description=@Description("Allows filtering Reactions by emoji.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.ReactionOrder", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @NonNull("!")
    @Description("A list of Reactions left on the Issue.")
    private com.zzw.github.graphql.schema.objects.ReactionConnection reactions;
    public com.zzw.github.graphql.schema.objects.ReactionConnection getReactions() { return this.reactions; }
    public void setReactions(com.zzw.github.graphql.schema.objects.ReactionConnection reactions) { this.reactions = reactions; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("A list of edits to this content.")
    private com.zzw.github.graphql.schema.objects.UserContentEditConnection userContentEdits;
    public com.zzw.github.graphql.schema.objects.UserContentEditConnection getUserContentEdits() { return this.userContentEdits; }
    public void setUserContentEdits(com.zzw.github.graphql.schema.objects.UserContentEditConnection userContentEdits) { this.userContentEdits = userContentEdits; }

    @Description("The actor who authored the comment.")
    private com.zzw.github.graphql.schema.interfaces.Actor author;
    public com.zzw.github.graphql.schema.interfaces.Actor getAuthor() { return this.author; }
    public void setAuthor(com.zzw.github.graphql.schema.interfaces.Actor author) { this.author = author; }

    @NonNull("!")
    @Description("Author's association with the subject of the comment.")
    private com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation;
    public com.zzw.github.graphql.schema.enums.CommentAuthorAssociation getAuthorAssociation() { return this.authorAssociation; }
    public void setAuthorAssociation(com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation) { this.authorAssociation = authorAssociation; }

    @NonNull("!")
    @Description("Identifies the comment body.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("Identifies the comment body rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML() { return this.bodyHTML; }
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML) { this.bodyHTML = bodyHTML; }

    @NonNull("!")
    @Description("The body rendered to text.")
    private com.zzw.github.graphql.schema.scalars.String bodyText;
    public com.zzw.github.graphql.schema.scalars.String getBodyText() { return this.bodyText; }
    public void setBodyText(com.zzw.github.graphql.schema.scalars.String bodyText) { this.bodyText = bodyText; }

    @Description("Identifies the commit associated with the comment, if the commit exists.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    @Description("Check if this comment was created via an email reply.")
    private com.zzw.github.graphql.schema.scalars.Boolean createdViaEmail;
    public com.zzw.github.graphql.schema.scalars.Boolean getCreatedViaEmail() { return this.createdViaEmail; }
    public void setCreatedViaEmail(com.zzw.github.graphql.schema.scalars.Boolean createdViaEmail) { this.createdViaEmail = createdViaEmail; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @Description("The actor who edited the comment.")
    private com.zzw.github.graphql.schema.interfaces.Actor editor;
    public com.zzw.github.graphql.schema.interfaces.Actor getEditor() { return this.editor; }
    public void setEditor(com.zzw.github.graphql.schema.interfaces.Actor editor) { this.editor = editor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Check if this comment was edited and includes an edit with the creation data")
    private com.zzw.github.graphql.schema.scalars.Boolean includesCreatedEdit;
    public com.zzw.github.graphql.schema.scalars.Boolean getIncludesCreatedEdit() { return this.includesCreatedEdit; }
    public void setIncludesCreatedEdit(com.zzw.github.graphql.schema.scalars.Boolean includesCreatedEdit) { this.includesCreatedEdit = includesCreatedEdit; }

    @Description("The moment the editor made the last edit")
    private com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getLastEditedAt() { return this.lastEditedAt; }
    public void setLastEditedAt(com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt) { this.lastEditedAt = lastEditedAt; }

    @Description("Identifies the file path associated with the comment.")
    private com.zzw.github.graphql.schema.scalars.String path;
    public com.zzw.github.graphql.schema.scalars.String getPath() { return this.path; }
    public void setPath(com.zzw.github.graphql.schema.scalars.String path) { this.path = path; }

    @Description("Identifies the line position associated with the comment.")
    private com.zzw.github.graphql.schema.scalars.Int position;
    public com.zzw.github.graphql.schema.scalars.Int getPosition() { return this.position; }
    public void setPosition(com.zzw.github.graphql.schema.scalars.Int position) { this.position = position; }

    @Description("Identifies when the comment was published at.")
    private com.zzw.github.graphql.schema.scalars.DateTime publishedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getPublishedAt() { return this.publishedAt; }
    public void setPublishedAt(com.zzw.github.graphql.schema.scalars.DateTime publishedAt) { this.publishedAt = publishedAt; }

    @NonNull("[!]")
    @Description("A list of reactions grouped by content left on the subject.")
    private com.zzw.github.graphql.schema.objects.ReactionGroup[] reactionGroups;
    public com.zzw.github.graphql.schema.objects.ReactionGroup[] getReactionGroups() { return this.reactionGroups; }
    public void setReactionGroups(com.zzw.github.graphql.schema.objects.ReactionGroup[] reactionGroups) { this.reactionGroups = reactionGroups; }

    @NonNull("!")
    @Description("The repository associated with this node.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path permalink for this commit comment.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL permalink for this commit comment.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Check if the current viewer can delete this object.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelete;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanDelete() { return this.viewerCanDelete; }
    public void setViewerCanDelete(com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelete) { this.viewerCanDelete = viewerCanDelete; }

    @NonNull("!")
    @Description("Can user react to this subject")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanReact;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanReact() { return this.viewerCanReact; }
    public void setViewerCanReact(com.zzw.github.graphql.schema.scalars.Boolean viewerCanReact) { this.viewerCanReact = viewerCanReact; }

    @NonNull("!")
    @Description("Check if the current viewer can update this object.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdate;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanUpdate() { return this.viewerCanUpdate; }
    public void setViewerCanUpdate(com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdate) { this.viewerCanUpdate = viewerCanUpdate; }

    @NonNull("[!]!")
    @Description("Reasons why the current viewer can not update this comment.")
    private com.zzw.github.graphql.schema.enums.CommentCannotUpdateReason[] viewerCannotUpdateReasons;
    public com.zzw.github.graphql.schema.enums.CommentCannotUpdateReason[] getViewerCannotUpdateReasons() { return this.viewerCannotUpdateReasons; }
    public void setViewerCannotUpdateReasons(com.zzw.github.graphql.schema.enums.CommentCannotUpdateReason[] viewerCannotUpdateReasons) { this.viewerCannotUpdateReasons = viewerCannotUpdateReasons; }

    @NonNull("!")
    @Description("Did the viewer author this comment.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerDidAuthor;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerDidAuthor() { return this.viewerDidAuthor; }
    public void setViewerDidAuthor(com.zzw.github.graphql.schema.scalars.Boolean viewerDidAuthor) { this.viewerDidAuthor = viewerDidAuthor; }
}
