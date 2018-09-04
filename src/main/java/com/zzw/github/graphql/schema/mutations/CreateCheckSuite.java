package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Create a check suite")
public class CreateCheckSuite {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateCheckSuiteInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateCheckSuiteInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateCheckSuiteInput input) { this.input = input; }

    @Description("The newly created check suite.")
    private com.zzw.github.graphql.schema.objects.CheckSuite checkSuite;
    public com.zzw.github.graphql.schema.objects.CheckSuite getCheckSuite() { return this.checkSuite; }
    public void setCheckSuite(com.zzw.github.graphql.schema.objects.CheckSuite checkSuite) { this.checkSuite = checkSuite; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
