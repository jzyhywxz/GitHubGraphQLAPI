package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents a commit status.")
public class Status extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("The commit this status is attached to.")
    private com.zzw.github.graphql.schema.objects.Commit commit;
    public com.zzw.github.graphql.schema.objects.Commit getCommit() { return this.commit; }
    public void setCommit(com.zzw.github.graphql.schema.objects.Commit commit) { this.commit = commit; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The context name.")),
    })
    @Description("Looks up an individual status context by context name.")
    private com.zzw.github.graphql.schema.objects.StatusContext context;
    public com.zzw.github.graphql.schema.objects.StatusContext getContext() { return this.context; }
    public void setContext(com.zzw.github.graphql.schema.objects.StatusContext context) { this.context = context; }

    @NonNull("[!]!")
    @Description("The individual status contexts for this commit.")
    private com.zzw.github.graphql.schema.objects.StatusContext[] contexts;
    public com.zzw.github.graphql.schema.objects.StatusContext[] getContexts() { return this.contexts; }
    public void setContexts(com.zzw.github.graphql.schema.objects.StatusContext[] contexts) { this.contexts = contexts; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The combined commit status.")
    private com.zzw.github.graphql.schema.enums.StatusState state;
    public com.zzw.github.graphql.schema.enums.StatusState getState() { return this.state; }
    public void setState(com.zzw.github.graphql.schema.enums.StatusState state) { this.state = state; }
}
