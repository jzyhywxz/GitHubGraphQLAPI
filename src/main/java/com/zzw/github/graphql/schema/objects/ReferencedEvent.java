package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'referenced' event on a given ReferencedSubject.")
public class ReferencedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @Description("Identifies the commit associated with the 'referenced' event.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    @Description("Identifies the repository associated with the 'referenced' event.")
    private com.zzw.github.graphql.schema.objects.Repository commitRepository;
    public com.zzw.github.graphql.schema.objects.Repository getCommitRepository() { return this.commitRepository; }
    public void setCommitRepository(com.zzw.github.graphql.schema.objects.Repository commitRepository) { this.commitRepository = commitRepository; }

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
    @Description("Checks if the commit message itself references the subject. Can be false in the case of a commit comment reference.")
    private com.zzw.github.graphql.schema.scalars.Boolean isDirectReference;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDirectReference() { return this.isDirectReference; }
    public void setIsDirectReference(com.zzw.github.graphql.schema.scalars.Boolean isDirectReference) { this.isDirectReference = isDirectReference; }

    @NonNull("!")
    @Description("Object referenced by event.")
    private com.zzw.github.graphql.schema.unions.ReferencedSubject subject;
    public com.zzw.github.graphql.schema.unions.ReferencedSubject getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.unions.ReferencedSubject subject) { this.subject = subject; }
}
