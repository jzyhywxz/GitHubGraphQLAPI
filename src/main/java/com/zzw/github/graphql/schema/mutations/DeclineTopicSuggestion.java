package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Rejects a suggested topic for the repository.")
public class DeclineTopicSuggestion {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.DeclineTopicSuggestionInput input;
    public com.zzw.github.graphql.schema.inputobjects.DeclineTopicSuggestionInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.DeclineTopicSuggestionInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The declined topic.")
    private com.zzw.github.graphql.schema.objects.Topic topic;
    public com.zzw.github.graphql.schema.objects.Topic getTopic() { return this.topic; }
    public void setTopic(com.zzw.github.graphql.schema.objects.Topic topic) { this.topic = topic; }
}
