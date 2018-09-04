package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Properties by which project connections can be ordered.")
public enum ProjectOrderField {
    @Description("Order projects by creation time")
     CREATED_AT,
    @Description("Order projects by name")
     NAME,
    @Description("Order projects by update time")
     UPDATED_AT,
}
