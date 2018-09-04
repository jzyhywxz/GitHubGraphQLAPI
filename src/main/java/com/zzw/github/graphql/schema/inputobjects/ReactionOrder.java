package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ways in which lists of reactions can be ordered upon return.")
public class ReactionOrder {
    @NonNull("!")
    @Description("The direction in which to order reactions by the specified field.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field in which to order reactions by.")
    private com.zzw.github.graphql.schema.enums.ReactionOrderField field;
    public com.zzw.github.graphql.schema.enums.ReactionOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.ReactionOrderField field) { this.field = field; }
}
