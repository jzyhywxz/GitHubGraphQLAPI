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
    @NonNull("!")
    @Description("Email used to sign this object.")
    public com.zzw.github.graphql.schema.scalars.String getEmail();
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email);

    @NonNull("!")
    @Description("True if the signature is valid and verified by GitHub.")
    public com.zzw.github.graphql.schema.scalars.Boolean getIsValid();
    public void setIsValid(com.zzw.github.graphql.schema.scalars.Boolean isValid);

    @NonNull("!")
    @Description("Payload for GPG signing object. Raw ODB object without the signature header.")
    public com.zzw.github.graphql.schema.scalars.String getPayload();
    public void setPayload(com.zzw.github.graphql.schema.scalars.String payload);

    @NonNull("!")
    @Description("ASCII-armored signature header from object.")
    public com.zzw.github.graphql.schema.scalars.String getSignature();
    public void setSignature(com.zzw.github.graphql.schema.scalars.String signature);

    @Description("GitHub user corresponding to the email signing this commit.")
    public com.zzw.github.graphql.schema.objects.User getSigner();
    public void setSigner(com.zzw.github.graphql.schema.objects.User signer);

    @NonNull("!")
    @Description("The state of this signature. ")
    public com.zzw.github.graphql.schema.enums.GitSignatureState getState();
    public void setState(com.zzw.github.graphql.schema.enums.GitSignatureState state);

    @NonNull("!")
    @Description("True if the signature was made with GitHub's signing key.")
    public com.zzw.github.graphql.schema.scalars.Boolean getWasSignedByGitHub();
    public void setWasSignedByGitHub(com.zzw.github.graphql.schema.scalars.Boolean wasSignedByGitHub);
}
