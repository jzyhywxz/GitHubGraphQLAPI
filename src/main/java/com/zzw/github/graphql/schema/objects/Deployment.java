package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents triggered deployment instance.")
public class Deployment extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @Description("A list of statuses associated with the deployment.")
    private com.zzw.github.graphql.schema.objects.DeploymentStatusConnection statuses;
    public com.zzw.github.graphql.schema.objects.DeploymentStatusConnection getStatuses() { return this.statuses; }
    public void setStatuses(com.zzw.github.graphql.schema.objects.DeploymentStatusConnection statuses) { this.statuses = statuses; }

    @Description("Identifies the commit sha of the deployment.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the actor who triggered the deployment.")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @Description("The deployment description.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @Description("The environment to which this deployment was made.")
    private com.zzw.github.graphql.schema.scalars.String environment;
    public com.zzw.github.graphql.schema.scalars.String getEnvironment() { return this.environment; }
    public void setEnvironment(com.zzw.github.graphql.schema.scalars.String environment) { this.environment = environment; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("The latest status of this deployment.")
    private com.zzw.github.graphql.schema.objects.DeploymentStatus latestStatus;
    public com.zzw.github.graphql.schema.objects.DeploymentStatus getLatestStatus() { return this.latestStatus; }
    public void setLatestStatus(com.zzw.github.graphql.schema.objects.DeploymentStatus latestStatus) { this.latestStatus = latestStatus; }

    @Description("Extra information that a deployment system might need.")
    private com.zzw.github.graphql.schema.scalars.String payload;
    public com.zzw.github.graphql.schema.scalars.String getPayload() { return this.payload; }
    public void setPayload(com.zzw.github.graphql.schema.scalars.String payload) { this.payload = payload; }

    @Description("Identifies the Ref of the deployment, if the deployment was created by ref.")
    private com.zzw.github.graphql.schema.objects.Ref ref;
    public com.zzw.github.graphql.schema.objects.Ref getRef() { return this.ref; }
    public void setRef(com.zzw.github.graphql.schema.objects.Ref ref) { this.ref = ref; }

    @NonNull("!")
    @Description("Identifies the repository associated with the deployment.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Description("The current state of the deployment.")
    private com.zzw.github.graphql.schema.enums.DeploymentState state;
    public com.zzw.github.graphql.schema.enums.DeploymentState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.DeploymentState state) { this.state = state; }

    @Description("The deployment task.")
    private com.zzw.github.graphql.schema.scalars.String task;
    public com.zzw.github.graphql.schema.scalars.String getTask() { return this.task; }
    public void setTask(com.zzw.github.graphql.schema.scalars.String task) { this.task = task; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }
}
