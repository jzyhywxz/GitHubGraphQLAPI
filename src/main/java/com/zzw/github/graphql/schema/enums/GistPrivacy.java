package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The privacy of a Gist")
public enum GistPrivacy {
    @Description("Gists that are public and secret")
    ALL,
    @Description("Public")
    PUBLIC,
    @Description("Secret")
    SECRET,
}
