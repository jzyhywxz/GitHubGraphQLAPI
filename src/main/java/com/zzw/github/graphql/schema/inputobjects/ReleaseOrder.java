package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ways in which lists of releases can be ordered upon return.")
public class ReleaseOrder {
    @NonNull("!")
    @Description("The direction in which to order releases by the specified field.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field in which to order releases by.")
    private com.zzw.github.graphql.schema.enums.ReleaseOrderField field;
    public com.zzw.github.graphql.schema.enums.ReleaseOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.ReleaseOrderField field) { this.field = field; }
}
