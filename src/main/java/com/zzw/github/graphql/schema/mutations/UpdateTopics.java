package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Replaces the repository's topics with the given topics.")
public class UpdateTopics {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateTopicsInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateTopicsInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateTopicsInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("[!]")
    @Description("Names of the provided topics that are not valid.")
    private com.zzw.github.graphql.schema.scalars.String[] invalidTopicNames;
    public com.zzw.github.graphql.schema.scalars.String[] getInvalidTopicNames() { return this.invalidTopicNames; }
    public void setInvalidTopicNames(com.zzw.github.graphql.schema.scalars.String[] invalidTopicNames) { this.invalidTopicNames = invalidTopicNames; }

    @NonNull("!")
    @Description("The updated repository.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }
}
