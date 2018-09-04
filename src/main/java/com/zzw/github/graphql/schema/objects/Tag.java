package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git tag.")
public class Tag extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.GitObject, com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("An abbreviated version of the Git object ID")
    private com.zzw.github.graphql.schema.scalars.String abbreviatedOid;
    public com.zzw.github.graphql.schema.scalars.String getAbbreviatedOid() { return this.abbreviatedOid; }
    public void setAbbreviatedOid(com.zzw.github.graphql.schema.scalars.String abbreviatedOid) { this.abbreviatedOid = abbreviatedOid; }

    @NonNull("!")
    @Description("The HTTP path for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getCommitResourcePath() { return this.commitResourcePath; }
    public void setCommitResourcePath(com.zzw.github.graphql.schema.scalars.URI commitResourcePath) { this.commitResourcePath = commitResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for this Git object")
    private com.zzw.github.graphql.schema.scalars.URI commitUrl;
    public com.zzw.github.graphql.schema.scalars.URI getCommitUrl() { return this.commitUrl; }
    public void setCommitUrl(com.zzw.github.graphql.schema.scalars.URI commitUrl) { this.commitUrl = commitUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The Git tag message.")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("The Git tag name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The Git object ID")
    private com.zzw.github.graphql.schema.scalars.GitObjectID oid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid() { return this.oid; }
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid) { this.oid = oid; }

    @NonNull("!")
    @Description("The Repository the Git object belongs to")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("Details about the tag author.")
    private com.zzw.github.graphql.schema.objects.GitActor tagger;
    public com.zzw.github.graphql.schema.objects.GitActor getTagger() { return this.tagger; }
    public void setTagger(com.zzw.github.graphql.schema.objects.GitActor tagger) { this.tagger = tagger; }

    @NonNull("!")
    @Description("The Git object the tag points to.")
    private com.zzw.github.graphql.schema.interfaces.GitObject target;
    public com.zzw.github.graphql.schema.interfaces.GitObject getTarget() { return this.target; }
    public void setTarget(com.zzw.github.graphql.schema.interfaces.GitObject target) { this.target = target; }
}
