package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'head_ref_force_pushed' event on a given pull request.")
public class HeadRefForcePushedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @Description("Identifies the after commit SHA for the 'head_ref_force_pushed' event.")
    private com.zzw.github.graphql.schema.objects.Commit afterCommit;
    public com.zzw.github.graphql.schema.objects.Commit getAfterCommit() { return this.afterCommit; }
    public void setAfterCommit(com.zzw.github.graphql.schema.objects.Commit afterCommit) { this.afterCommit = afterCommit; }

    @Description("Identifies the before commit SHA for the 'head_ref_force_pushed' event.")
    private com.zzw.github.graphql.schema.objects.Commit beforeCommit;
    public com.zzw.github.graphql.schema.objects.Commit getBeforeCommit() { return this.beforeCommit; }
    public void setBeforeCommit(com.zzw.github.graphql.schema.objects.Commit beforeCommit) { this.beforeCommit = beforeCommit; }

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
    @Description("PullRequest referenced by event.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }

    @Description("Identifies the fully qualified ref name for the 'head_ref_force_pushed' event.")
    private com.zzw.github.graphql.schema.objects.Ref ref;
    public com.zzw.github.graphql.schema.objects.Ref getRef() { return this.ref; }
    public void setRef(com.zzw.github.graphql.schema.objects.Ref ref) { this.ref = ref; }
}
