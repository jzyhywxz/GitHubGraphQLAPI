package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A team discussion.")
public class TeamDiscussion extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Comment, com.zzw.github.graphql.schema.interfaces.Deletable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Reactable, com.zzw.github.graphql.schema.interfaces.Subscribable, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable, com.zzw.github.graphql.schema.interfaces.Updatable, com.zzw.github.graphql.schema.interfaces.UpdatableComment {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="fromComment", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("When provided, filters the connection such that results begin with the comment with this number.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.TeamDiscussionCommentOrder", nonNull=@NonNull(""), description=@Description("Order for connection")),
    })
    @NonNull("!")
    @Description("A list of comments on this discussion.")
    private com.zzw.github.graphql.schema.objects.TeamDiscussionCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.TeamDiscussionCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.TeamDiscussionCommentConnection comments) { this.comments = comments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="content", type="com.zzw.github.graphql.schema.enums.ReactionContent", nonNull=@NonNull(""), description=@Description("Allows filtering Reactions by emoji.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.ReactionOrder", nonNull=@NonNull(""), description=@Description("Allows specifying the order in which reactions are returned.")),
    })
    @NonNull("!")
    @Description("A list of Reactions left on the Issue.")
    private com.zzw.github.graphql.schema.objects.ReactionConnection reactions;
    public com.zzw.github.graphql.schema.objects.ReactionConnection getReactions() { return this.reactions; }
    public void setReactions(com.zzw.github.graphql.schema.objects.ReactionConnection reactions) { this.reactions = reactions; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
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
    @Description("Author's association with the discussion's team.")
    private com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation;
    public com.zzw.github.graphql.schema.enums.CommentAuthorAssociation getAuthorAssociation() { return this.authorAssociation; }
    public void setAuthorAssociation(com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation) { this.authorAssociation = authorAssociation; }

    @NonNull("!")
    @Description("The body as Markdown.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("The discussion body rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML() { return this.bodyHTML; }
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML) { this.bodyHTML = bodyHTML; }

    @NonNull("!")
    @Description("The body rendered to text.")
    private com.zzw.github.graphql.schema.scalars.String bodyText;
    public com.zzw.github.graphql.schema.scalars.String getBodyText() { return this.bodyText; }
    public void setBodyText(com.zzw.github.graphql.schema.scalars.String bodyText) { this.bodyText = bodyText; }

    @NonNull("!")
    @Description("Identifies the discussion body hash.")
    private com.zzw.github.graphql.schema.scalars.String bodyVersion;
    public com.zzw.github.graphql.schema.scalars.String getBodyVersion() { return this.bodyVersion; }
    public void setBodyVersion(com.zzw.github.graphql.schema.scalars.String bodyVersion) { this.bodyVersion = bodyVersion; }

    @NonNull("!")
    @Description("The HTTP path for discussion comments")
    private com.zzw.github.graphql.schema.scalars.URI commentsResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getCommentsResourcePath() { return this.commentsResourcePath; }
    public void setCommentsResourcePath(com.zzw.github.graphql.schema.scalars.URI commentsResourcePath) { this.commentsResourcePath = commentsResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for discussion comments")
    private com.zzw.github.graphql.schema.scalars.URI commentsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getCommentsUrl() { return this.commentsUrl; }
    public void setCommentsUrl(com.zzw.github.graphql.schema.scalars.URI commentsUrl) { this.commentsUrl = commentsUrl; }

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

    @NonNull("!")
    @Description("Whether or not the discussion is pinned.")
    private com.zzw.github.graphql.schema.scalars.Boolean isPinned;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPinned() { return this.isPinned; }
    public void setIsPinned(com.zzw.github.graphql.schema.scalars.Boolean isPinned) { this.isPinned = isPinned; }

    @NonNull("!")
    @Description("Whether or not the discussion is only visible to team members and org admins.")
    private com.zzw.github.graphql.schema.scalars.Boolean isPrivate;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPrivate() { return this.isPrivate; }
    public void setIsPrivate(com.zzw.github.graphql.schema.scalars.Boolean isPrivate) { this.isPrivate = isPrivate; }

    @Description("The moment the editor made the last edit")
    private com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getLastEditedAt() { return this.lastEditedAt; }
    public void setLastEditedAt(com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt) { this.lastEditedAt = lastEditedAt; }

    @NonNull("!")
    @Description("Identifies the discussion within its team.")
    private com.zzw.github.graphql.schema.scalars.Int number;
    public com.zzw.github.graphql.schema.scalars.Int getNumber() { return this.number; }
    public void setNumber(com.zzw.github.graphql.schema.scalars.Int number) { this.number = number; }

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
    @Description("The HTTP path for this discussion")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("The team that defines the context of this discussion.")
    private com.zzw.github.graphql.schema.objects.Team team;
    public com.zzw.github.graphql.schema.objects.Team getTeam() { return this.team; }
    public void setTeam(com.zzw.github.graphql.schema.objects.Team team) { this.team = team; }

    @NonNull("!")
    @Description("The title of the discussion")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this discussion")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Check if the current viewer can delete this object.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelete;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanDelete() { return this.viewerCanDelete; }
    public void setViewerCanDelete(com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelete) { this.viewerCanDelete = viewerCanDelete; }

    @NonNull("!")
    @Description("Whether or not the current viewer can pin this discussion.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanPin;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanPin() { return this.viewerCanPin; }
    public void setViewerCanPin(com.zzw.github.graphql.schema.scalars.Boolean viewerCanPin) { this.viewerCanPin = viewerCanPin; }

    @NonNull("!")
    @Description("Can user react to this subject")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanReact;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanReact() { return this.viewerCanReact; }
    public void setViewerCanReact(com.zzw.github.graphql.schema.scalars.Boolean viewerCanReact) { this.viewerCanReact = viewerCanReact; }

    @NonNull("!")
    @Description("Check if the viewer is able to change their subscription status for the repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanSubscribe() { return this.viewerCanSubscribe; }
    public void setViewerCanSubscribe(com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe) { this.viewerCanSubscribe = viewerCanSubscribe; }

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

    @Description("Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.")
    private com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription;
    public com.zzw.github.graphql.schema.enums.SubscriptionState getViewerSubscription() { return this.viewerSubscription; }
    public void setViewerSubscription(com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription) { this.viewerSubscription = viewerSubscription; }
}
