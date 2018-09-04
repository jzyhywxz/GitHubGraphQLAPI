package com.zzw.github.graphql.schema.unions;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Issue",
        "com.zzw.github.graphql.schema.objects.MarketplaceListing",
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.PullRequest",
        "com.zzw.github.graphql.schema.objects.Repository",
        "com.zzw.github.graphql.schema.objects.User",
})
@Description("The results of a search.")
public interface SearchResultItem {
}
