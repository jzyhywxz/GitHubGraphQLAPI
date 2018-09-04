package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Describes the status of a given deployment attempt.")
public class DeploymentStatus extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the actor who triggered the deployment.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @NonNull("!")
    @Description("Identifies the deployment associated with status.")
    private com.zzw.github.graphql.schema.objects.Deployment deployment;
    public com.zzw.github.graphql.schema.objects.Deployment getDeployment() { return this.deployment; }
    public void setDeployment(com.zzw.github.graphql.schema.objects.Deployment deployment) { this.deployment = deployment; }

    @Description("Identifies the description of the deployment.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("Identifies the environment of the deployment at the time of this deployment status")
    private com.zzw.github.graphql.schema.scalars.String environment;
    public com.zzw.github.graphql.schema.scalars.String getEnvironment() { return this.environment; }
    public void setEnvironment(com.zzw.github.graphql.schema.scalars.String environment) { this.environment = environment; }

    @Description("Identifies the environment URL of the deployment.")
    private com.zzw.github.graphql.schema.scalars.URI environmentUrl;
    public com.zzw.github.graphql.schema.scalars.URI getEnvironmentUrl() { return this.environmentUrl; }
    public void setEnvironmentUrl(com.zzw.github.graphql.schema.scalars.URI environmentUrl) { this.environmentUrl = environmentUrl; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("Identifies the log URL of the deployment.")
    private com.zzw.github.graphql.schema.scalars.URI logUrl;
    public com.zzw.github.graphql.schema.scalars.URI getLogUrl() { return this.logUrl; }
    public void setLogUrl(com.zzw.github.graphql.schema.scalars.URI logUrl) { this.logUrl = logUrl; }

    @NonNull("!")
    @Description("Identifies the current state of the deployment.")
    private com.zzw.github.graphql.schema.enums.DeploymentStatusState state;
    public com.zzw.github.graphql.schema.enums.DeploymentStatusState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.DeploymentStatusState state) { this.state = state; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }
}
