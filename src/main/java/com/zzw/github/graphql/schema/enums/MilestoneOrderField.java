package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which milestone connections can be ordered.")
public enum MilestoneOrderField {
    @Description("Order milestones by when they were created.")
    CREATED_AT,
    @Description("Order milestones by when they are due.")
    DUE_DATE,
    @Description("Order milestones by their number.")
    NUMBER,
    @Description("Order milestones by when they were last updated.")
    UPDATED_AT,
}
