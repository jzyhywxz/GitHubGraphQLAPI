package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a 'renamed' event on a given issue or pull request")
public class RenamedTitleEvent extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("Identifies the actor who performed the event.")
    private com.zzw.github.graphql.schema.interfaces.Actor actor;
    public com.zzw.github.graphql.schema.interfaces.Actor getActor() { return this.actor; }
    public void setActor(com.zzw.github.graphql.schema.interfaces.Actor actor) { this.actor = actor; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @NonNull("!")
    @Description("Identifies the current title of the issue or pull request.")
    private com.zzw.github.graphql.schema.scalars.String currentTitle;
    public com.zzw.github.graphql.schema.scalars.String getCurrentTitle() { return this.currentTitle; }
    public void setCurrentTitle(com.zzw.github.graphql.schema.scalars.String currentTitle) { this.currentTitle = currentTitle; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the previous title of the issue or pull request.")
    private com.zzw.github.graphql.schema.scalars.String previousTitle;
    public com.zzw.github.graphql.schema.scalars.String getPreviousTitle() { return this.previousTitle; }
    public void setPreviousTitle(com.zzw.github.graphql.schema.scalars.String previousTitle) { this.previousTitle = previousTitle; }

    @NonNull("!")
    @Description("Subject that was renamed.")
    private com.zzw.github.graphql.schema.unions.RenamedTitleSubject subject;
    public com.zzw.github.graphql.schema.unions.RenamedTitleSubject getSubject() { return this.subject; }
    public void setSubject(com.zzw.github.graphql.schema.unions.RenamedTitleSubject subject) { this.subject = subject; }
}
