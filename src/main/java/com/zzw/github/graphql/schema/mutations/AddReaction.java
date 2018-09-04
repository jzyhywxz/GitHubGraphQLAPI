package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds a reaction to a subject.")
public class AddReaction {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddReactionInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddReactionInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddReactionInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The reaction object.")
    private com.zzw.github.graphql.schema.objects.Reaction reaction;
    public com.zzw.github.graphql.schema.objects.Reaction getReaction() { return this.reaction; }
    public void setReaction(com.zzw.github.graphql.schema.objects.Reaction reaction) { this.reaction = reaction; }

    @NonNull("!")
    @Description("The reactable subject.")
    private com.zzw.github.graphql.schema.interfaces.Reactable subject;
    public com.zzw.github.graphql.schema.interfaces.Reactable getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.interfaces.Reactable subject) { this.subject = subject; }
}
