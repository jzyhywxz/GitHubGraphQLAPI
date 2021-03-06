package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'moved_columns_in_project' event on a given issue or pull request.")
public class MovedColumnsInProjectEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Column name the issue or pull request was moved from.")
    private com.zzw.github.graphql.schema.scalars.String previousProjectColumnName;
    public com.zzw.github.graphql.schema.scalars.String getPreviousProjectColumnName() { return this.previousProjectColumnName; }
    public void setPreviousProjectColumnName(com.zzw.github.graphql.schema.scalars.String previousProjectColumnName) { this.previousProjectColumnName = previousProjectColumnName; }

    @Description("Project referenced by event.")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }

    @Description("Project card referenced by this project event.")
    private com.zzw.github.graphql.schema.objects.ProjectCard projectCard;
    public com.zzw.github.graphql.schema.objects.ProjectCard getProjectCard() { return this.projectCard; }
    public void setProjectCard(com.zzw.github.graphql.schema.objects.ProjectCard projectCard) { this.projectCard = projectCard; }

    @NonNull("!")
    @Description("Column name the issue or pull request was moved to.")
    private com.zzw.github.graphql.schema.scalars.String projectColumnName;
    public com.zzw.github.graphql.schema.scalars.String getProjectColumnName() { return this.projectColumnName; }
    public void setProjectColumnName(com.zzw.github.graphql.schema.scalars.String projectColumnName) { this.projectColumnName = projectColumnName; }
}
