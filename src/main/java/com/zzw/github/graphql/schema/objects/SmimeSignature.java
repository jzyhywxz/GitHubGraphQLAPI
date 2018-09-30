package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents an S/MIME signature on a Commit or Tag.")
public class SmimeSignature extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.GitSignature {
    @NonNull("!")
    @Description("Email used to sign this object.")
    private com.zzw.github.graphql.schema.scalars.String email;
    public com.zzw.github.graphql.schema.scalars.String getEmail() { return this.email; }
    public void setEmail(com.zzw.github.graphql.schema.scalars.String email) { this.email = email; }

    @NonNull("!")
    @Description("True if the signature is valid and verified by GitHub.")
    private com.zzw.github.graphql.schema.scalars.Boolean isValid;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsValid() { return this.isValid; }
    public void setIsValid(com.zzw.github.graphql.schema.scalars.Boolean isValid) { this.isValid = isValid; }

    @NonNull("!")
    @Description("Payload for GPG signing object. Raw ODB object without the signature header.")
    private com.zzw.github.graphql.schema.scalars.String payload;
    public com.zzw.github.graphql.schema.scalars.String getPayload() { return this.payload; }
    public void setPayload(com.zzw.github.graphql.schema.scalars.String payload) { this.payload = payload; }

    @NonNull("!")
    @Description("ASCII-armored signature header from object.")
    private com.zzw.github.graphql.schema.scalars.String signature;
    public com.zzw.github.graphql.schema.scalars.String getSignature() { return this.signature; }
    public void setSignature(com.zzw.github.graphql.schema.scalars.String signature) { this.signature = signature; }

    @Description("GitHub user corresponding to the email signing this commit.")
    private com.zzw.github.graphql.schema.objects.User signer;
    public com.zzw.github.graphql.schema.objects.User getSigner() { return this.signer; }
    public void setSigner(com.zzw.github.graphql.schema.objects.User signer) { this.signer = signer; }

    @NonNull("!")
    @Description("The state of this signature. VALID if signature is valid and verified by GitHub, otherwise represents reason why signature is considered invalid.")
    private com.zzw.github.graphql.schema.enums.GitSignatureState state;
    public com.zzw.github.graphql.schema.enums.GitSignatureState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.GitSignatureState state) { this.state = state; }

    @NonNull("!")
    @Description("True if the signature was made with GitHub's signing key.")
    private com.zzw.github.graphql.schema.scalars.Boolean wasSignedByGitHub;
    public com.zzw.github.graphql.schema.scalars.Boolean getWasSignedByGitHub() { return this.wasSignedByGitHub; }
    public void setWasSignedByGitHub(com.zzw.github.graphql.schema.scalars.Boolean wasSignedByGitHub) { this.wasSignedByGitHub = wasSignedByGitHub; }
}
