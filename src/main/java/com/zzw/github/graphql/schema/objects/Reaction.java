package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An emoji reaction to a particular piece of content.")
public class Reaction extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("Identifies the emoji reaction.")
    private com.zzw.github.graphql.schema.enums.ReactionContent content;
    public com.zzw.github.graphql.schema.enums.ReactionContent getContent() { return this.content; }
    public void setContent(com.zzw.github.graphql.schema.enums.ReactionContent content) { this.content = content; }

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
    @Description("The reactable piece of content")
    private com.zzw.github.graphql.schema.interfaces.Reactable reactable;
    public com.zzw.github.graphql.schema.interfaces.Reactable getReactable() { return this.reactable; }
    public void setReactable(com.zzw.github.graphql.schema.interfaces.Reactable reactable) { this.reactable = reactable; }

    @Description("Identifies the user who created this reaction.")
    private com.zzw.github.graphql.schema.objects.User user;
    public com.zzw.github.graphql.schema.objects.User getUser() { return this.user; }
    public void setUser(com.zzw.github.graphql.schema.objects.User user) { this.user = user; }
}
