package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A repository pull request.")
public class PullRequest extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Assignable, com.zzw.github.graphql.schema.interfaces.Closable, com.zzw.github.graphql.schema.interfaces.Comment, com.zzw.github.graphql.schema.interfaces.Labelable, com.zzw.github.graphql.schema.interfaces.Lockable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Reactable, com.zzw.github.graphql.schema.interfaces.RepositoryNode, com.zzw.github.graphql.schema.interfaces.Subscribable, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable, com.zzw.github.graphql.schema.interfaces.Updatable, com.zzw.github.graphql.schema.interfaces.UpdatableComment {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of Users assigned to this object.")
    private com.zzw.github.graphql.schema.objects.UserConnection assignees;
    public com.zzw.github.graphql.schema.objects.UserConnection getAssignees() { return this.assignees; }
    public void setAssignees(com.zzw.github.graphql.schema.objects.UserConnection assignees) { this.assignees = assignees; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of comments associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.IssueCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.IssueCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.IssueCommentConnection comments) { this.comments = comments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of commits present in this pull request's head branch not present in the base branch.")
    private com.zzw.github.graphql.schema.objects.PullRequestCommitConnection commits;
    public com.zzw.github.graphql.schema.objects.PullRequestCommitConnection getCommits() { return this.commits; }
    public void setCommits(com.zzw.github.graphql.schema.objects.PullRequestCommitConnection commits) { this.commits = commits; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("A list of labels associated with the object.")
    private com.zzw.github.graphql.schema.objects.LabelConnection labels;
    public com.zzw.github.graphql.schema.objects.LabelConnection getLabels() { return this.labels; }
    public void setLabels(com.zzw.github.graphql.schema.objects.LabelConnection labels) { this.labels = labels; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of Users that are participating in the Pull Request conversation.")
    private com.zzw.github.graphql.schema.objects.UserConnection participants;
    public com.zzw.github.graphql.schema.objects.UserConnection getParticipants() { return this.participants; }
    public void setParticipants(com.zzw.github.graphql.schema.objects.UserConnection participants) { this.participants = participants; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("List of project cards associated with this pull request.")
    private com.zzw.github.graphql.schema.objects.ProjectCardConnection projectCards;
    public com.zzw.github.graphql.schema.objects.ProjectCardConnection getProjectCards() { return this.projectCards; }
    public void setProjectCards(com.zzw.github.graphql.schema.objects.ProjectCardConnection projectCards) { this.projectCards = projectCards; }

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
    @Description("A list of review requests associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.ReviewRequestConnection reviewRequests;
    public com.zzw.github.graphql.schema.objects.ReviewRequestConnection getReviewRequests() { return this.reviewRequests; }
    public void setReviewRequests(com.zzw.github.graphql.schema.objects.ReviewRequestConnection reviewRequests) { this.reviewRequests = reviewRequests; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="author", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Filter by author of the review.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="states", type="com.zzw.github.graphql.schema.enums.PullRequestReviewState[]", nonNull=@NonNull("[!]"), description=@Description("Returns the last")),
    })
    @Description("A list of reviews associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.PullRequestReviewConnection reviews;
    public com.zzw.github.graphql.schema.objects.PullRequestReviewConnection getReviews() { return this.reviews; }
    public void setReviews(com.zzw.github.graphql.schema.objects.PullRequestReviewConnection reviews) { this.reviews = reviews; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="since", type="com.zzw.github.graphql.schema.scalars.DateTime", nonNull=@NonNull(""), description=@Description("Returns the last")),
    })
    @NonNull("!")
    @Description("A list of events, comments, commits, etc. associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.PullRequestTimelineConnection timeline;
    public com.zzw.github.graphql.schema.objects.PullRequestTimelineConnection getTimeline() { return this.timeline; }
    public void setTimeline(com.zzw.github.graphql.schema.objects.PullRequestTimelineConnection timeline) { this.timeline = timeline; }

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

    @Description("Reason that the conversation was locked.")
    private com.zzw.github.graphql.schema.enums.LockReason activeLockReason;
    public com.zzw.github.graphql.schema.enums.LockReason getActiveLockReason() { return this.activeLockReason; }
    public void setActiveLockReason(com.zzw.github.graphql.schema.enums.LockReason activeLockReason) { this.activeLockReason = activeLockReason; }

    @NonNull("!")
    @Description("The number of additions in this pull request.")
    private com.zzw.github.graphql.schema.scalars.Int additions;
    public com.zzw.github.graphql.schema.scalars.Int getAdditions() { return this.additions; }
    public void setAdditions(com.zzw.github.graphql.schema.scalars.Int additions) { this.additions = additions; }

    @Description("The actor who authored the comment.")
    private com.zzw.github.graphql.schema.interfaces.Actor author;
    public com.zzw.github.graphql.schema.interfaces.Actor getAuthor() { return this.author; }
    public void setAuthor(com.zzw.github.graphql.schema.interfaces.Actor author) { this.author = author; }

    @NonNull("!")
    @Description("Author's association with the subject of the comment.")
    private com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation;
    public com.zzw.github.graphql.schema.enums.CommentAuthorAssociation getAuthorAssociation() { return this.authorAssociation; }
    public void setAuthorAssociation(com.zzw.github.graphql.schema.enums.CommentAuthorAssociation authorAssociation) { this.authorAssociation = authorAssociation; }

    @Description("Identifies the base Ref associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.Ref baseRef;
    public com.zzw.github.graphql.schema.objects.Ref getBaseRef() { return this.baseRef; }
    public void setBaseRef(com.zzw.github.graphql.schema.objects.Ref baseRef) { this.baseRef = baseRef; }

    @NonNull("!")
    @Description("Identifies the name of the base Ref associated with the pull request, even if the ref has been deleted.")
    private com.zzw.github.graphql.schema.scalars.String baseRefName;
    public com.zzw.github.graphql.schema.scalars.String getBaseRefName() { return this.baseRefName; }
    public void setBaseRefName(com.zzw.github.graphql.schema.scalars.String baseRefName) { this.baseRefName = baseRefName; }

    @NonNull("!")
    @Description("Identifies the oid of the base ref associated with the pull request, even if the ref has been deleted.")
    private com.zzw.github.graphql.schema.scalars.GitObjectID baseRefOid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getBaseRefOid() { return this.baseRefOid; }
    public void setBaseRefOid(com.zzw.github.graphql.schema.scalars.GitObjectID baseRefOid) { this.baseRefOid = baseRefOid; }

    @NonNull("!")
    @Description("The body as Markdown.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("The body rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML() { return this.bodyHTML; }
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML) { this.bodyHTML = bodyHTML; }

    @NonNull("!")
    @Description("The body rendered to text.")
    private com.zzw.github.graphql.schema.scalars.String bodyText;
    public com.zzw.github.graphql.schema.scalars.String getBodyText() { return this.bodyText; }
    public void setBodyText(com.zzw.github.graphql.schema.scalars.String bodyText) { this.bodyText = bodyText; }

    @NonNull("!")
    @Description("Whether or not the pull request is rebaseable.")
    private com.zzw.github.graphql.schema.scalars.Boolean canBeRebased;
    public com.zzw.github.graphql.schema.scalars.Boolean getCanBeRebased() { return this.canBeRebased; }
    public void setCanBeRebased(com.zzw.github.graphql.schema.scalars.Boolean canBeRebased) { this.canBeRebased = canBeRebased; }

    @NonNull("!")
    @Description("The number of changed files in this pull request.")
    private com.zzw.github.graphql.schema.scalars.Int changedFiles;
    public com.zzw.github.graphql.schema.scalars.Int getChangedFiles() { return this.changedFiles; }
    public void setChangedFiles(com.zzw.github.graphql.schema.scalars.Int changedFiles) { this.changedFiles = changedFiles; }

    @NonNull("!")
    @Description(" if the pull request is closed")
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

    @NonNull("!")
    @Description("The number of deletions in this pull request.")
    private com.zzw.github.graphql.schema.scalars.Int deletions;
    public com.zzw.github.graphql.schema.scalars.Int getDeletions() { return this.deletions; }
    public void setDeletions(com.zzw.github.graphql.schema.scalars.Int deletions) { this.deletions = deletions; }

    @Description("The actor who edited this pull request's body.")
    private com.zzw.github.graphql.schema.interfaces.Actor editor;
    public com.zzw.github.graphql.schema.interfaces.Actor getEditor() { return this.editor; }
    public void setEditor(com.zzw.github.graphql.schema.interfaces.Actor editor) { this.editor = editor; }

    @Description("Identifies the head Ref associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.Ref headRef;
    public com.zzw.github.graphql.schema.objects.Ref getHeadRef() { return this.headRef; }
    public void setHeadRef(com.zzw.github.graphql.schema.objects.Ref headRef) { this.headRef = headRef; }

    @NonNull("!")
    @Description("Identifies the name of the head Ref associated with the pull request, even if the ref has been deleted.")
    private com.zzw.github.graphql.schema.scalars.String headRefName;
    public com.zzw.github.graphql.schema.scalars.String getHeadRefName() { return this.headRefName; }
    public void setHeadRefName(com.zzw.github.graphql.schema.scalars.String headRefName) { this.headRefName = headRefName; }

    @NonNull("!")
    @Description("Identifies the oid of the head ref associated with the pull request, even if the ref has been deleted.")
    private com.zzw.github.graphql.schema.scalars.GitObjectID headRefOid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getHeadRefOid() { return this.headRefOid; }
    public void setHeadRefOid(com.zzw.github.graphql.schema.scalars.GitObjectID headRefOid) { this.headRefOid = headRefOid; }

    @Description("The repository associated with this pull request's head Ref.")
    private com.zzw.github.graphql.schema.objects.Repository headRepository;
    public com.zzw.github.graphql.schema.objects.Repository getHeadRepository() { return this.headRepository; }
    public void setHeadRepository(com.zzw.github.graphql.schema.objects.Repository headRepository) { this.headRepository = headRepository; }

    @Description("The owner of the repository associated with this pull request's head Ref.")
    private com.zzw.github.graphql.schema.interfaces.RepositoryOwner headRepositoryOwner;
    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getHeadRepositoryOwner() { return this.headRepositoryOwner; }
    public void setHeadRepositoryOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner headRepositoryOwner) { this.headRepositoryOwner = headRepositoryOwner; }

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
    @Description("The head and base repositories are different.")
    private com.zzw.github.graphql.schema.scalars.Boolean isCrossRepository;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsCrossRepository() { return this.isCrossRepository; }
    public void setIsCrossRepository(com.zzw.github.graphql.schema.scalars.Boolean isCrossRepository) { this.isCrossRepository = isCrossRepository; }

    @Description("The moment the editor made the last edit")
    private com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getLastEditedAt() { return this.lastEditedAt; }
    public void setLastEditedAt(com.zzw.github.graphql.schema.scalars.DateTime lastEditedAt) { this.lastEditedAt = lastEditedAt; }

    @NonNull("!")
    @Description(" if the pull request is locked")
    private com.zzw.github.graphql.schema.scalars.Boolean locked;
    public com.zzw.github.graphql.schema.scalars.Boolean getLocked() { return this.locked; }
    public void setLocked(com.zzw.github.graphql.schema.scalars.Boolean locked) { this.locked = locked; }

    @NonNull("!")
    @Description("Indicates whether maintainers can modify the pull request.")
    private com.zzw.github.graphql.schema.scalars.Boolean maintainerCanModify;
    public com.zzw.github.graphql.schema.scalars.Boolean getMaintainerCanModify() { return this.maintainerCanModify; }
    public void setMaintainerCanModify(com.zzw.github.graphql.schema.scalars.Boolean maintainerCanModify) { this.maintainerCanModify = maintainerCanModify; }

    @Description("The commit that was created when this pull request was merged.")
    private com.zzw.github.graphql.schema.objects.Commit mergeCommit;
    public com.zzw.github.graphql.schema.objects.Commit getMergeCommit() { return this.mergeCommit; }
    public void setMergeCommit(com.zzw.github.graphql.schema.objects.Commit mergeCommit) { this.mergeCommit = mergeCommit; }

    @NonNull("!")
    @Description("Detailed information about the current pull request merge state status.")
    private com.zzw.github.graphql.schema.enums.MergeStateStatus mergeStateStatus;
    public com.zzw.github.graphql.schema.enums.MergeStateStatus getMergeStateStatus() { return this.mergeStateStatus; }
    public void setMergeStateStatus(com.zzw.github.graphql.schema.enums.MergeStateStatus mergeStateStatus) { this.mergeStateStatus = mergeStateStatus; }

    @NonNull("!")
    @Description("Whether or not the pull request can be merged based on the existence of merge conflicts.")
    private com.zzw.github.graphql.schema.enums.MergeableState mergeable;
    public com.zzw.github.graphql.schema.enums.MergeableState getMergeable() { return this.mergeable; }
    public void setMergeable(com.zzw.github.graphql.schema.enums.MergeableState mergeable) { this.mergeable = mergeable; }

    @NonNull("!")
    @Description("Whether or not the pull request was merged.")
    private com.zzw.github.graphql.schema.scalars.Boolean merged;
    public com.zzw.github.graphql.schema.scalars.Boolean getMerged() { return this.merged; }
    public void setMerged(com.zzw.github.graphql.schema.scalars.Boolean merged) { this.merged = merged; }

    @Description("The date and time that the pull request was merged.")
    private com.zzw.github.graphql.schema.scalars.DateTime mergedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getMergedAt() { return this.mergedAt; }
    public void setMergedAt(com.zzw.github.graphql.schema.scalars.DateTime mergedAt) { this.mergedAt = mergedAt; }

    @Description("The actor who merged the pull request.")
    private com.zzw.github.graphql.schema.interfaces.Actor mergedBy;
    public com.zzw.github.graphql.schema.interfaces.Actor getMergedBy() { return this.mergedBy; }
    public void setMergedBy(com.zzw.github.graphql.schema.interfaces.Actor mergedBy) { this.mergedBy = mergedBy; }

    @Description("Identifies the milestone associated with the pull request.")
    private com.zzw.github.graphql.schema.objects.Milestone milestone;
    public com.zzw.github.graphql.schema.objects.Milestone getMilestone() { return this.milestone; }
    public void setMilestone(com.zzw.github.graphql.schema.objects.Milestone milestone) { this.milestone = milestone; }

    @NonNull("!")
    @Description("Identifies the pull request number.")
    private com.zzw.github.graphql.schema.scalars.Int number;
    public com.zzw.github.graphql.schema.scalars.Int getNumber() { return this.number; }
    public void setNumber(com.zzw.github.graphql.schema.scalars.Int number) { this.number = number; }

    @NonNull("!")
    @Description("The permalink to the pull request.")
    private com.zzw.github.graphql.schema.scalars.URI permalink;
    public com.zzw.github.graphql.schema.scalars.URI getPermalink() { return this.permalink; }
    public void setPermalink(com.zzw.github.graphql.schema.scalars.URI permalink) { this.permalink = permalink; }

    @Description("The commit that GitHub automatically generated to test if this pull request could be merged. This field will not return a value if the pull request is merged, or if the test merge commit is still being generated. See the ")
    private com.zzw.github.graphql.schema.objects.Commit potentialMergeCommit;
    public com.zzw.github.graphql.schema.objects.Commit getPotentialMergeCommit() { return this.potentialMergeCommit; }
    public void setPotentialMergeCommit(com.zzw.github.graphql.schema.objects.Commit potentialMergeCommit) { this.potentialMergeCommit = potentialMergeCommit; }

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
    @Description("The HTTP path for this pull request.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("The HTTP path for reverting this pull request.")
    private com.zzw.github.graphql.schema.scalars.URI revertResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getRevertResourcePath() { return this.revertResourcePath; }
    public void setRevertResourcePath(com.zzw.github.graphql.schema.scalars.URI revertResourcePath) { this.revertResourcePath = revertResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for reverting this pull request.")
    private com.zzw.github.graphql.schema.scalars.URI revertUrl;
    public com.zzw.github.graphql.schema.scalars.URI getRevertUrl() { return this.revertUrl; }
    public void setRevertUrl(com.zzw.github.graphql.schema.scalars.URI revertUrl) { this.revertUrl = revertUrl; }

    @NonNull("!")
    @Description("Identifies the state of the pull request.")
    private com.zzw.github.graphql.schema.enums.PullRequestState state;
    public com.zzw.github.graphql.schema.enums.PullRequestState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.PullRequestState state) { this.state = state; }

    @NonNull("!")
    @Description("A list of reviewer suggestions based on commit history and past review comments.")
    private com.zzw.github.graphql.schema.objects.SuggestedReviewer[] suggestedReviewers;
    public com.zzw.github.graphql.schema.objects.SuggestedReviewer[] getSuggestedReviewers() { return this.suggestedReviewers; }
    public void setSuggestedReviewers(com.zzw.github.graphql.schema.objects.SuggestedReviewer[] suggestedReviewers) { this.suggestedReviewers = suggestedReviewers; }

    @NonNull("!")
    @Description("Identifies the pull request title.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this pull request.")
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
