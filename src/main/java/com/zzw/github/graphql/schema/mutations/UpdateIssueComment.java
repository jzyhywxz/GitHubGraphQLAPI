package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates an IssueComment object.")
public class UpdateIssueComment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateIssueCommentInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateIssueCommentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateIssueCommentInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The updated comment.")
    private com.zzw.github.graphql.schema.objects.IssueComment issueComment;
    public com.zzw.github.graphql.schema.objects.IssueComment getIssueComment() { return this.issueComment; }
    public void setIssueComment(com.zzw.github.graphql.schema.objects.IssueComment issueComment) { this.issueComment = issueComment; }
}
