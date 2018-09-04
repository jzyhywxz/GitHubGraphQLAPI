package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents the individual results of a search.")
public enum SearchType {
    @Description("Returns results matching issues in repositories.")
     ISSUE,
    @Description("Returns results matching repositories.")
     REPOSITORY,
    @Description("Returns results matching users and organizations on GitHub.")
     USER,
}
