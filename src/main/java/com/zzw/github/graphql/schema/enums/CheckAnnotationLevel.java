package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents an annotation's information level.")
public enum CheckAnnotationLevel {
    @Description("An annotation indicating an inescapable error.")
    FAILURE,
    @Description("An annotation indicating some information.")
    NOTICE,
    @Description("An annotation indicating an ignorable error.")
    WARNING,
}
