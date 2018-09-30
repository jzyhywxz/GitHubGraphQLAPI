package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A Gist.")
public class Gist extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.Starrable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("A list of comments associated with the gist")
    private com.zzw.github.graphql.schema.objects.GistCommentConnection comments;
    public com.zzw.github.graphql.schema.objects.GistCommentConnection getComments() { return this.comments; }
    public void setComments(com.zzw.github.graphql.schema.objects.GistCommentConnection comments) { this.comments = comments; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="orderBy", type="com.zzw.github.graphql.schema.inputobjects.StarOrder", nonNull=@NonNull(""), description=@Description("Order for connection")),
    })
    @NonNull("!")
    @Description("A list of users who have starred this starrable.")
    private com.zzw.github.graphql.schema.objects.StargazerConnection stargazers;
    public com.zzw.github.graphql.schema.objects.StargazerConnection getStargazers() { return this.stargazers; }
    public void setStargazers(com.zzw.github.graphql.schema.objects.StargazerConnection stargazers) { this.stargazers = stargazers; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("The gist description.")
    private com.zzw.github.graphql.schema.scalars.String description;
    public com.zzw.github.graphql.schema.scalars.String getDescription() { return this.description; }
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description) { this.description = description; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Whether the gist is public or not.")
    private com.zzw.github.graphql.schema.scalars.Boolean isPublic;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPublic() { return this.isPublic; }
    public void setIsPublic(com.zzw.github.graphql.schema.scalars.Boolean isPublic) { this.isPublic = isPublic; }

    @NonNull("!")
    @Description("The gist name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @Description("The gist owner.")
    private com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner;
    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getOwner() { return this.owner; }
    public void setOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner) { this.owner = owner; }

    @Description("Identifies when the gist was last pushed to.")
    private com.zzw.github.graphql.schema.scalars.DateTime pushedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getPushedAt() { return this.pushedAt; }
    public void setPushedAt(com.zzw.github.graphql.schema.scalars.DateTime pushedAt) { this.pushedAt = pushedAt; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }

    @NonNull("!")
    @Description("Returns a boolean indicating whether the viewing user has starred this starrable.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasStarred;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasStarred() { return this.viewerHasStarred; }
    public void setViewerHasStarred(com.zzw.github.graphql.schema.scalars.Boolean viewerHasStarred) { this.viewerHasStarred = viewerHasStarred; }
}
