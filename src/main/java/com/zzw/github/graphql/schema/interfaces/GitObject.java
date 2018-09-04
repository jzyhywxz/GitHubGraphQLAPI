package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Blob",
        "com.zzw.github.graphql.schema.objects.Commit",
        "com.zzw.github.graphql.schema.objects.Tag",
        "com.zzw.github.graphql.schema.objects.Tree",
})
@Description("Represents a Git object.")
public interface GitObject {
    @NonNull("!")
    @Description("An abbreviated version of the Git object ID")
    public com.zzw.github.graphql.schema.scalars.String getAbbreviatedOid();
    public void setAbbreviatedOid(com.zzw.github.graphql.schema.scalars.String abbreviatedOid);

    @NonNull("!")
    @Description("The HTTP path for this Git object")
    public com.zzw.github.graphql.schema.scalars.URI getCommitResourcePath();
    public void setCommitResourcePath(com.zzw.github.graphql.schema.scalars.URI commitResourcePath);

    @NonNull("!")
    @Description("The HTTP URL for this Git object")
    public com.zzw.github.graphql.schema.scalars.URI getCommitUrl();
    public void setCommitUrl(com.zzw.github.graphql.schema.scalars.URI commitUrl);

    @NonNull("!")
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    @NonNull("!")
    @Description("The Git object ID")
    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid();
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid);

    @NonNull("!")
    @Description("The Repository the Git object belongs to")
    public com.zzw.github.graphql.schema.objects.Repository getRepository();
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository);
}
