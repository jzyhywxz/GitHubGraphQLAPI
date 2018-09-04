package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Repository",
})
@Description("A subset of repository info.")
public interface RepositoryInfo {
    @NonNull("!")
    @Description("Identifies the date and time when the object was created.")
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt();
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt);

    @Description("The description of the repository.")
    public com.zzw.github.graphql.schema.scalars.String getDescription();
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description);

    @NonNull("!")
    @Description("The description of the repository rendered to HTML.")
    public com.zzw.github.graphql.schema.scalars.HTML getDescriptionHTML();
    public void setDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML descriptionHTML);

    @NonNull("!")
    @Description("Returns how many forks there are of this repository in the whole network.")
    public com.zzw.github.graphql.schema.scalars.Int getForkCount();
    public void setForkCount(com.zzw.github.graphql.schema.scalars.Int forkCount);

    @NonNull("!")
    @Description("Indicates if the repository has issues feature enabled.")
    public com.zzw.github.graphql.schema.scalars.Boolean getHasIssuesEnabled();
    public void setHasIssuesEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasIssuesEnabled);

    @NonNull("!")
    @Description("Indicates if the repository has wiki feature enabled.")
    public com.zzw.github.graphql.schema.scalars.Boolean getHasWikiEnabled();
    public void setHasWikiEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasWikiEnabled);

    @Description("The repository's URL.")
    public com.zzw.github.graphql.schema.scalars.URI getHomepageUrl();
    public void setHomepageUrl(com.zzw.github.graphql.schema.scalars.URI homepageUrl);

    @NonNull("!")
    @Description("Indicates if the repository is unmaintained.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsArchived();
    public void setIsArchived(com.zzw.github.graphql.schema.scalars.Boolean isArchived);

    @NonNull("!")
    @Description("Identifies if the repository is a fork.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsFork();
    public void setIsFork(com.zzw.github.graphql.schema.scalars.Boolean isFork);

    @NonNull("!")
    @Description("Indicates if the repository has been locked or not.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsLocked();
    public void setIsLocked(com.zzw.github.graphql.schema.scalars.Boolean isLocked);

    @NonNull("!")
    @Description("Identifies if the repository is a mirror.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsMirror();
    public void setIsMirror(com.zzw.github.graphql.schema.scalars.Boolean isMirror);

    @NonNull("!")
    @Description("Identifies if the repository is private.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPrivate();
    public void setIsPrivate(com.zzw.github.graphql.schema.scalars.Boolean isPrivate);

    @Description("The license associated with the repository")
    public com.zzw.github.graphql.schema.objects.License getLicenseInfo();
    public void setLicenseInfo(com.zzw.github.graphql.schema.objects.License licenseInfo);

    @Description("The reason the repository has been locked.")
    public com.zzw.github.graphql.schema.enums.RepositoryLockReason getLockReason();
    public void setLockReason(com.zzw.github.graphql.schema.enums.RepositoryLockReason lockReason);

    @Description("The repository's original mirror URL.")
    public com.zzw.github.graphql.schema.scalars.URI getMirrorUrl();
    public void setMirrorUrl(com.zzw.github.graphql.schema.scalars.URI mirrorUrl);

    @NonNull("!")
    @Description("The name of the repository.")
    public com.zzw.github.graphql.schema.scalars.String getName();
    public void setName(com.zzw.github.graphql.schema.scalars.String name);

    @NonNull("!")
    @Description("The repository's name with owner.")
    public com.zzw.github.graphql.schema.scalars.String getNameWithOwner();
    public void setNameWithOwner(com.zzw.github.graphql.schema.scalars.String nameWithOwner);

    @NonNull("!")
    @Description("The User owner of the repository.")
    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getOwner();
    public void setOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner);

    @Description("Identifies when the repository was last pushed to.")
    public com.zzw.github.graphql.schema.scalars.DateTime getPushedAt();
    public void setPushedAt(com.zzw.github.graphql.schema.scalars.DateTime pushedAt);

    @NonNull("!")
    @Description("The HTTP path for this repository")
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath();
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath);

    @Arguments({
        @Argument(name="limit", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("How many characters to return.")),
    })
    @NonNull("!")
    @Description("A description of the repository, rendered to HTML without any links in it.")
    public com.zzw.github.graphql.schema.scalars.HTML getShortDescriptionHTML();
    public void setShortDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML shortDescriptionHTML);

    @NonNull("!")
    @Description("Identifies the date and time when the object was last updated.")
    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt();
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt);

    @NonNull("!")
    @Description("The HTTP URL for this repository")
    public com.zzw.github.graphql.schema.scalars.URI getUrl();
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url);
}
