package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The state of a Git signature.")
public enum GitSignatureState {
    @Description("Invalid email used for signing.")
     BAD_EMAIL,
    @Description("Signing key expired.")
     EXPIRED_KEY,
    @Description("Internal error - the GPG verification service misbehaved.")
     GPGVERIFY_ERROR,
    @Description("Internal error - the GPG verification service is unavailable at the moment.")
     GPGVERIFY_UNAVAILABLE,
    @Description("Invalid signature.")
     INVALID,
    @Description("Malformed signature.")
     MALFORMED_SIG,
    @Description("The usage flags for the key that signed this don't allow signing.")
     NOT_SIGNING_KEY,
    @Description("Email used for signing not known to GitHub.")
     NO_USER,
    @Description("Valid siganture, though certificate revocation check failed")
     OCSP_ERROR,
    @Description("Valid signature, pending certificate revocation checking")
     OCSP_PENDING,
    @Description("One or more certificates in chain has been revoked")
     OCSP_REVOKED,
    @Description("Key used for signing not known to GitHub.")
     UNKNOWN_KEY,
    @Description("Unknown signature type.")
     UNKNOWN_SIG_TYPE,
    @Description("Unsigned.")
     UNSIGNED,
    @Description("Email used for signing unverified on GitHub.")
     UNVERIFIED_EMAIL,
    @Description("Valid signature and verified by GitHub.")
     VALID,
}
