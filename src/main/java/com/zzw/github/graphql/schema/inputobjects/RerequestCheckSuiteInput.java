package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of RerequestCheckSuite")
public class RerequestCheckSuiteInput {
    @NonNull("!")
    @Description("The Node ID of the check suite.")
    private com.zzw.github.graphql.schema.scalars.ID checkSuiteId;
    public com.zzw.github.graphql.schema.scalars.ID getCheckSuiteId() { return this.checkSuiteId; }
    public void setCheckSuiteId(com.zzw.github.graphql.schema.scalars.ID checkSuiteId) { this.checkSuiteId = checkSuiteId; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The Node ID of the repository.")
    private com.zzw.github.graphql.schema.scalars.ID repositoryId;
    public com.zzw.github.graphql.schema.scalars.ID getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(com.zzw.github.graphql.schema.scalars.ID repositoryId) { this.repositoryId = repositoryId; }
}