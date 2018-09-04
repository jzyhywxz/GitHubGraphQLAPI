package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A suggestion to review a pull request based on a user's commit history and review comments.")
public class SuggestedReviewer extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Is this suggestion based on past commits?")
    private com.zzw.github.graphql.schema.scalars.Boolean isAuthor;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsAuthor() { return this.isAuthor; }
    public void setIsAuthor(com.zzw.github.graphql.schema.scalars.Boolean isAuthor) { this.isAuthor = isAuthor; }

    @NonNull("!")
    @Description("Is this suggestion based on past review comments?")
    private com.zzw.github.graphql.schema.scalars.Boolean isCommenter;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsCommenter() { return this.isCommenter; }
    public void setIsCommenter(com.zzw.github.graphql.schema.scalars.Boolean isCommenter) { this.isCommenter = isCommenter; }

    @NonNull("!")
    @Description("Identifies the user suggested to review the pull request.")
    private com.zzw.github.graphql.schema.objects.User reviewer;
    public com.zzw.github.graphql.schema.objects.User getReviewer() { return this.reviewer; }
    public void setReviewer(com.zzw.github.graphql.schema.objects.User reviewer) { this.reviewer = reviewer; }
}
