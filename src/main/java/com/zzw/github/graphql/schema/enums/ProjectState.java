package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("State of the project; either 'open' or 'closed'")
public enum ProjectState {
    @Description("The project is closed.")
     CLOSED,
    @Description("The project is open.")
     OPEN,
}
