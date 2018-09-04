package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A Git push.")
public class Push extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The SHA after the push")
    private com.zzw.github.graphql.schema.scalars.GitObjectID nextSha;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getNextSha() { return this.nextSha; }
    public void setNextSha(com.zzw.github.graphql.schema.scalars.GitObjectID nextSha) { this.nextSha = nextSha; }

    @NonNull("!")
    @Description("The permalink for this push.")
    private com.zzw.github.graphql.schema.scalars.URI permalink;
    public com.zzw.github.graphql.schema.scalars.URI getPermalink() { return this.permalink; }
    public void setPermalink(com.zzw.github.graphql.schema.scalars.URI permalink) { this.permalink = permalink; }

    @Description("The SHA before the push")
    private com.zzw.github.graphql.schema.scalars.GitObjectID previousSha;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getPreviousSha() { return this.previousSha; }
    public void setPreviousSha(com.zzw.github.graphql.schema.scalars.GitObjectID previousSha) { this.previousSha = previousSha; }

    @NonNull("!")
    @Description("The user who pushed")
    private com.zzw.github.graphql.schema.objects.User pusher;
    public com.zzw.github.graphql.schema.objects.User getPusher() { return this.pusher; }
    public void setPusher(com.zzw.github.graphql.schema.objects.User pusher) { this.pusher = pusher; }

    @NonNull("!")
    @Description("The repository that was pushed to")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }
}
