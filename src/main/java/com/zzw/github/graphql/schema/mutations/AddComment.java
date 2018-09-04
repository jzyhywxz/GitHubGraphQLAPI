package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds a comment to an Issue or Pull Request.")
public class AddComment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddCommentInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddCommentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddCommentInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The edge from the subject's comment connection.")
    private com.zzw.github.graphql.schema.objects.IssueCommentEdge commentEdge;
    public com.zzw.github.graphql.schema.objects.IssueCommentEdge getCommentEdge() { return this.commentEdge; }
    public void setCommentEdge(com.zzw.github.graphql.schema.objects.IssueCommentEdge commentEdge) { this.commentEdge = commentEdge; }

    @NonNull("!")
    @Description("The subject")
    private com.zzw.github.graphql.schema.interfaces.Node subject;
    public com.zzw.github.graphql.schema.interfaces.Node getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.interfaces.Node subject) { this.subject = subject; }

    @NonNull("!")
    @Description("The edge from the subject's timeline connection.")
    private com.zzw.github.graphql.schema.objects.IssueTimelineItemEdge timelineEdge;
    public com.zzw.github.graphql.schema.objects.IssueTimelineItemEdge getTimelineEdge() { return this.timelineEdge; }
    public void setTimelineEdge(com.zzw.github.graphql.schema.objects.IssueTimelineItemEdge timelineEdge) { this.timelineEdge = timelineEdge; }
}
