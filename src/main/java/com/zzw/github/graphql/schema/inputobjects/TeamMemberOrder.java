package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ordering options for team member connections")
public class TeamMemberOrder {
    @NonNull("!")
    @Description("The ordering direction.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field to order team members by.")
    private com.zzw.github.graphql.schema.enums.TeamMemberOrderField field;
    public com.zzw.github.graphql.schema.enums.TeamMemberOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.TeamMemberOrderField field) { this.field = field; }
}
