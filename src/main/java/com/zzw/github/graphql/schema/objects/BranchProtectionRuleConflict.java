package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A conflict between two branch protection rules.")
public class BranchProtectionRuleConflict extends com.zzw.github.graphql.schema.Metadata {
    @Description("Identifies the branch protection rule.")
    private com.zzw.github.graphql.schema.objects.BranchProtectionRule branchProtectionRule;
    public com.zzw.github.graphql.schema.objects.BranchProtectionRule getBranchProtectionRule() { return this.branchProtectionRule; }
    public void setBranchProtectionRule(com.zzw.github.graphql.schema.objects.BranchProtectionRule branchProtectionRule) { this.branchProtectionRule = branchProtectionRule; }

    @Description("Identifies the conflicting branch protection rule.")
    private com.zzw.github.graphql.schema.objects.BranchProtectionRule conflictingBranchProtectionRule;
    public com.zzw.github.graphql.schema.objects.BranchProtectionRule getConflictingBranchProtectionRule() { return this.conflictingBranchProtectionRule; }
    public void setConflictingBranchProtectionRule(com.zzw.github.graphql.schema.objects.BranchProtectionRule conflictingBranchProtectionRule) { this.conflictingBranchProtectionRule = conflictingBranchProtectionRule; }

    @Description("Identifies the branch ref that has conflicting rules")
    private com.zzw.github.graphql.schema.objects.Ref ref;
    public com.zzw.github.graphql.schema.objects.Ref getRef() { return this.ref; }
    public void setRef(com.zzw.github.graphql.schema.objects.Ref ref) { this.ref = ref; }
}
