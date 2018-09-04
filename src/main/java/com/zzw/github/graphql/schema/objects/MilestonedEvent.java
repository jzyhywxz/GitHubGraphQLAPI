package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'milestoned' event on a given issue or pull request.")
public class MilestonedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
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

    @NonNull("!")
    @Description("Identifies the milestone title associated with the 'milestoned' event.")
    private com.zzw.github.graphql.schema.scalars.String milestoneTitle;
    public com.zzw.github.graphql.schema.scalars.String getMilestoneTitle() { return this.milestoneTitle; }
    public void setMilestoneTitle(com.zzw.github.graphql.schema.scalars.String milestoneTitle) { this.milestoneTitle = milestoneTitle; }

    @NonNull("!")
    @Description("Object referenced by event.")
    private com.zzw.github.graphql.schema.unions.MilestoneItem subject;
    public com.zzw.github.graphql.schema.unions.MilestoneItem getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.unions.MilestoneItem subject) { this.subject = subject; }
}
