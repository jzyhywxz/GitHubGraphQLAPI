package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a range of information from a Git blame.")
public class BlameRange extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Identifies the recency of the change, from 1 (new) to 10 (old). This is calculated as a 2-quantile and determines the length of distance between the median age of all the changes in the file and the recency of the current range's change.")
    private com.zzw.github.graphql.schema.scalars.Int age;
    public com.zzw.github.graphql.schema.scalars.Int getAge() { return this.age; }
    public void setAge(com.zzw.github.graphql.schema.scalars.Int age) { this.age = age; }

    @NonNull("!")
    @Description("Identifies the line author")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    @Description("The ending line for the range")
    private com.zzw.github.graphql.schema.scalars.Int endingLine;
    public com.zzw.github.graphql.schema.scalars.Int getEndingLine() { return this.endingLine; }
    public void setEndingLine(com.zzw.github.graphql.schema.scalars.Int endingLine) { this.endingLine = endingLine; }

    @NonNull("!")
    @Description("The starting line for the range")
    private com.zzw.github.graphql.schema.scalars.Int startingLine;
    public com.zzw.github.graphql.schema.scalars.Int getStartingLine() { return this.startingLine; }
    public void setStartingLine(com.zzw.github.graphql.schema.scalars.Int startingLine) { this.startingLine = startingLine; }
}
