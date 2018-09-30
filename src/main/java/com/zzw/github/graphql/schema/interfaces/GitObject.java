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
    public com.zzw.github.graphql.schema.scalars.String getAbbreviatedOid();
    public void setAbbreviatedOid(com.zzw.github.graphql.schema.scalars.String abbreviatedOid);

    public com.zzw.github.graphql.schema.scalars.URI getCommitResourcePath();
    public void setCommitResourcePath(com.zzw.github.graphql.schema.scalars.URI commitResourcePath);

    public com.zzw.github.graphql.schema.scalars.URI getCommitUrl();
    public void setCommitUrl(com.zzw.github.graphql.schema.scalars.URI commitUrl);

    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    public com.zzw.github.graphql.schema.scalars.GitObjectID getOid();
    public void setOid(com.zzw.github.graphql.schema.scalars.GitObjectID oid);

    public com.zzw.github.graphql.schema.objects.Repository getRepository();
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository);
}
