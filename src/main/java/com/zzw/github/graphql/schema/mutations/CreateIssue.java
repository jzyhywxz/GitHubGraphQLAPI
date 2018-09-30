package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Creates a new issue.")
public class CreateIssue {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateIssueInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateIssueInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateIssueInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The new issue.")
    private com.zzw.github.graphql.schema.objects.Issue issue;
    public com.zzw.github.graphql.schema.objects.Issue getIssue() { return this.issue; }
    public void setIssue(com.zzw.github.graphql.schema.objects.Issue issue) { this.issue = issue; }
}
