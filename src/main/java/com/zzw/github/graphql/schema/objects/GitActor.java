package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents an actor in a Git commit (ie. an author or committer).")
public class GitActor extends com.zzw.github.graphql.schema.Metadata {
    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size of the resulting square image.")),
    })
    @NonNull("!")
    @Description("A URL pointing to the author's public avatar.")
    private com.zzw.github.graphql.schema.scalars.URI avatarUrl;
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl() { return this.avatarUrl; }
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl) { this.avatarUrl = avatarUrl; }

    @Description("The timestamp of the Git action (authoring or committing).")
    private com.zzw.github.graphql.schema.scalars.GitTimestamp date;
    public com.zzw.github.graphql.schema.scalars.GitTimestamp getDate() { return this.date; }
    public void setDate(com.zzw.github.graphql.schema.scalars.GitTimestamp date) { this.date = date; }

    @Description("The email in the Git commit.")
    private com.zzw.github.graphql.schema.scalars.String email;
    public com.zzw.github.graphql.schema.scalars.String getEmail() { return this.email; }
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email) { this.email = email; }

    @Description("The name in the Git commit.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("The GitHub user corresponding to the email field. Null if no such user exists.")
    private com.zzw.github.graphql.schema.objects.User user;
    public com.zzw.github.graphql.schema.objects.User getUser() { return this.user; }
    public void setUser(com.zzw.github.graphql.schema.objects.User user) { this.user = user; }
}
