package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of CreateDeploymentStatus")
public class CreateDeploymentStatusInput {
    @Description("Adds a new inactive status to all non-transient, non-production environment deployments with the same repository and environment name as the created status's deployment.")
    private com.zzw.github.graphql.schema.scalars.Boolean autoInactive;
    public com.zzw.github.graphql.schema.scalars.Boolean getAutoInactive() { return this.autoInactive; }
    public void setAutoInactive(com.zzw.github.graphql.schema.scalars.Boolean autoInactive) { this.autoInactive = autoInactive; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The node ID of the deployment.")
    private com.zzw.github.graphql.schema.scalars.ID deploymentId;
    public com.zzw.github.graphql.schema.scalars.ID getDeploymentId() { return this.deploymentId; }
    public void setDeploymentId(com.zzw.github.graphql.schema.scalars.ID deploymentId) { this.deploymentId = deploymentId; }

    @Description("A short description of the status. Maximum length of 140 characters.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("If provided, updates the environment of the deploy. Otherwise, does not modify the environment.")
    private com.zzw.github.graphql.schema.scalars.String environment;
    public com.zzw.github.graphql.schema.scalars.String getEnvironment() { return this.environment; }
    public void setEnvironment(com.zzw.github.graphql.schema.scalars.String environment) { this.environment = environment; }

    @Description("Sets the URL for accessing your environment.")
    private com.zzw.github.graphql.schema.scalars.String environmentUrl;
    public com.zzw.github.graphql.schema.scalars.String getEnvironmentUrl() { return this.environmentUrl; }
    public void setEnvironmentUrl(com.zzw.github.graphql.schema.scalars.String environmentUrl) { this.environmentUrl = environmentUrl; }

    @Description("The log URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment.")
    private com.zzw.github.graphql.schema.scalars.String logUrl;
    public com.zzw.github.graphql.schema.scalars.String getLogUrl() { return this.logUrl; }
    public void setLogUrl(com.zzw.github.graphql.schema.scalars.String logUrl) { this.logUrl = logUrl; }

    @NonNull("!")
    @Description("The state of the deployment.")
    private com.zzw.github.graphql.schema.enums.DeploymentStatusState state;
    public com.zzw.github.graphql.schema.enums.DeploymentStatusState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.DeploymentStatusState state) { this.state = state; }
}
