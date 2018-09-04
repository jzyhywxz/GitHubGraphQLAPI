package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Reason that the suggested topic is declined.")
public enum TopicSuggestionDeclineReason {
    @Description("The suggested topic is not relevant to the repository.")
     NOT_RELEVANT,
    @Description("The viewer does not like the suggested topic.")
     PERSONAL_PREFERENCE,
    @Description("The suggested topic is too general for the repository.")
     TOO_GENERAL,
    @Description("The suggested topic is too specific for the repository (e.g. #ruby-on-rails-version-4-2-1).")
     TOO_SPECIFIC,
}
