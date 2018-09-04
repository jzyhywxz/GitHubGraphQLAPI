package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible errors that will prevent a user from updating a comment.")
public enum CommentCannotUpdateReason {
    @Description("You must be the author or have write access to this repository to update this comment.")
     INSUFFICIENT_ACCESS,
    @Description("Unable to create comment because issue is locked.")
     LOCKED,
    @Description("You must be logged in to update this comment.")
     LOGIN_REQUIRED,
    @Description("Repository is under maintenance.")
     MAINTENANCE,
    @Description("At least one email address must be verified to update this comment.")
     VERIFIED_EMAIL_REQUIRED,
}
