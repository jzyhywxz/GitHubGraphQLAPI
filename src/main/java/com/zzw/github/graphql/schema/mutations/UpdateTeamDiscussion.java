package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Updates a team discussion.")
public class UpdateTeamDiscussion {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.UpdateTeamDiscussionInput input;
    public com.zzw.github.graphql.schema.inputobjects.UpdateTeamDiscussionInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.UpdateTeamDiscussionInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The updated discussion.")
    private com.zzw.github.graphql.schema.objects.TeamDiscussion teamDiscussion;
    public com.zzw.github.graphql.schema.objects.TeamDiscussion getTeamDiscussion() { return this.teamDiscussion; }
    public void setTeamDiscussion(com.zzw.github.graphql.schema.objects.TeamDiscussion teamDiscussion) { this.teamDiscussion = teamDiscussion; }
}
