package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which gist connections can be ordered.")
public enum GistOrderField {
    @Description("Order gists by creation time")
     CREATED_AT,
    @Description("Order gists by push time")
     PUSHED_AT,
    @Description("Order gists by update time")
     UPDATED_AT,
}
