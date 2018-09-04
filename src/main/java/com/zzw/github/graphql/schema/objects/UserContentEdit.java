package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An edit on user content")
public class UserContentEdit extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    private com.zzw.github.graphql.schema.scalars.DateTime createdAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt() { return this.createdAt; }
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt) { this.createdAt = createdAt; }

    @Description("Identifies the date and time when the object was deleted.")
    private com.zzw.github.graphql.schema.scalars.DateTime deletedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getDeletedAt() { return this.deletedAt; }
    public void setDeletedAt(com.zzw.github.graphql.schema.scalars.DateTime deletedAt) { this.deletedAt = deletedAt; }

    @Description("The actor who deleted this content")
    private com.zzw.github.graphql.schema.interfaces.Actor deletedBy;
    public com.zzw.github.graphql.schema.interfaces.Actor getDeletedBy() { return this.deletedBy; }
    public void setDeletedBy(com.zzw.github.graphql.schema.interfaces.Actor deletedBy) { this.deletedBy = deletedBy; }

    @Description("A summary of the changes for this edit")
    private com.zzw.github.graphql.schema.scalars.String diff;
    public com.zzw.github.graphql.schema.scalars.String getDiff() { return this.diff; }
    public void setDiff(com.zzw.github.graphql.schema.scalars.String diff) { this.diff = diff; }

    @NonNull("!")
    @Description("When this content was edited")
    private com.zzw.github.graphql.schema.scalars.DateTime editedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getEditedAt() { return this.editedAt; }
    public void setEditedAt(com.zzw.github.graphql.schema.scalars.DateTime editedAt) { this.editedAt = editedAt; }

    @Description("The actor who edited this content")
    private com.zzw.github.graphql.schema.interfaces.Actor editor;
    public com.zzw.github.graphql.schema.interfaces.Actor getEditor() { return this.editor; }
    public void setEditor(com.zzw.github.graphql.schema.interfaces.Actor editor) { this.editor = editor; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    private com.zzw.github.graphql.schema.scalars.DateTime updatedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt() { return this.updatedAt; }
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt) { this.updatedAt = updatedAt; }
}
