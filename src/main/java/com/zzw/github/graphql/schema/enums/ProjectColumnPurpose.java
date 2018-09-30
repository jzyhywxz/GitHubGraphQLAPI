package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The semantic purpose of the column - todo, in progress, or done.")
public enum ProjectColumnPurpose {
    @Description("The column contains cards which are complete")
    DONE,
    @Description("The column contains cards which are currently being worked on")
    IN_PROGRESS,
    @Description("The column contains cards still to be worked on")
    TODO,
}
