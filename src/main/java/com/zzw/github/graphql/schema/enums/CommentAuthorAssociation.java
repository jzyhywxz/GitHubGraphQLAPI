package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A comment author association with repository.")
public enum CommentAuthorAssociation {
    @Description("Author has been invited to collaborate on the repository.")
     COLLABORATOR,
    @Description("Author has previously committed to the repository.")
     CONTRIBUTOR,
    @Description("Author has not previously committed to GitHub.")
     FIRST_TIMER,
    @Description("Author has not previously committed to the repository.")
     FIRST_TIME_CONTRIBUTOR,
    @Description("Author is a member of the organization that owns the repository.")
     MEMBER,
    @Description("Author has no association with the repository.")
     NONE,
    @Description("Author is the owner of the repository.")
     OWNER,
}
