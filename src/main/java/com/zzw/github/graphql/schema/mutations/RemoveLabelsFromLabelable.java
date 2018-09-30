package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Removes labels from a Labelable object.")
public class RemoveLabelsFromLabelable {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.RemoveLabelsFromLabelableInput input;
    public com.zzw.github.graphql.schema.inputobjects.RemoveLabelsFromLabelableInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.RemoveLabelsFromLabelableInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The Labelable the labels were removed from.")
    private com.zzw.github.graphql.schema.interfaces.Labelable labelable;
    public com.zzw.github.graphql.schema.interfaces.Labelable getLabelable() { return this.labelable; }
    public void setLabelable(com.zzw.github.graphql.schema.interfaces.Labelable labelable) { this.labelable = labelable; }
}
