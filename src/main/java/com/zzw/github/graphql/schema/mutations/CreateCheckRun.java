package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Create a check run.")
public class CreateCheckRun {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateCheckRunInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateCheckRunInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateCheckRunInput input) { this.input = input; }

    @Description("The newly created check run.")
    private com.zzw.github.graphql.schema.objects.CheckRun checkRun;
    public com.zzw.github.graphql.schema.objects.CheckRun getCheckRun() { return this.checkRun; }
    public void setCheckRun(com.zzw.github.graphql.schema.objects.CheckRun checkRun) { this.checkRun = checkRun; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }
}
