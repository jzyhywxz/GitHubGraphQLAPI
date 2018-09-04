package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Ordering options for language connections.")
public class LanguageOrder {
    @NonNull("!")
    @Description("The ordering direction.")
    private com.zzw.github.graphql.schema.enums.OrderDirection direction;
    public com.zzw.github.graphql.schema.enums.OrderDirection getDirection() { return this.direction; }
    public void setDirection(com.zzw.github.graphql.schema.enums.OrderDirection direction) { this.direction = direction; }

    @NonNull("!")
    @Description("The field to order languages by.")
    private com.zzw.github.graphql.schema.enums.LanguageOrderField field;
    public com.zzw.github.graphql.schema.enums.LanguageOrderField getField() { return this.field; }
    public void setField(com.zzw.github.graphql.schema.enums.LanguageOrderField field) { this.field = field; }
}
