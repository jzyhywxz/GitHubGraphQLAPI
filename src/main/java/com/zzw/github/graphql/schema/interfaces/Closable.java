package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.Milestone",
        "com.zzw.github.graphql.schema.objects.Project",
        "com.zzw.github.graphql.schema.objects.PullRequest",
})
@Description("An object that can be closed")
public interface Closable {
    @NonNull("!")
    @Description(" if the object is closed (definition of closed may depend on type)")
    public com.zzw.github.graphql.schema.scalars.Boolean getClosed();
    public void setClosed(com.zzw.github.graphql.schema.scalars.Boolean closed);

    @Description("Identifies the date and time when the object was closed.")
    public com.zzw.github.graphql.schema.scalars.DateTime getClosedAt();
    public void setClosedAt(com.zzw.github.graphql.schema.scalars.DateTime closedAt);
}
