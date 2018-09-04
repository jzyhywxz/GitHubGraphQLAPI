package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git blame.")
public class Blame extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("[!]!")
    @Description("The list of ranges from a Git blame.")
    private com.zzw.github.graphql.schema.objects.BlameRange[] ranges;
    public com.zzw.github.graphql.schema.objects.BlameRange[] getRanges() { return this.ranges; }
    public void setRanges(com.zzw.github.graphql.schema.objects.BlameRange[] ranges) { this.ranges = ranges; }
}
