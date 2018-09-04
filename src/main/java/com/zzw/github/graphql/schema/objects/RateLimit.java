package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents the client's rate limit.")
public class RateLimit extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("The point cost for the current query counting against the rate limit.")
    private com.zzw.github.graphql.schema.scalars.Int cost;
    public com.zzw.github.graphql.schema.scalars.Int getCost() { return this.cost; }
    public void setCost(com.zzw.github.graphql.schema.scalars.Int cost) { this.cost = cost; }

    @NonNull("!")
    @Description("The maximum number of points the client is permitted to consume in a 60 minute window.")
    private com.zzw.github.graphql.schema.scalars.Int limit;
    public com.zzw.github.graphql.schema.scalars.Int getLimit() { return this.limit; }
    public void setLimit(com.zzw.github.graphql.schema.scalars.Int limit) { this.limit = limit; }

    @NonNull("!")
    @Description("The maximum number of nodes this query may return")
    private com.zzw.github.graphql.schema.scalars.Int nodeCount;
    public com.zzw.github.graphql.schema.scalars.Int getNodeCount() { return this.nodeCount; }
    public void setNodeCount(com.zzw.github.graphql.schema.scalars.Int nodeCount) { this.nodeCount = nodeCount; }

    @NonNull("!")
    @Description("The number of points remaining in the current rate limit window.")
    private com.zzw.github.graphql.schema.scalars.Int remaining;
    public com.zzw.github.graphql.schema.scalars.Int getRemaining() { return this.remaining; }
    public void setRemaining(com.zzw.github.graphql.schema.scalars.Int remaining) { this.remaining = remaining; }

    @NonNull("!")
    @Description("The time at which the current rate limit window resets in UTC epoch seconds.")
    private com.zzw.github.graphql.schema.scalars.DateTime resetAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getResetAt() { return this.resetAt; }
    public void setResetAt(com.zzw.github.graphql.schema.scalars.DateTime resetAt) { this.resetAt = resetAt; }
}
