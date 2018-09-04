package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible reasons that an issue or pull request was locked.")
public enum LockReason {
    @Description("The issue or pull request was locked because the conversation was off-topic.")
     OFF_TOPIC,
    @Description("The issue or pull request was locked because the conversation was resolved.")
     RESOLVED,
    @Description("The issue or pull request was locked because the conversation was spam.")
     SPAM,
    @Description("The issue or pull request was locked because the conversation was too heated.")
     TOO_HEATED,
}
