package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of DeclineTopicSuggestion")
public class DeclineTopicSuggestionInput {
    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The name of the suggested topic.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The reason why the suggested topic is declined.")
    private com.zzw.github.graphql.schema.enums.TopicSuggestionDeclineReason reason;
    public com.zzw.github.graphql.schema.enums.TopicSuggestionDeclineReason getReason() { return this.reason; }
    public void setReason(com.zzw.github.graphql.schema.enums.TopicSuggestionDeclineReason reason) { this.reason = reason; }

    @NonNull("!")
    @Description("The Node ID of the repository.")
    private com.zzw.github.graphql.schema.scalars.ID repositoryId;
    public com.zzw.github.graphql.schema.scalars.ID getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(com.zzw.github.graphql.schema.scalars.ID repositoryId) { this.repositoryId = repositoryId; }
}
