package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Unmark an issue as a duplicate of another issue.")
public class UnmarkIssueAsDuplicate {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UnmarkIssueAsDuplicateInput input;
    public com.zzw.github.graphql.schema.inputobjects.UnmarkIssueAsDuplicateInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UnmarkIssueAsDuplicateInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The issue or pull request that was marked as a duplicate.")
    private com.zzw.github.graphql.schema.unions.IssueOrPullRequest duplicate;
    public com.zzw.github.graphql.schema.unions.IssueOrPullRequest getDuplicate() { return this.duplicate; }
    public void setDuplicate(com.zzw.github.graphql.schema.unions.IssueOrPullRequest duplicate) { this.duplicate = duplicate; }
}
