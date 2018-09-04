package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An inclusive pair of positions for a check annotation.")
public class CheckAnnotationSpan extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("End position (inclusive).")
    private com.zzw.github.graphql.schema.objects.CheckAnnotationPosition end;
    public com.zzw.github.graphql.schema.objects.CheckAnnotationPosition getEnd() { return this.end; }
    public void setEnd(com.zzw.github.graphql.schema.objects.CheckAnnotationPosition end) { this.end = end; }

    @NonNull("!")
    @Description("Start position (inclusive).")
    private com.zzw.github.graphql.schema.objects.CheckAnnotationPosition start;
    public com.zzw.github.graphql.schema.objects.CheckAnnotationPosition getStart() { return this.start; }
    public void setStart(com.zzw.github.graphql.schema.objects.CheckAnnotationPosition start) { this.start = start; }
}
