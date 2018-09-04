package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Create a deployment status.")
public class CreateDeploymentStatus {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateDeploymentStatusInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateDeploymentStatusInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateDeploymentStatusInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The new deployment status.")
    private com.zzw.github.graphql.schema.objects.DeploymentStatus deploymentStatus;
    public com.zzw.github.graphql.schema.objects.DeploymentStatus getDeploymentStatus() { return this.deploymentStatus; }
    public void setDeploymentStatus(com.zzw.github.graphql.schema.objects.DeploymentStatus deploymentStatus) { this.deploymentStatus = deploymentStatus; }
}
