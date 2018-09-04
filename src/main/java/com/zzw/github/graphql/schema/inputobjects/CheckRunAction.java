package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Possible further actions the integrator can perform.")
public class CheckRunAction {
    @NonNull("!")
    @Description("A short explanation of what this action would do.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    @Description("A reference for the action on the integrator's system.")
    private com.zzw.github.graphql.schema.scalars.String identifier;
    public com.zzw.github.graphql.schema.scalars.String getIdentifier() { return this.identifier; }
    public void setIdentifier(com.zzw.github.graphql.schema.scalars.String identifier) { this.identifier = identifier; }

    @NonNull("!")
    @Description("The text to be displayed on a button in the web UI.")
    private com.zzw.github.graphql.schema.scalars.String label;
    public com.zzw.github.graphql.schema.scalars.String getLabel() { return this.label; }
    public void setLabel(com.zzw.github.graphql.schema.scalars.String label) { this.label = label; }
}
