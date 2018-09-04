package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Specifies a review comment to be left with a Pull Request Review.")
public class DraftPullRequestReviewComment {
    @NonNull("!")
    @Description("Body of the comment to leave.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("Path to the file being commented on.")
    private com.zzw.github.graphql.schema.scalars.String path;
    public com.zzw.github.graphql.schema.scalars.String getPath() { return this.path; }
    public void setPath(com.zzw.github.graphql.schema.scalars.String path) { this.path = path; }

    @NonNull("!")
    @Description("Position in the file to leave a comment on.")
    private com.zzw.github.graphql.schema.scalars.Int position;
    public com.zzw.github.graphql.schema.scalars.Int getPosition() { return this.position; }
    public void setPosition(com.zzw.github.graphql.schema.scalars.Int position) { this.position = position; }
}
