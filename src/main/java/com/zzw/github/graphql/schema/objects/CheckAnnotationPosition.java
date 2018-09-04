package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A character position in a check annotation.")
public class CheckAnnotationPosition extends com.zzw.github.graphql.schema.Metadata {
    @Description("Column number (1 indexed).")
    private com.zzw.github.graphql.schema.scalars.Int column;
    public com.zzw.github.graphql.schema.scalars.Int getColumn() { return this.column; }
    public void setColumn(com.zzw.github.graphql.schema.scalars.Int column) { this.column = column; }

    @NonNull("!")
    @Description("Line number (1 indexed).")
    private com.zzw.github.graphql.schema.scalars.Int line;
    public com.zzw.github.graphql.schema.scalars.Int getLine() { return this.line; }
    public void setLine(com.zzw.github.graphql.schema.scalars.Int line) { this.line = line; }
}
