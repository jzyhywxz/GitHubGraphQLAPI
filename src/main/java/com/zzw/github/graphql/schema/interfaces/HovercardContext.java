package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.GenericHovercardContext",
        "com.zzw.github.graphql.schema.objects.OrganizationTeamsHovercardContext",
        "com.zzw.github.graphql.schema.objects.OrganizationsHovercardContext",
})
@Description("An individual line of a hovercard")
public interface HovercardContext {
    @NonNull("!")
    @Description("A string describing this context")
    public com.zzw.github.graphql.schema.scalars.String getMessage();
    public void setMessage(com.zzw.github.graphql.schema.scalars.String message);

    @NonNull("!")
    @Description("An octicon to accompany this context")
    public com.zzw.github.graphql.schema.scalars.String getOcticon();
    public void setOcticon(com.zzw.github.graphql.schema.scalars.String octicon);
}
