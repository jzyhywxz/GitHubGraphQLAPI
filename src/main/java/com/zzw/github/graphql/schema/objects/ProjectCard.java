package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A card in a project.")
public class ProjectCard extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("The project column this card is associated under. A card may only belong to one project column at a time. The column field will be null if the card is created in a pending state and has yet to be associated with a column. Once cards are associated with a column, they will not become pending in the future.")
    private com.zzw.github.graphql.schema.objects.ProjectColumn column;
    public com.zzw.github.graphql.schema.objects.ProjectColumn getColumn() { return this.column; }
    public void setColumn(com.zzw.github.graphql.schema.objects.ProjectColumn column) { this.column = column; }

    @Description("The card content item")
    private com.zzw.github.graphql.schema.unions.ProjectCardItem content;
    public com.zzw.github.graphql.schema.unions.ProjectCardItem getContent() { return this.content; }
    public void setContent(com.zzw.github.graphql.schema.unions.ProjectCardItem content) { this.content = content; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The actor who created this card")
    private com.zzw.github.graphql.schema.interfaces.Actor creator;
    public com.zzw.github.graphql.schema.interfaces.Actor getCreator() { return this.creator; }
    public void setCreator(com.zzw.github.graphql.schema.interfaces.Actor creator) { this.creator = creator; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether the card is archived")
    private com.zzw.github.graphql.schema.scalars.Boolean isArchived;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsArchived() { return this.isArchived; }
    public void setIsArchived(com.zzw.github.graphql.schema.scalars.Boolean isArchived) { this.isArchived = isArchived; }

    @Description("The card note")
    private com.zzw.github.graphql.schema.scalars.String note;
    public com.zzw.github.graphql.schema.scalars.String getNote() { return this.note; }
    public void setNote(com.zzw.github.graphql.schema.scalars.String note) { this.note = note; }

    @NonNull("!")
    @Description("The project that contains this card.")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }

    @NonNull("!")
    @Description("The HTTP path for this card")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("The state of ProjectCard")
    private com.zzw.github.graphql.schema.enums.ProjectCardState state;
    public com.zzw.github.graphql.schema.enums.ProjectCardState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.ProjectCardState state) { this.state = state; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this card")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
