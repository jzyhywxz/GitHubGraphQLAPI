package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A group of emoji reactions to a particular piece of content.")
public class ReactionGroup extends com.zzw.github.graphql.schema.Metadata {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @NonNull("!")
    @Description("Users who have reacted to the reaction subject with the emotion represented by this reaction group")
    private com.zzw.github.graphql.schema.objects.ReactingUserConnection users;
    public com.zzw.github.graphql.schema.objects.ReactingUserConnection getUsers() { return this.users; }
    public void setUsers(com.zzw.github.graphql.schema.objects.ReactingUserConnection users) { this.users = users; }

    @NonNull("!")
    @Description("Identifies the emoji reaction.")
    private com.zzw.github.graphql.schema.enums.ReactionContent content;
    public com.zzw.github.graphql.schema.enums.ReactionContent getContent() { return this.content; }
    public void setContent(com.zzw.github.graphql.schema.enums.ReactionContent content) { this.content = content; }

    @Description("Identifies when the reaction was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    @Description("The subject that was reacted to.")
    private com.zzw.github.graphql.schema.interfaces.Reactable subject;
    public com.zzw.github.graphql.schema.interfaces.Reactable getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.interfaces.Reactable subject) { this.subject = subject; }

    @NonNull("!")
    @Description("Whether or not the authenticated user has left a reaction on the subject.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasReacted;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasReacted() { return this.viewerHasReacted; }
    public void setViewerHasReacted(com.zzw.github.graphql.schema.scalars.Boolean viewerHasReacted) { this.viewerHasReacted = viewerHasReacted; }
}
