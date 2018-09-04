package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A team or user who has the ability to dismiss a review on a protected branch.")
public class ReviewDismissalAllowance extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("The actor that can dismiss.")
    private com.zzw.github.graphql.schema.unions.ReviewDismissalAllowanceActor actor;
    public com.zzw.github.graphql.schema.unions.ReviewDismissalAllowanceActor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.unions.ReviewDismissalAllowanceActor actor) { this.actor = actor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the protected branch associated with the allowed user or team.")
    private com.zzw.github.graphql.schema.objects.ProtectedBranch protectedBranch;
    public com.zzw.github.graphql.schema.objects.ProtectedBranch getProtectedBranch() { return this.protectedBranch; }
    public void setProtectedBranch(com.zzw.github.graphql.schema.objects.ProtectedBranch protectedBranch) { this.protectedBranch = protectedBranch; }
}
