package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible team privacy values.")
public enum TeamPrivacy {
    @Description("A secret team can only be seen by its members.")
     SECRET,
    @Description("A visible team can be seen and @mentioned by every member of the organization.")
     VISIBLE,
}
