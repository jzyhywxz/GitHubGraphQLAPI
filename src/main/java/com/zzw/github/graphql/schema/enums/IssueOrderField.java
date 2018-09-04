package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which issue connections can be ordered.")
public enum IssueOrderField {
    @Description("Order issues by comment count")
     COMMENTS,
    @Description("Order issues by creation time")
     CREATED_AT,
    @Description("Order issues by update time")
     UPDATED_AT,
}
