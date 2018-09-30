package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Gist",
        "com.zzw.github.graphql.schema.objects.Repository",
})
@Description("Things that can be starred.")
public interface Starrable {
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasStarred();
    public void setViewerHasStarred(com.zzw.github.graphql.schema.scalars.Boolean viewerHasStarred);
}
