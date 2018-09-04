package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents an individual commit status context")
public class StatusContext extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("This commit this status context is attached to.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    @Description("The name of this status context.")
    private com.zzw.github.graphql.schema.scalars.String context;
    public com.zzw.github.graphql.schema.scalars.String getContext() { return this.context; }
    public void setContext(com.zzw.github.graphql.schema.scalars.String context) { this.context = context; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The actor who created this status context.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @Description("The description for this status context.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The state of this status context.")
    private com.zzw.github.graphql.schema.enums.StatusState state;
    public com.zzw.github.graphql.schema.enums.StatusState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.StatusState state) { this.state = state; }

    @Description("The URL for this status context.")
    private com.zzw.github.graphql.schema.scalars.URI targetUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTargetUrl() { return this.targetUrl; }
    public void setTargetUrl(com.zzw.github.graphql.schema.scalars.URI targetUrl) { this.targetUrl = targetUrl; }
}
