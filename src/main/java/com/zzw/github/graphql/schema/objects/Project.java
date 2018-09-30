package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Projects manage issues, pull requests and notes within a project owner.")
public class Project extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Closable, com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Updatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("List of columns in the project")
    private com.zzw.github.graphql.schema.objects.ProjectColumnConnection columns;
    public com.zzw.github.graphql.schema.objects.ProjectColumnConnection getColumns() { return this.columns; }
    public void setColumns(com.zzw.github.graphql.schema.objects.ProjectColumnConnection columns) { this.columns = columns; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="archivedStates", type="com.zzw.github.graphql.schema.enums.ProjectCardArchivedState[]", nonNull=@NonNull(""), description=@Description("A list of archived states to filter the cards by")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("List of pending cards in this project")
    private com.zzw.github.graphql.schema.objects.ProjectCardConnection pendingCards;
    public com.zzw.github.graphql.schema.objects.ProjectCardConnection getPendingCards() { return this.pendingCards; }
    public void setPendingCards(com.zzw.github.graphql.schema.objects.ProjectCardConnection pendingCards) { this.pendingCards = pendingCards; }

    @Description("The project's description body.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @NonNull("!")
    @Description("The projects description body rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML bodyHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getBodyHTML() { return this.bodyHTML; }
    public void setBodyHTML(com.zzw.github.graphql.schema.scalars.HTML bodyHTML) { this.bodyHTML = bodyHTML; }

    @NonNull("!")
    @Description("true if the object is closed (definition of closed may depend on type)")
    private com.zzw.github.graphql.schema.scalars.Boolean closed;
    public com.zzw.github.graphql.schema.scalars.Boolean getClosed() { return this.closed; }
    public void setClosed(com.zzw.github.graphql.schema.scalars.Boolean closed) { this.closed = closed; }

    @Description("Identifies the date and time when the object was closed.")
    private com.zzw.github.graphql.schema.scalars.DateTime closedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getClosedAt() { return this.closedAt; }
    public void setClosedAt(com.zzw.github.graphql.schema.scalars.DateTime closedAt) { this.closedAt = closedAt; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The actor who originally created the project.")
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
    @Description("The project's name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The project's number.")
    private com.zzw.github.graphql.schema.scalars.Int number;
    public com.zzw.github.graphql.schema.scalars.Int getNumber() { return this.number; }
    public void setNumber(com.zzw.github.graphql.schema.scalars.Int number) { this.number = number; }

    @NonNull("!")
    @Description("The project's owner. Currently limited to repositories and organizations.")
    private com.zzw.github.graphql.schema.interfaces.ProjectOwner owner;
    public com.zzw.github.graphql.schema.interfaces.ProjectOwner getOwner() { return this.owner; }
    public void setOwner(com.zzw.github.graphql.schema.interfaces.ProjectOwner owner) { this.owner = owner; }

    @NonNull("!")
    @Description("The HTTP path for this project")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("Whether the project is open or closed.")
    private com.zzw.github.graphql.schema.enums.ProjectState state;
    public com.zzw.github.graphql.schema.enums.ProjectState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.ProjectState state) { this.state = state; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("The HTTP URL for this project")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Check if the current viewer can update this object.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdate;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanUpdate() { return this.viewerCanUpdate; }
    public void setViewerCanUpdate(com.zzw.github.graphql.schema.scalars.Boolean viewerCanUpdate) { this.viewerCanUpdate = viewerCanUpdate; }
}
