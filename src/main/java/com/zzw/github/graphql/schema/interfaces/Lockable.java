package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.PullRequest",
})
@Description("An object that can be locked.")
public interface Lockable {
    @Description("Reason that the conversation was locked.")
    public com.zzw.github.graphql.schema.enums.LockReason getActiveLockReason();
    public void setActiveLockReason(com.zzw.github.graphql.schema.enums.LockReason activeLockReason);

    @NonNull("!")
    @Description(" if the object is locked")
    public com.zzw.github.graphql.schema.scalars.Boolean getLocked();
    public void setLocked(com.zzw.github.graphql.schema.scalars.Boolean locked);
}
