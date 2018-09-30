package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An Issue is a place to discuss ideas, enhancements, tasks, and bugs for a project.")
public class Issue extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Assignable, com.zzw.github.graphql.schema.interfaces.Closable, com.zzw.github.graphql.schema.interfaces.Comment, com.zzw.github.graphql.schema.interfaces.Labelable, com.zzw.github.graphql.schema.interfaces.Lockable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Reactable, com.zzw.github.graphql.schema.interfaces.RepositoryNode, com.zzw.github.graphql.schema.interfaces.Subscribable, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable, com.zzw.github.graphql.schema.interfaces.Updatable, com.zzw.github.graphql.schema.interfaces.UpdatableComment {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of Users assigned to this object.")
    private com.zzw.github.graphql.schema.objects.UserConnection assignees;
    public com.zzw.github.graphql.schema.objects.UserConnection getAssignees() { return this.assignees; }
    public void setAssignees(com.zzw.github.graphql.schema.objects.UserConnection assignees) { this.assignees = assignees; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of comments associated with the Issue.")
    private com.zzw.github.graphql.schema.objects.IssueCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.IssueCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.IssueCommentConnection comments) { this.comments = comments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @Description("A list of labels associated with the object.")
    private com.zzw.github.graphql.schema.objects.LabelConnection labels;
    public com.zzw.github.graphql.schema.objects.LabelConnection getLabels() { return this.labels; }
    public void setLabels(com.zzw.github.graphql.schema.objects.LabelConnection labels) { this.labels = labels; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of Users that are participating in the Issue conversation.")
    private com.zzw.github.graphql.schema.objects.UserConnection participants;
    public com.zzw.github.graphql.schema.objects.UserConnection getParticipants() { return this.participants; }
    public void setParticipants(com.zzw.github.graphql.schema.objects.UserConnection participants) { this.participants = participants; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="archivedStates", type="com.zzw.github.graphql.schema.enums.ProjectCardArchivedState[]", nonNull=@NonNull(""), description=@Description("A list of archived states to filter the cards by")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("List of project cards associated with this issue.")
    private com.zzw.github.graphql.schema.objects.ProjectCardConnection projectCards;
    public com.zzw.github.graphql.schema.objects.ProjectCardConnection getProjectCards() { return this.projectCards; }
    public void setProjectCards(com.zzw.github.graphql.schema.objects.ProjectCardConnection projectCards) { this.projectCards = projectCards; }

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
        @Argument(name="since", type="com.zzw.github.graphql.schema.scalars.DateTime", nonNull=@NonNull(""), description=@Description("Allows filtering timeline events by a since timestamp.")),
    })
    @NonNull("!")
    @Description("A list of events, comments, commits, etc. associated with the issue.")
    private com.zzw.github.graphql.schema.objects.IssueTimelineConnection timeline;
    public com.zzw.github.graphql.schema.objects.IssueTimelineConnection getTimeline() { return this.timeline; }
    public void setTimeline(com.zzw.github.graphql.schema.objects.IssueTimelineConnection timeline) { this.timeline = timeline; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="itemTypes", type="com.zzw.github.graphql.schema.enums.IssueTimelineItemsItemType[]", nonNull=@NonNull("[!]"), description=@Description("Filter timeline items by type.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="since", type="com.zzw.github.graphql.schema.scalars.DateTime", nonNull=@NonNull(""), description=@Description("Filter timeline items by a since timestamp.")),
        @Argument(name="skip", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Skips the first n elements in the list.")),
    })
    @NonNull("!")
    @Description("A list of events, comments, commits, etc. associated with the issue.")
    private com.zzw.github.graphql.schema.objects.IssueTimelineItemsConnection timelineItems;
    public com.zzw.github.graphql.schema.objects.IssueTimelineItemsConnection getTimelineItems() { return this.timelineItems; }
    public void setTimelineItems(com.zzw.github.graphql.schema.objects.IssueTimelineItemsConnection timelineItems) { this.timelineItems = timelineItems; }

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

    @Description("Reason that the conversation was locked.")
    private com.zzw.github.graphql.schema.enums.LockReason activeLockReason;
    public com.zzw.github.graphql.schema.enums.LockReason getActiveLockReason() { return this.activeLockReason; }
    public void setActiveLockReason(com.zzw.github.graphql.schema.enums.LockReason activeLockReason) { this.activeLockReason = activeLockReason; }

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
    @Description("Identifies the body of the issue.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("Identifies the body of the issue rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML() { return this.bodyHTML; }
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML) { this.bodyHTML = bodyHTML; }

    @NonNull("!")
    @Description("Identifies the body of the issue rendered to text.")
    private com.zzw.github.graphql.schema.scalars.String bodyText;
    public com.zzw.github.graphql.schema.scalars.String getBodyText() { return this.bodyText; }
    public void setBodyText(com.zzw.github.graphql.schema.scalars.String bodyText) { this.bodyText = bodyText; }

    @NonNull("!")
    @Description("true if the object is closed (definition of closed may depend on type)")
    private com.zzw.github.graphql.schema.scalars.Boolean closed;
    public com.zzw.github.graphql.schema.scalars.Boolean getClosed() { return this.closed; }
    public void setClosed(com.zzw.github.graphql.schema.scalars.Boolean closed) { this.closed = closed; }

    @Description("Identifies the date and time when the object was closed.")
    private com.zzw.github.graphql.schema.scalars.DateTime closedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getClosedAt() { return this.closedAt; }
    public void setClosedAt(com.zzw.github.graphql.schema.scalars.DateTime closedAt) { this.closedAt = closedAt; }

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

    @NonNull("!")
    @Description("true if the object is locked")
    private com.zzw.github.graphql.schema.scalars.Boolean locked;
    public com.zzw.github.graphql.schema.scalars.Boolean getLocked() { return this.locked; }
    public void setLocked(com.zzw.github.graphql.schema.scalars.Boolean locked) { this.locked = locked; }

    @Description("Identifies the milestone associated with the issue.")
    private com.zzw.github.graphql.schema.objects.Milestone milestone;
    public com.zzw.github.graphql.schema.objects.Milestone getMilestone() { return this.milestone; }
    public void setMilestone(com.zzw.github.graphql.schema.objects.Milestone milestone) { this.milestone = milestone; }

    @NonNull("!")
    @Description("Identifies the issue number.")
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
    @Description("The repository associated with this node.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this issue")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Identifies the state of the issue.")
    private com.zzw.github.graphql.schema.enums.IssueState state;
    public com.zzw.github.graphql.schema.enums.IssueState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.IssueState state) { this.state = state; }

    @NonNull("!")
    @Description("Identifies the issue title.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this issue")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

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
