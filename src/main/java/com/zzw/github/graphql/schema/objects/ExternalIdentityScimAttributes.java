package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("SCIM attributes for the External Identity")
public class ExternalIdentityScimAttributes extends com.zzw.github.graphql.schema.Metadata {
    @Description("The userName of the SCIM identity")
    private com.zzw.github.graphql.schema.scalars.String username;
    public com.zzw.github.graphql.schema.scalars.String getUsername() { return this.username; }
    public void setUsername(com.zzw.github.graphql.schema.scalars.String username) { this.username = username; }
}
