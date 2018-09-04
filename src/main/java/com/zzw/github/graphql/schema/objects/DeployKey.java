package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A repository deploy key.")
public class DeployKey extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
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
    @Description("The deploy key.")
    private com.zzw.github.graphql.schema.scalars.String key;
    public com.zzw.github.graphql.schema.scalars.String getKey() { return this.key; }
    public void setKey(com.zzw.github.graphql.schema.scalars.String key) { this.key = key; }

    @NonNull("!")
    @Description("Whether or not the deploy key is read only.")
    private com.zzw.github.graphql.schema.scalars.Boolean readOnly;
    public com.zzw.github.graphql.schema.scalars.Boolean getReadOnly() { return this.readOnly; }
    public void setReadOnly(com.zzw.github.graphql.schema.scalars.Boolean readOnly) { this.readOnly = readOnly; }

    @NonNull("!")
    @Description("The deploy key title.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("Whether or not the deploy key has been verified.")
    private com.zzw.github.graphql.schema.scalars.Boolean verified;
    public com.zzw.github.graphql.schema.scalars.Boolean getVerified() { return this.verified; }
    public void setVerified(com.zzw.github.graphql.schema.scalars.Boolean verified) { this.verified = verified; }
}
