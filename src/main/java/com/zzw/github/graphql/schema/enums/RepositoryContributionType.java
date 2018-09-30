package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The reason a repository is listed as 'contributed'.")
public enum RepositoryContributionType {
    @Description("Created a commit")
    COMMIT,
    @Description("Created an issue")
    ISSUE,
    @Description("Created a pull request")
    PULL_REQUEST,
    @Description("Reviewed a pull request")
    PULL_REQUEST_REVIEW,
    @Description("Created the repository")
    REPOSITORY,
}
