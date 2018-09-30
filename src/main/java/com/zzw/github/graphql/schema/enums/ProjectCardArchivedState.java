package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible archived states of a project card.")
public enum ProjectCardArchivedState {
    @Description("A project card that is archived")
    ARCHIVED,
    @Description("A project card that is not archived")
    NOT_ARCHIVED,
}
