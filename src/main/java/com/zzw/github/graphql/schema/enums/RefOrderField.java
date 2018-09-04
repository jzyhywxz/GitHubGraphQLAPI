package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which ref connections can be ordered.")
public enum RefOrderField {
    @Description("Order refs by their alphanumeric name")
     ALPHABETICAL,
    @Description("Order refs by underlying commit date if the ref prefix is refs/tags/")
     TAG_COMMIT_DATE,
}
