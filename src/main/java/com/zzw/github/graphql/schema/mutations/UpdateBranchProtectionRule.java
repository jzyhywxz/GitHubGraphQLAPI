package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Create a new branch protection rule")
public class UpdateBranchProtectionRule {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateBranchProtectionRuleInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateBranchProtectionRuleInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateBranchProtectionRuleInput input) { this.input = input; }

    @Description("The newly created BranchProtectionRule.")
    private com.zzw.github.graphql.schema.objects.BranchProtectionRule branchProtectionRule;
    public com.zzw.github.graphql.schema.objects.BranchProtectionRule getBranchProtectionRule() { return this.branchProtectionRule; }
    public void setBranchProtectionRule(com.zzw.github.graphql.schema.objects.BranchProtectionRule branchProtectionRule) { this.branchProtectionRule = branchProtectionRule; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
