package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible reasons a given repository could be in a locked state.")
public enum RepositoryLockReason {
    @Description("The repository is locked due to a billing related reason.")
    BILLING,
    @Description("The repository is locked due to a migration.")
    MIGRATING,
    @Description("The repository is locked due to a move.")
    MOVING,
    @Description("The repository is locked due to a rename.")
    RENAME,
}
