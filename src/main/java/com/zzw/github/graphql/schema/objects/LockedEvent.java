package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'locked' event on a given issue or pull request.")
public class LockedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("Reason that the conversation was locked (optional).")
    private com.zzw.github.graphql.schema.enums.LockReason lockReason;
    public com.zzw.github.graphql.schema.enums.LockReason getLockReason() { return this.lockReason; }
    public void setLockReason(com.zzw.github.graphql.schema.enums.LockReason lockReason) { this.lockReason = lockReason; }

    @NonNull("!")
    @Description("Object that was locked.")
    private com.zzw.github.graphql.schema.interfaces.Lockable lockable;
    public com.zzw.github.graphql.schema.interfaces.Lockable getLockable() { return this.lockable; }
    public void setLockable(com.zzw.github.graphql.schema.interfaces.Lockable lockable) { this.lockable = lockable; }
}
