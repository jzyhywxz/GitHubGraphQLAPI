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
    public com.zzw.github.graphql.schema.scalars.Boolean getClosed();
    public void setClosed(com.zzw.github.graphql.schema.scalars.Boolean closed);

    public com.zzw.github.graphql.schema.scalars.DateTime getClosedAt();
    public void setClosedAt(com.zzw.github.graphql.schema.scalars.DateTime closedAt);
}
