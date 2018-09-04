package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git commit.")
public class Commit extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.GitObject, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Subscribable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="filterBy", type="com.zzw.github.graphql.schema.inputobjects.CheckSuiteFilter", nonNull=@NonNull(""), description=@Description("Filters the check suites by this type.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("The check suites associated with a commit.")
    private com.zzw.github.graphql.schema.objects.CheckSuiteConnection checkSuites;
    public com.zzw.github.graphql.schema.objects.CheckSuiteConnection getCheckSuites() { return this.checkSuites; }
    public void setCheckSuites(com.zzw.github.graphql.schema.objects.CheckSuiteConnection checkSuites) { this.checkSuites = checkSuites; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("Comments made on the commit.")
    private com.zzw.github.graphql.schema.objects.CommitCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.CommitCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.CommitCommentConnection comments) { this.comments = comments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="author", type="com.zzw.github.graphql.schema.inputobjects.CommitAuthor", nonNull=@NonNull(""), description=@Description("If non-null, filters history to only show commits with matching authorship.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="path", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the last")),
        @Argument(name="since", type="com.zzw.github.graphql.schema.scalars.GitTimestamp", nonNull=@NonNull(""), description=@Description("elements from the list.")),
        @Argument(name="until", type="com.zzw.github.graphql.schema.scalars.GitTimestamp", nonNull=@NonNull(""), description=@Description("If non-null, filters history to only show commits touching files under this path.")),
    })
    @NonNull("!")
    @Description("The linear commit history starting from (and including) this commit, in the same order as `git log`.")
    private com.zzw.github.graphql.schema.objects.CommitHistoryConnection history;
    public com.zzw.github.graphql.schema.objects.CommitHistoryConnection getHistory() { return this.history; }
    public void setHistory(com.zzw.github.graphql.schema.objects.CommitHistoryConnection history) { this.history = history; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("The parents of a commit.")
    private com.zzw.github.graphql.schema.objects.CommitConnection parents;
    public com.zzw.github.graphql.schema.objects.CommitConnection getParents() { return this.parents; }
    public void setParents(com.zzw.github.graphql.schema.objects.CommitConnection parents) { this.parents = parents; }

    @NonNull("!")
    @Description("An abbreviated version of the Git object ID")
    private com.zzw.github.graphql.schema.scalars.String abbreviatedOid;
    public com.zzw.github.graphql.schema.scalars.String getAbbreviatedOid() { return this.abbreviatedOid; }
    public void setAbbreviatedOid(com.zzw.github.graphql.schema.scalars.String abbreviatedOid) { this.abbreviatedOid = abbreviatedOid; }

    @NonNull("!")
    @Description("The number of additions in this commit.")
    private com.zzw.github.graphql.schema.scalars.Int additions;
    public com.zzw.github.graphql.schema.scalars.Int getAdditions() { return this.additions; }
    public void setAdditions(com.zzw.github.graphql.schema.scalars.Int additions) { this.additions = additions; }

    @Description("Authorship details of the commit.")
    private com.zzw.github.graphql.schema.objects.GitActor author;
    public com.zzw.github.graphql.schema.objects.GitActor getAuthor() { return this.author; }
    public void setAuthor(com.zzw.github.graphql.schema.objects.GitActor author) { this.author = author; }

    @NonNull("!")
    @Description("Check if the committer and the author match.")
    private com.zzw.github.graphql.schema.scalars.Boolean authoredByCommitter;
    public com.zzw.github.graphql.schema.scalars.Boolean getAuthoredByCommitter() { return this.authoredByCommitter; }
    public void setAuthoredByCommitter(com.zzw.github.graphql.schema.scalars.Boolean authoredByCommitter) { this.authoredByCommitter = authoredByCommitter; }

    @NonNull("!")
    @Description("The datetime when this commit was authored.")
    private com.zzw.github.graphql.schema.scalars.DateTime authoredDate;
    public com.zzw.github.graphql.schema.scalars.DateTime getAuthoredDate() { return this.authoredDate; }
    public void setAuthoredDate(com.zzw.github.graphql.schema.scalars.DateTime authoredDate) { this.authoredDate = authoredDate; }

    @Arguments({
        @Argument(name="path", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The file whose Git blame information you want.")),
    })
    @NonNull("!")
    @Description("Fetches ")
    private com.zzw.github.graphql.schema.objects.Blame blame;
    public com.zzw.github.graphql.schema.objects.Blame getBlame() { return this.blame; }
    public void setBlame(com.zzw.github.graphql.schema.objects.Blame blame) { this.blame = blame; }

    @NonNull("!")
    @Description("The number of changed files in this commit.")
    private com.zzw.github.graphql.schema.scalars.Int changedFiles;
    public com.zzw.github.graphql.schema.scalars.Int getChangedFiles() { return this.changedFiles; }
    public void setChangedFiles(com.zzw.github.graphql.schema.scalars.Int changedFiles) { this.changedFiles = changedFiles; }

    @NonNull("!")
    @Description("The HTTP path for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getCommitResourcePath() { return this.commitResourcePath; }
    public void setCommitResourcePath(com.zzw.github.graphql.schema.scalars.URI commitResourcePath) { this.commitResourcePath = commitResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitUrl;
    public com.zzw.github.graphql.schema.scalars.URI getCommitUrl() { return this.commitUrl; }
    public void setCommitUrl(com.zzw.github.graphql.schema.scalars.URI commitUrl) { this.commitUrl = commitUrl; }

    @NonNull("!")
    @Description("The datetime when this commit was committed.")
    private com.zzw.github.graphql.schema.scalars.DateTime committedDate;
    public com.zzw.github.graphql.schema.scalars.DateTime getCommittedDate() { return this.committedDate; }
    public void setCommittedDate(com.zzw.github.graphql.schema.scalars.DateTime committedDate) { this.committedDate = committedDate; }

    @NonNull("!")
    @Description("Check if commited via GitHub web UI.")
    private com.zzw.github.graphql.schema.scalars.Boolean committedViaWeb;
    public com.zzw.github.graphql.schema.scalars.Boolean getCommittedViaWeb() { return this.committedViaWeb; }
    public void setCommittedViaWeb(com.zzw.github.graphql.schema.scalars.Boolean committedViaWeb) { this.committedViaWeb = committedViaWeb; }

    @Description("Committership details of the commit.")
    private com.zzw.github.graphql.schema.objects.GitActor committer;
    public com.zzw.github.graphql.schema.objects.GitActor getCommitter() { return this.committer; }
    public void setCommitter(com.zzw.github.graphql.schema.objects.GitActor committer) { this.committer = committer; }

    @NonNull("!")
    @Description("The number of deletions in this commit.")
    private com.zzw.github.graphql.schema.scalars.Int deletions;
    public com.zzw.github.graphql.schema.scalars.Int getDeletions() { return this.deletions; }
    public void setDeletions(com.zzw.github.graphql.schema.scalars.Int deletions) { this.deletions = deletions; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The Git commit message")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("The Git commit message body")
    private com.zzw.github.graphql.schema.scalars.String messageBody;
    public com.zzw.github.graphql.schema.scalars.String getMessageBody() { return this.messageBody; }
    public void setMessageBody(com.zzw.github.graphql.schema.scalars.String messageBody) { this.messageBody = messageBody; }

    @NonNull("!")
    @Description("The commit message body rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML messageBodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getMessageBodyHTML() { return this.messageBodyHTML; }
    public void setMessageBodyHTML(com.zzw.github.graphql.schema.scalars.HTML messageBodyHTML) { this.messageBodyHTML = messageBodyHTML; }

    @NonNull("!")
    @Description("The Git commit message headline")
    private com.zzw.github.graphql.schema.scalars.String messageHeadline;
    public com.zzw.github.graphql.schema.scalars.String getMessageHeadline() { return this.messageHeadline; }
    public void setMessageHeadline(com.zzw.github.graphql.schema.scalars.String messageHeadline) { this.messageHeadline = messageHeadline; }

    @NonNull("!")
    @Description("The commit message headline rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML messageHeadlineHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getMessageHeadlineHTML() { return this.messageHeadlineHTML; }
    public void setMessageHeadlineHTML(com.zzw.github.graphql.schema.scalars.HTML messageHeadlineHTML) { this.messageHeadlineHTML = messageHeadlineHTML; }

    @NonNull("!")
    @Description("The Git object ID")
    private com.zzw.github.graphql.schema.scalars.GitObjectID oid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid() { return this.oid; }
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid) { this.oid = oid; }

    @Description("The datetime when this commit was pushed.")
    private com.zzw.github.graphql.schema.scalars.DateTime pushedDate;
    public com.zzw.github.graphql.schema.scalars.DateTime getPushedDate() { return this.pushedDate; }
    public void setPushedDate(com.zzw.github.graphql.schema.scalars.DateTime pushedDate) { this.pushedDate = pushedDate; }

    @NonNull("!")
    @Description("The Repository this commit belongs to")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this commit")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("Commit signing information, if present.")
    private com.zzw.github.graphql.schema.interfaces.GitSignature signature;
    public com.zzw.github.graphql.schema.interfaces.GitSignature getSignature() { return this.signature; }
    public void setSignature(com.zzw.github.graphql.schema.interfaces.GitSignature signature) { this.signature = signature; }

    @Description("Status information for this commit")
    private com.zzw.github.graphql.schema.objects.Status status;
    public com.zzw.github.graphql.schema.objects.Status getStatus() { return this.status; }
    public void setStatus(com.zzw.github.graphql.schema.objects.Status status) { this.status = status; }

    @NonNull("!")
    @Description("Returns a URL to download a tarball archive for a repository. Note: For private repositories, these links are temporary and expire after five minutes.")
    private com.zzw.github.graphql.schema.scalars.URI tarballUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTarballUrl() { return this.tarballUrl; }
    public void setTarballUrl(com.zzw.github.graphql.schema.scalars.URI tarballUrl) { this.tarballUrl = tarballUrl; }

    @NonNull("!")
    @Description("Commit's root Tree")
    private com.zzw.github.graphql.schema.objects.Tree tree;
    public com.zzw.github.graphql.schema.objects.Tree getTree() { return this.tree; }
    public void setTree(com.zzw.github.graphql.schema.objects.Tree tree) { this.tree = tree; }

    @NonNull("!")
    @Description("The HTTP path for the tree of this commit")
    private com.zzw.github.graphql.schema.scalars.URI treeResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getTreeResourcePath() { return this.treeResourcePath; }
    public void setTreeResourcePath(com.zzw.github.graphql.schema.scalars.URI treeResourcePath) { this.treeResourcePath = treeResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for the tree of this commit")
    private com.zzw.github.graphql.schema.scalars.URI treeUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTreeUrl() { return this.treeUrl; }
    public void setTreeUrl(com.zzw.github.graphql.schema.scalars.URI treeUrl) { this.treeUrl = treeUrl; }

    @NonNull("!")
    @Description("The HTTP URL for this commit")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Check if the viewer is able to change their subscription status for the repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanSubscribe() { return this.viewerCanSubscribe; }
    public void setViewerCanSubscribe(com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe) { this.viewerCanSubscribe = viewerCanSubscribe; }

    @Description("Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.")
    private com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription;
    public com.zzw.github.graphql.schema.enums.SubscriptionState getViewerSubscription() { return this.viewerSubscription; }
    public void setViewerSubscription(com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription) { this.viewerSubscription = viewerSubscription; }

    @NonNull("!")
    @Description("Returns a URL to download a zipball archive for a repository. Note: For private repositories, these links are temporary and expire after five minutes.")
    private com.zzw.github.graphql.schema.scalars.URI zipballUrl;
    public com.zzw.github.graphql.schema.scalars.URI getZipballUrl() { return this.zipballUrl; }
    public void setZipballUrl(com.zzw.github.graphql.schema.scalars.URI zipballUrl) { this.zipballUrl = zipballUrl; }
}
