package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Detailed status information about a pull request merge.")
public enum MergeStateStatus {
    @Description("The head ref is out of date.")
     BEHIND,
    @Description("The merge is blocked.")
     BLOCKED,
    @Description("Mergeable and passing commit status.")
     CLEAN,
    @Description("The merge commit cannot be cleanly created.")
     DIRTY,
    @Description("Mergeable with passing commit status and pre-recieve hooks.")
     HAS_HOOKS,
    @Description("The state cannot currently be determined.")
     UNKNOWN,
    @Description("Mergeable with non-passing commit status.")
     UNSTABLE,
}
