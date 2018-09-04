package com.zzw.github.graphql.schema.unions;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.Repository",
        "com.zzw.github.graphql.schema.objects.User",
})
@Description("Types that can be inside Collection Items.")
public interface CollectionItemContent {
}
