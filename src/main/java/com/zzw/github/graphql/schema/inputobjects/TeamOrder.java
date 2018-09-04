package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ways in which team connections can be ordered.")
public class TeamOrder {
    @NonNull("!")
    @Description("The direction in which to order nodes.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field in which to order nodes by.")
    private com.zzw.github.graphql.schema.enums.TeamOrderField field;
    public com.zzw.github.graphql.schema.enums.TeamOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.TeamOrderField field) { this.field = field; }
}
