package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Information about pagination in a connection.")
public class PageInfo extends com.zzw.github.graphql.schema.Metadata {
    @Description("When paginating forwards, the cursor to continue.")
    private com.zzw.github.graphql.schema.scalars.String endCursor;
    public com.zzw.github.graphql.schema.scalars.String getEndCursor() { return this.endCursor; }
    public void setEndCursor(com.zzw.github.graphql.schema.scalars.String endCursor) { this.endCursor = endCursor; }

    @NonNull("!")
    @Description("When paginating forwards, are there more items?")
    private com.zzw.github.graphql.schema.scalars.Boolean hasNextPage;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasNextPage() { return this.hasNextPage; }
    public void setHasNextPage(com.zzw.github.graphql.schema.scalars.Boolean hasNextPage) { this.hasNextPage = hasNextPage; }

    @NonNull("!")
    @Description("When paginating backwards, are there more items?")
    private com.zzw.github.graphql.schema.scalars.Boolean hasPreviousPage;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasPreviousPage() { return this.hasPreviousPage; }
    public void setHasPreviousPage(com.zzw.github.graphql.schema.scalars.Boolean hasPreviousPage) { this.hasPreviousPage = hasPreviousPage; }

    @Description("When paginating backwards, the cursor to continue.")
    private com.zzw.github.graphql.schema.scalars.String startCursor;
    public com.zzw.github.graphql.schema.scalars.String getStartCursor() { return this.startCursor; }
    public void setStartCursor(com.zzw.github.graphql.schema.scalars.String startCursor) { this.startCursor = startCursor; }
}
