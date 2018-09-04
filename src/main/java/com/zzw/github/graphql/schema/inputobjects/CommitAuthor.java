package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Specifies an author for filtering Git commits.")
public class CommitAuthor {
    @NonNull("[!]")
    @Description("Email addresses to filter by. Commits authored by any of the specified email addresses will be returned.")
    private com.zzw.github.graphql.schema.scalars.String[] emails;
    public com.zzw.github.graphql.schema.scalars.String[] getEmails() { return this.emails; }
    public void setEmails(com.zzw.github.graphql.schema.scalars.String[] emails) { this.emails = emails; }

    @Description("ID of a User to filter by. If non-null, only commits authored by this user will be returned. This field takes precedence over emails.")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }
}
