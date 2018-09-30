package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states of a pull request.")
public enum PullRequestState {
    @Description("A pull request that has been closed without being merged.")
    CLOSED,
    @Description("A pull request that has been closed by being merged.")
    MERGED,
    @Description("A pull request that is still open.")
    OPEN,
}
