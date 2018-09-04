package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("SAML attributes for the External Identity")
public class ExternalIdentitySamlAttributes extends com.zzw.github.graphql.schema.Metadata {
    @Description("The NameID of the SAML identity")
    private com.zzw.github.graphql.schema.scalars.String nameId;
    public com.zzw.github.graphql.schema.scalars.String getNameId() { return this.nameId; }
    public void setNameId(com.zzw.github.graphql.schema.scalars.String nameId) { this.nameId = nameId; }
}
