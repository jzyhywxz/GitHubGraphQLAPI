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
    public com.zzw.github.graphql.schema.scalars.DateTime getCreatedAt();
    public void setCreatedAt(com.zzw.github.graphql.schema.scalars.DateTime createdAt);

    public com.zzw.github.graphql.schema.scalars.String getDescription();
    public void setDescription(com.zzw.github.graphql.schema.scalars.String description);

    public com.zzw.github.graphql.schema.scalars.HTML getDescriptionHTML();
    public void setDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML descriptionHTML);

    public com.zzw.github.graphql.schema.scalars.Int getForkCount();
    public void setForkCount(com.zzw.github.graphql.schema.scalars.Int forkCount);

    public com.zzw.github.graphql.schema.scalars.Boolean getHasIssuesEnabled();
    public void setHasIssuesEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasIssuesEnabled);

    public com.zzw.github.graphql.schema.scalars.Boolean getHasWikiEnabled();
    public void setHasWikiEnabled(com.zzw.github.graphql.schema.scalars.Boolean hasWikiEnabled);

    public com.zzw.github.graphql.schema.scalars.URI getHomepageUrl();
    public void setHomepageUrl(com.zzw.github.graphql.schema.scalars.URI homepageUrl);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsArchived();
    public void setIsArchived(com.zzw.github.graphql.schema.scalars.Boolean isArchived);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsFork();
    public void setIsFork(com.zzw.github.graphql.schema.scalars.Boolean isFork);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsLocked();
    public void setIsLocked(com.zzw.github.graphql.schema.scalars.Boolean isLocked);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsMirror();
    public void setIsMirror(com.zzw.github.graphql.schema.scalars.Boolean isMirror);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsPrivate();
    public void setIsPrivate(com.zzw.github.graphql.schema.scalars.Boolean isPrivate);

    public com.zzw.github.graphql.schema.objects.License getLicenseInfo();
    public void setLicenseInfo(com.zzw.github.graphql.schema.objects.License licenseInfo);

    public com.zzw.github.graphql.schema.enums.RepositoryLockReason getLockReason();
    public void setLockReason(com.zzw.github.graphql.schema.enums.RepositoryLockReason lockReason);

    public com.zzw.github.graphql.schema.scalars.URI getMirrorUrl();
    public void setMirrorUrl(com.zzw.github.graphql.schema.scalars.URI mirrorUrl);

    public com.zzw.github.graphql.schema.scalars.String getName();
    public void setName(com.zzw.github.graphql.schema.scalars.String name);

    public com.zzw.github.graphql.schema.scalars.String getNameWithOwner();
    public void setNameWithOwner(com.zzw.github.graphql.schema.scalars.String nameWithOwner);

    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getOwner();
    public void setOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner owner);

    public com.zzw.github.graphql.schema.scalars.DateTime getPushedAt();
    public void setPushedAt(com.zzw.github.graphql.schema.scalars.DateTime pushedAt);

    public com.zzw.github.graphql.schema.scalars.URI getResourcePath();
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath);

    @Arguments({
        @Argument(name="limit", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("How many characters to return.")),
    })
    public com.zzw.github.graphql.schema.scalars.HTML getShortDescriptionHTML();
    public void setShortDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML shortDescriptionHTML);

    public com.zzw.github.graphql.schema.scalars.DateTime getUpdatedAt();
    public void setUpdatedAt(com.zzw.github.graphql.schema.scalars.DateTime updatedAt);

    public com.zzw.github.graphql.schema.scalars.URI getUrl();
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url);
}
