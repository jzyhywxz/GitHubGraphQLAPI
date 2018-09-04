package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Information from a check run analysis to specific lines of code.")
public class CheckAnnotationRange {
    @Description("The ending column of the range.")
    private com.zzw.github.graphql.schema.scalars.Int endColumn;
    public com.zzw.github.graphql.schema.scalars.Int getEndColumn() { return this.endColumn; }
    public void setEndColumn(com.zzw.github.graphql.schema.scalars.Int endColumn) { this.endColumn = endColumn; }

    @NonNull("!")
    @Description("The ending line of the range.")
    private com.zzw.github.graphql.schema.scalars.Int endLine;
    public com.zzw.github.graphql.schema.scalars.Int getEndLine() { return this.endLine; }
    public void setEndLine(com.zzw.github.graphql.schema.scalars.Int endLine) { this.endLine = endLine; }

    @Description("The starting column of the range.")
    private com.zzw.github.graphql.schema.scalars.Int startColumn;
    public com.zzw.github.graphql.schema.scalars.Int getStartColumn() { return this.startColumn; }
    public void setStartColumn(com.zzw.github.graphql.schema.scalars.Int startColumn) { this.startColumn = startColumn; }

    @NonNull("!")
    @Description("The starting line of the range.")
    private com.zzw.github.graphql.schema.scalars.Int startLine;
    public com.zzw.github.graphql.schema.scalars.Int getStartLine() { return this.startLine; }
    public void setStartLine(com.zzw.github.graphql.schema.scalars.Int startLine) { this.startLine = startLine; }
}
