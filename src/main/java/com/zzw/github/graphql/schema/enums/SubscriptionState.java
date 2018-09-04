package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible states of a subscription.")
public enum SubscriptionState {
    @Description("The User is never notified.")
     IGNORED,
    @Description("The User is notified of all conversations.")
     SUBSCRIBED,
    @Description("The User is only notified when particpating or @mentioned.")
     UNSUBSCRIBED,
}
