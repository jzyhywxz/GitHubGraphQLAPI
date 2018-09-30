package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Commit",
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.PullRequest",
        "com.zzw.github.graphql.schema.objects.Repository",
        "com.zzw.github.graphql.schema.objects.Team",
        "com.zzw.github.graphql.schema.objects.TeamDiscussion",
})
@Description("Entities that can be subscribed to for web and email notifications.")
public interface Subscribable {
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanSubscribe();
    public void setViewerCanSubscribe(com.zzw.github.graphql.schema.scalars.Boolean viewerCanSubscribe);

    public com.zzw.github.graphql.schema.enums.SubscriptionState getViewerSubscription();
    public void setViewerSubscription(com.zzw.github.graphql.schema.enums.SubscriptionState viewerSubscription);
}
