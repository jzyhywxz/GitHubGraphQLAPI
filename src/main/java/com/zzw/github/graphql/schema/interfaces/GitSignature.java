package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.GpgSignature",
        "com.zzw.github.graphql.schema.objects.SmimeSignature",
        "com.zzw.github.graphql.schema.objects.UnknownSignature",
})
@Description("Information about a signature (GPG or S/MIME) on a Commit or Tag.")
public interface GitSignature {
    public com.zzw.github.graphql.schema.scalars.String getEmail();
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email);

    public com.zzw.github.graphql.schema.scalars.Boolean getIsValid();
    public void setIsValid(com.zzw.github.graphql.schema.scalars.Boolean isValid);

    public com.zzw.github.graphql.schema.scalars.String getPayload();
    public void setPayload(com.zzw.github.graphql.schema.scalars.String payload);

    public com.zzw.github.graphql.schema.scalars.String getSignature();
    public void setSignature(com.zzw.github.graphql.schema.scalars.String signature);

    public com.zzw.github.graphql.schema.objects.User getSigner();
    public void setSigner(com.zzw.github.graphql.schema.objects.User signer);

    public com.zzw.github.graphql.schema.enums.GitSignatureState getState();
    public void setState(com.zzw.github.graphql.schema.enums.GitSignatureState state);

    public com.zzw.github.graphql.schema.scalars.Boolean getWasSignedByGitHub();
    public void setWasSignedByGitHub(com.zzw.github.graphql.schema.scalars.Boolean wasSignedByGitHub);
}
