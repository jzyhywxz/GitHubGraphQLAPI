package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a Git tree entry.")
public class TreeEntry extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Entry file mode.")
    private com.zzw.github.graphql.schema.scalars.Int mode;
    public com.zzw.github.graphql.schema.scalars.Int getMode() { return this.mode; }
    public void setMode(com.zzw.github.graphql.schema.scalars.Int mode) { this.mode = mode; }

    @NonNull("!")
    @Description("Entry file name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("Entry file object.")
    private com.zzw.github.graphql.schema.interfaces.GitObject object;
    public com.zzw.github.graphql.schema.interfaces.GitObject getObject() { return this.object; }
    public void setObject(com.zzw.github.graphql.schema.interfaces.GitObject object) { this.object = object; }

    @NonNull("!")
    @Description("Entry file Git object ID.")
    private com.zzw.github.graphql.schema.scalars.GitObjectID oid;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid() { return this.oid; }
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid) { this.oid = oid; }

    @NonNull("!")
    @Description("The Repository the tree entry belongs to")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("Entry file type.")
    private com.zzw.github.graphql.schema.scalars.String type;
    public com.zzw.github.graphql.schema.scalars.String getType() { return this.type; }
    public void setType(com.zzw.github.graphql.schema.scalars.String type) { this.type = type; }
}
