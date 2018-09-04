package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'labeled' event on a given issue or pull request.")
public class LabeledEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
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
    @Description("Identifies the label associated with the 'labeled' event.")
    private com.zzw.github.graphql.schema.objects.Label label;
    public com.zzw.github.graphql.schema.objects.Label getLabel() { return this.label; }
    public void setLabel(com.zzw.github.graphql.schema.objects.Label label) { this.label = label; }

    @NonNull("!")
    @Description("Identifies the ")
    private com.zzw.github.graphql.schema.interfaces.Labelable labelable;
    public com.zzw.github.graphql.schema.interfaces.Labelable getLabelable() { return this.labelable; }
    public void setLabelable(com.zzw.github.graphql.schema.interfaces.Labelable labelable) { this.labelable = labelable; }
}
