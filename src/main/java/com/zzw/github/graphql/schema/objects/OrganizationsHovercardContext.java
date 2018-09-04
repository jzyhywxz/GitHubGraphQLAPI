package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("An organization list hovercard context")
public class OrganizationsHovercardContext extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.HovercardContext {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @NonNull("!")
    @Description("Organizations this user is a member of that are relevant")
    private com.zzw.github.graphql.schema.objects.OrganizationConnection relevantOrganizations;
    public com.zzw.github.graphql.schema.objects.OrganizationConnection getRelevantOrganizations() { return this.relevantOrganizations; }
    public void setRelevantOrganizations(com.zzw.github.graphql.schema.objects.OrganizationConnection relevantOrganizations) { this.relevantOrganizations = relevantOrganizations; }

    @NonNull("!")
    @Description("A string describing this context")
    private com.zzw.github.graphql.schema.scalars.String message;
    public com.zzw.github.graphql.schema.scalars.String getMessage() { return this.message; }
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message) { this.message = message; }

    @NonNull("!")
    @Description("An octicon to accompany this context")
    private com.zzw.github.graphql.schema.scalars.String octicon;
    public com.zzw.github.graphql.schema.scalars.String getOcticon() { return this.octicon; }
    public void setOcticon(com.zzw.github.graphql.schema.scalars.String octicon) { this.octicon = octicon; }

    @NonNull("!")
    @Description("The total number of organizations this user is in")
    private com.zzw.github.graphql.schema.scalars.Int totalOrganizationCount;
    public com.zzw.github.graphql.schema.scalars.Int getTotalOrganizationCount() { return this.totalOrganizationCount; }
    public void setTotalOrganizationCount(com.zzw.github.graphql.schema.scalars.Int totalOrganizationCount) { this.totalOrganizationCount = totalOrganizationCount; }
}
