package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Creates a new deployment event.")
public class CreateDeployment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateDeploymentInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateDeploymentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateDeploymentInput input) { this.input = input; }

    @Description("True if the default branch has been auto-merged into the deployment ref.")
    private com.zzw.github.graphql.schema.scalars.Boolean autoMerged;
    public com.zzw.github.graphql.schema.scalars.Boolean getAutoMerged() { return this.autoMerged; }
    public void setAutoMerged(com.zzw.github.graphql.schema.scalars.Boolean autoMerged) { this.autoMerged = autoMerged; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The new deployment.")
    private com.zzw.github.graphql.schema.objects.Deployment deployment;
    public com.zzw.github.graphql.schema.objects.Deployment getDeployment() { return this.deployment; }
    public void setDeployment(com.zzw.github.graphql.schema.objects.Deployment deployment) { this.deployment = deployment; }
}
