package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'head_ref_deleted' event on a given pull request.")
public class HeadRefDeletedEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the Ref associated with the head_ref_deleted event.")
    private com.zzw.github.graphql.schema.objects.Ref headRef;
    public com.zzw.github.graphql.schema.objects.Ref getHeadRef() { return this.headRef; }
    public void setHeadRef(com.zzw.github.graphql.schema.objects.Ref headRef) { this.headRef = headRef; }

    @NonNull("!")
    @Description("Identifies the name of the Ref associated with the head_ref_deleted event.")
    private com.zzw.github.graphql.schema.scalars.String headRefName;
    public com.zzw.github.graphql.schema.scalars.String getHeadRefName() { return this.headRefName; }
    public void setHeadRefName(com.zzw.github.graphql.schema.scalars.String headRefName) { this.headRefName = headRefName; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("PullRequest referenced by event.")
    private com.zzw.github.graphql.schema.objects.PullRequest pullRequest;
    public com.zzw.github.graphql.schema.objects.PullRequest getPullRequest() { return this.pullRequest; }
    public void setPullRequest(com.zzw.github.graphql.schema.objects.PullRequest pullRequest) { this.pullRequest = pullRequest; }
}
