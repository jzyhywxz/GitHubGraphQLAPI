package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A branch protection rule.")
public class BranchProtectionRule extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of conflicts matching branches protection rule and other branch protection rules")
    private com.zzw.github.graphql.schema.objects.BranchProtectionRuleConflictConnection branchProtectionRuleConflicts;
    public com.zzw.github.graphql.schema.objects.BranchProtectionRuleConflictConnection getBranchProtectionRuleConflicts() { return this.branchProtectionRuleConflicts; }
    public void setBranchProtectionRuleConflicts(com.zzw.github.graphql.schema.objects.BranchProtectionRuleConflictConnection branchProtectionRuleConflicts) { this.branchProtectionRuleConflicts = branchProtectionRuleConflicts; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("Repository refs that are protected by this rule")
    private com.zzw.github.graphql.schema.objects.RefConnection matchingRefs;
    public com.zzw.github.graphql.schema.objects.RefConnection getMatchingRefs() { return this.matchingRefs; }
    public void setMatchingRefs(com.zzw.github.graphql.schema.objects.RefConnection matchingRefs) { this.matchingRefs = matchingRefs; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list push allowances for this branch protection rule.")
    private com.zzw.github.graphql.schema.objects.PushAllowanceConnection pushAllowances;
    public com.zzw.github.graphql.schema.objects.PushAllowanceConnection getPushAllowances() { return this.pushAllowances; }
    public void setPushAllowances(com.zzw.github.graphql.schema.objects.PushAllowanceConnection pushAllowances) { this.pushAllowances = pushAllowances; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list review dismissal allowances for this branch protection rule.")
    private com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection reviewDismissalAllowances;
    public com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection getReviewDismissalAllowances() { return this.reviewDismissalAllowances; }
    public void setReviewDismissalAllowances(com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection reviewDismissalAllowances) { this.reviewDismissalAllowances = reviewDismissalAllowances; }

    @Description("The actor who created this branch protection rule.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    @Description("Will new commits pushed to matching branches dismiss pull request review approvals.")
    private com.zzw.github.graphql.schema.scalars.Boolean dismissesStaleReviews;
    public com.zzw.github.graphql.schema.scalars.Boolean getDismissesStaleReviews() { return this.dismissesStaleReviews; }
    public void setDismissesStaleReviews(com.zzw.github.graphql.schema.scalars.Boolean dismissesStaleReviews) { this.dismissesStaleReviews = dismissesStaleReviews; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Can admins overwrite branch protection.")
    private com.zzw.github.graphql.schema.scalars.Boolean isAdminEnforced;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsAdminEnforced() { return this.isAdminEnforced; }
    public void setIsAdminEnforced(com.zzw.github.graphql.schema.scalars.Boolean isAdminEnforced) { this.isAdminEnforced = isAdminEnforced; }

    @NonNull("!")
    @Description("Identifies the protection rule pattern.")
    private com.zzw.github.graphql.schema.scalars.String pattern;
    public com.zzw.github.graphql.schema.scalars.String getPattern() { return this.pattern; }
    public void setPattern(com.zzw.github.graphql.schema.scalars.String pattern) { this.pattern = pattern; }

    @Description("The repository associated with this branch protection rule.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("Number of approving reviews required to update matching branches.")
    private com.zzw.github.graphql.schema.scalars.Int requiredApprovingReviewCount;
    public com.zzw.github.graphql.schema.scalars.Int getRequiredApprovingReviewCount() { return this.requiredApprovingReviewCount; }
    public void setRequiredApprovingReviewCount(com.zzw.github.graphql.schema.scalars.Int requiredApprovingReviewCount) { this.requiredApprovingReviewCount = requiredApprovingReviewCount; }

    @Description("List of required status check contexts that must pass for commits to be accepted to matching branches.")
    private com.zzw.github.graphql.schema.scalars.String[] requiredStatusCheckContexts;
    public com.zzw.github.graphql.schema.scalars.String[] getRequiredStatusCheckContexts() { return this.requiredStatusCheckContexts; }
    public void setRequiredStatusCheckContexts(com.zzw.github.graphql.schema.scalars.String[] requiredStatusCheckContexts) { this.requiredStatusCheckContexts = requiredStatusCheckContexts; }

    @NonNull("!")
    @Description("Are approving reviews required to update matching branches.")
    private com.zzw.github.graphql.schema.scalars.Boolean requiresApprovingReviews;
    public com.zzw.github.graphql.schema.scalars.Boolean getRequiresApprovingReviews() { return this.requiresApprovingReviews; }
    public void setRequiresApprovingReviews(com.zzw.github.graphql.schema.scalars.Boolean requiresApprovingReviews) { this.requiresApprovingReviews = requiresApprovingReviews; }

    @NonNull("!")
    @Description("Are commits required to be signed.")
    private com.zzw.github.graphql.schema.scalars.Boolean requiresCommitSignatures;
    public com.zzw.github.graphql.schema.scalars.Boolean getRequiresCommitSignatures() { return this.requiresCommitSignatures; }
    public void setRequiresCommitSignatures(com.zzw.github.graphql.schema.scalars.Boolean requiresCommitSignatures) { this.requiresCommitSignatures = requiresCommitSignatures; }

    @NonNull("!")
    @Description("Are status checks required to update matching branches.")
    private com.zzw.github.graphql.schema.scalars.Boolean requiresStatusChecks;
    public com.zzw.github.graphql.schema.scalars.Boolean getRequiresStatusChecks() { return this.requiresStatusChecks; }
    public void setRequiresStatusChecks(com.zzw.github.graphql.schema.scalars.Boolean requiresStatusChecks) { this.requiresStatusChecks = requiresStatusChecks; }

    @NonNull("!")
    @Description("Are branches required to be up to date before merging.")
    private com.zzw.github.graphql.schema.scalars.Boolean requiresStrictStatusChecks;
    public com.zzw.github.graphql.schema.scalars.Boolean getRequiresStrictStatusChecks() { return this.requiresStrictStatusChecks; }
    public void setRequiresStrictStatusChecks(com.zzw.github.graphql.schema.scalars.Boolean requiresStrictStatusChecks) { this.requiresStrictStatusChecks = requiresStrictStatusChecks; }

    @NonNull("!")
    @Description("Is pushing to matching branches restricted.")
    private com.zzw.github.graphql.schema.scalars.Boolean restrictsPushes;
    public com.zzw.github.graphql.schema.scalars.Boolean getRestrictsPushes() { return this.restrictsPushes; }
    public void setRestrictsPushes(com.zzw.github.graphql.schema.scalars.Boolean restrictsPushes) { this.restrictsPushes = restrictsPushes; }

    @NonNull("!")
    @Description("Is dismissal of pull request reviews restricted.")
    private com.zzw.github.graphql.schema.scalars.Boolean restrictsReviewDismissals;
    public com.zzw.github.graphql.schema.scalars.Boolean getRestrictsReviewDismissals() { return this.restrictsReviewDismissals; }
    public void setRestrictsReviewDismissals(com.zzw.github.graphql.schema.scalars.Boolean restrictsReviewDismissals) { this.restrictsReviewDismissals = restrictsReviewDismissals; }
}
