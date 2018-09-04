package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A generic hovercard context with a message and icon")
public class GenericHovercardContext extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.HovercardContext {
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
}
