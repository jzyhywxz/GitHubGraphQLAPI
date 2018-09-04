package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Various content states of a ProjectCard")
public enum ProjectCardState {
    @Description("The card has content only.")
     CONTENT_ONLY,
    @Description("The card has a note only.")
     NOTE_ONLY,
    @Description("The card is redacted.")
     REDACTED,
}
