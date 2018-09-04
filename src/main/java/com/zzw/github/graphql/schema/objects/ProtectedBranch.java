package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A repository protected branch.")
public class ProtectedBranch extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list push allowances for this protected branch.")
    private com.zzw.github.graphql.schema.objects.PushAllowanceConnection pushAllowances;
    public com.zzw.github.graphql.schema.objects.PushAllowanceConnection getPushAllowances() { return this.pushAllowances; }
    public void setPushAllowances(com.zzw.github.graphql.schema.objects.PushAllowanceConnection pushAllowances) { this.pushAllowances = pushAllowances; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("A list review dismissal allowances for this protected branch.")
    private com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection reviewDismissalAllowances;
    public com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection getReviewDismissalAllowances() { return this.reviewDismissalAllowances; }
    public void setReviewDismissalAllowances(com.zzw.github.graphql.schema.objects.ReviewDismissalAllowanceConnection reviewDismissalAllowances) { this.reviewDismissalAllowances = reviewDismissalAllowances; }

    @Description("The actor who created this protected branch.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @NonNull("!")
    @Description("Will new commits pushed to this branch dismiss pull request review approvals.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasDismissableStaleReviews;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasDismissableStaleReviews() { return this.hasDismissableStaleReviews; }
    public void setHasDismissableStaleReviews(com.zzw.github.graphql.schema.scalars.Boolean hasDismissableStaleReviews) { this.hasDismissableStaleReviews = hasDismissableStaleReviews; }

    @NonNull("!")
    @Description("Are reviews required to update this branch.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasRequiredReviews;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasRequiredReviews() { return this.hasRequiredReviews; }
    public void setHasRequiredReviews(com.zzw.github.graphql.schema.scalars.Boolean hasRequiredReviews) { this.hasRequiredReviews = hasRequiredReviews; }

    @NonNull("!")
    @Description("Are commits required to be signed.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasRequiredSignatures;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasRequiredSignatures() { return this.hasRequiredSignatures; }
    public void setHasRequiredSignatures(com.zzw.github.graphql.schema.scalars.Boolean hasRequiredSignatures) { this.hasRequiredSignatures = hasRequiredSignatures; }

    @NonNull("!")
    @Description("Are status checks required to update this branch.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasRequiredStatusChecks;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasRequiredStatusChecks() { return this.hasRequiredStatusChecks; }
    public void setHasRequiredStatusChecks(com.zzw.github.graphql.schema.scalars.Boolean hasRequiredStatusChecks) { this.hasRequiredStatusChecks = hasRequiredStatusChecks; }

    @NonNull("!")
    @Description("Is pushing to this branch restricted.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasRestrictedPushes;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasRestrictedPushes() { return this.hasRestrictedPushes; }
    public void setHasRestrictedPushes(com.zzw.github.graphql.schema.scalars.Boolean hasRestrictedPushes) { this.hasRestrictedPushes = hasRestrictedPushes; }

    @NonNull("!")
    @Description("Is dismissal of pull request reviews restricted.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasRestrictedReviewDismissals;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasRestrictedReviewDismissals() { return this.hasRestrictedReviewDismissals; }
    public void setHasRestrictedReviewDismissals(com.zzw.github.graphql.schema.scalars.Boolean hasRestrictedReviewDismissals) { this.hasRestrictedReviewDismissals = hasRestrictedReviewDismissals; }

    @NonNull("!")
    @Description("Are branches required to be up to date before merging.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasStrictRequiredStatusChecks;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasStrictRequiredStatusChecks() { return this.hasStrictRequiredStatusChecks; }
    public void setHasStrictRequiredStatusChecks(com.zzw.github.graphql.schema.scalars.Boolean hasStrictRequiredStatusChecks) { this.hasStrictRequiredStatusChecks = hasStrictRequiredStatusChecks; }

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
    @Description("Identifies the name of the protected branch.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The repository associated with this protected branch.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("Number of approving reviews required to update this branch.")
    private com.zzw.github.graphql.schema.scalars.Int requiredApprovingReviewCount;
    public com.zzw.github.graphql.schema.scalars.Int getRequiredApprovingReviewCount() { return this.requiredApprovingReviewCount; }
    public void setRequiredApprovingReviewCount(com.zzw.github.graphql.schema.scalars.Int requiredApprovingReviewCount) { this.requiredApprovingReviewCount = requiredApprovingReviewCount; }

    @Description("List of required status check contexts that must pass for commits to be accepted to this branch.")
    private com.zzw.github.graphql.schema.scalars.String[] requiredStatusCheckContexts;
    public com.zzw.github.graphql.schema.scalars.String[] getRequiredStatusCheckContexts() { return this.requiredStatusCheckContexts; }
    public void setRequiredStatusCheckContexts(com.zzw.github.graphql.schema.scalars.String[] requiredStatusCheckContexts) { this.requiredStatusCheckContexts = requiredStatusCheckContexts; }
}
