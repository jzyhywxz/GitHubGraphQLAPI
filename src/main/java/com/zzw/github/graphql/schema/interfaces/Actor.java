package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Bot",
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.User",
})
@Description("Represents an object which can take actions on GitHub. Typically a User or Bot.")
public interface Actor {
    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size of the resulting square image.")),
    })
    @NonNull("!")
    @Description("A URL pointing to the actor's public avatar.")
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl();
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl);

    @NonNull("!")
    @Description("The username of the actor.")
    public com.zzw.github.graphql.schema.scalars.String getLogin();
    public void setLogin(com.zzw.github.graphql.schema.scalars.String login);

    @NonNull("!")
    @Description("The HTTP path for this actor.")
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath();
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath);

    @NonNull("!")
    @Description("The HTTP URL for this actor.")
    public com.zzw.github.graphql.schema.scalars.URI getUrl();
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url);
}
