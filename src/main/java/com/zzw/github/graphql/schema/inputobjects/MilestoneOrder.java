package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ordering options for milestone connections.")
public class MilestoneOrder {
    @NonNull("!")
    @Description("The ordering direction.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field to order milestones by.")
    private com.zzw.github.graphql.schema.enums.MilestoneOrderField field;
    public com.zzw.github.graphql.schema.enums.MilestoneOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.MilestoneOrderField field) { this.field = field; }
}
