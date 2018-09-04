package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.User",
})
@Description("Represents an owner of a Repository.")
public interface RepositoryOwner {
    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size of the resulting square image.")),
    })
    @NonNull("!")
    @Description("A URL pointing to the owner's public avatar.")
    public com.zzw.github.graphql.schema.scalars.URI getAvatarUrl();
    public void setAvatarUrl(com.zzw.github.graphql.schema.scalars.URI avatarUrl);

    @NonNull("!")
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    @NonNull("!")
    @Description("The username used to login.")
    public com.zzw.github.graphql.schema.scalars.String getLogin();
    public void setLogin(com.zzw.github.graphql.schema.scalars.String login);

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("Name of Repository to find.")),
    })
    @Description("Find Repository.")
    public com.zzw.github.graphql.schema.objects.Repository getRepository();
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository);

    @NonNull("!")
    @Description("The HTTP URL for the owner.")
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath();
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath);

    @NonNull("!")
    @Description("The HTTP URL for the owner.")
    public com.zzw.github.graphql.schema.scalars.URI getUrl();
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url);
}
