package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An invitation for a user to be added to a repository.")
public class RepositoryInvitation extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The user who received the invitation.")
    private com.zzw.github.graphql.schema.objects.User invitee;
    public com.zzw.github.graphql.schema.objects.User getInvitee() { return this.invitee; }
    public void setInvitee(com.zzw.github.graphql.schema.objects.User invitee) { this.invitee = invitee; }

    @NonNull("!")
    @Description("The user who created the invitation.")
    private com.zzw.github.graphql.schema.objects.User inviter;
    public com.zzw.github.graphql.schema.objects.User getInviter() { return this.inviter; }
    public void setInviter(com.zzw.github.graphql.schema.objects.User inviter) { this.inviter = inviter; }

    @NonNull("!")
    @Description("The permission granted on this repository by this invitation.")
    private com.zzw.github.graphql.schema.enums.RepositoryPermission permission;
    public com.zzw.github.graphql.schema.enums.RepositoryPermission getPermission() { return this.permission; }
    public void setPermission(com.zzw.github.graphql.schema.enums.RepositoryPermission permission) { this.permission = permission; }

    @Description("The Repository the user is invited to.")
    private com.zzw.github.graphql.schema.interfaces.RepositoryInfo repository;
    public com.zzw.github.graphql.schema.interfaces.RepositoryInfo getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.interfaces.RepositoryInfo repository) { this.repository = repository; }
}
