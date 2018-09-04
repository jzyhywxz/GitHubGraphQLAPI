package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Describes a License's conditions, permissions, and limitations")
public class LicenseRule extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("A description of the rule")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    @Description("The machine-readable rule key")
    private com.zzw.github.graphql.schema.scalars.String key;
    public com.zzw.github.graphql.schema.scalars.String getKey() { return this.key; }
    public void setKey(com.zzw.github.graphql.schema.scalars.String key) { this.key = key; }

    @NonNull("!")
    @Description("The human-readable rule label")
    private com.zzw.github.graphql.schema.scalars.String label;
    public com.zzw.github.graphql.schema.scalars.String getLabel() { return this.label; }
    public void setLabel(com.zzw.github.graphql.schema.scalars.String label) { this.label = label; }
}
