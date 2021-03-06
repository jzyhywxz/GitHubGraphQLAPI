package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of UnmarkIssueAsDuplicate")
public class UnmarkIssueAsDuplicateInput {
    @NonNull("!")
    @Description("ID of the issue or pull request currently considered canonical/authoritative/original.")
    private com.zzw.github.graphql.schema.scalars.ID canonicalId;
    public com.zzw.github.graphql.schema.scalars.ID getCanonicalId() { return this.canonicalId; }
    public void setCanonicalId(com.zzw.github.graphql.schema.scalars.ID canonicalId) { this.canonicalId = canonicalId; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("ID of the issue or pull request currently marked as a duplicate.")
    private com.zzw.github.graphql.schema.scalars.ID duplicateId;
    public com.zzw.github.graphql.schema.scalars.ID getDuplicateId() { return this.duplicateId; }
    public void setDuplicateId(com.zzw.github.graphql.schema.scalars.ID duplicateId) { this.duplicateId = duplicateId; }
}
