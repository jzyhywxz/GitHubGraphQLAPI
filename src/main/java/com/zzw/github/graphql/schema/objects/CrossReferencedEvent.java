package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a mention made by one issue or pull request to another.")
public class CrossReferencedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Reference originated in a different repository.")
    private com.zzw.github.graphql.schema.scalars.Boolean isCrossRepository;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsCrossRepository() { return this.isCrossRepository; }
    public void setIsCrossRepository(com.zzw.github.graphql.schema.scalars.Boolean isCrossRepository) { this.isCrossRepository = isCrossRepository; }

    @NonNull("!")
    @Description("Identifies when the reference was made.")
    private com.zzw.github.graphql.schema.scalars.DateTime referencedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getReferencedAt() { return this.referencedAt; }
    public void setReferencedAt(com.zzw.github.graphql.schema.scalars.DateTime referencedAt) { this.referencedAt = referencedAt; }

    @NonNull("!")
    @Description("The HTTP path for this pull request.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Issue or pull request that made the reference.")
    private com.zzw.github.graphql.schema.unions.ReferencedSubject source;
    public com.zzw.github.graphql.schema.unions.ReferencedSubject getSource() { return this.source; }
    public void setSource(com.zzw.github.graphql.schema.unions.ReferencedSubject source) { this.source = source; }

    @NonNull("!")
    @Description("Issue or pull request to which the reference was made.")
    private com.zzw.github.graphql.schema.unions.ReferencedSubject target;
    public com.zzw.github.graphql.schema.unions.ReferencedSubject getTarget() { return this.target; }
    public void setTarget(com.zzw.github.graphql.schema.unions.ReferencedSubject target) { this.target = target; }

    @NonNull("!")
    @Description("The HTTP URL for this pull request.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Checks if the target will be closed when the source is merged.")
    private com.zzw.github.graphql.schema.scalars.Boolean willCloseTarget;
    public com.zzw.github.graphql.schema.scalars.Boolean getWillCloseTarget() { return this.willCloseTarget; }
    public void setWillCloseTarget(com.zzw.github.graphql.schema.scalars.Boolean willCloseTarget) { this.willCloseTarget = willCloseTarget; }
}
