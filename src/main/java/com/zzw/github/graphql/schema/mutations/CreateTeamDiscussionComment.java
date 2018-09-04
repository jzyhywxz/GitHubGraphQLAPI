package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Creates a new team discussion comment.")
public class CreateTeamDiscussionComment {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.CreateTeamDiscussionCommentInput input;
    public com.zzw.github.graphql.schema.inputobjects.CreateTeamDiscussionCommentInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.CreateTeamDiscussionCommentInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @Description("The new comment.")
    private com.zzw.github.graphql.schema.objects.TeamDiscussionComment teamDiscussionComment;
    public com.zzw.github.graphql.schema.objects.TeamDiscussionComment getTeamDiscussionComment() { return this.teamDiscussionComment; }
    public void setTeamDiscussionComment(com.zzw.github.graphql.schema.objects.TeamDiscussionComment teamDiscussionComment) { this.teamDiscussionComment = teamDiscussionComment; }
}
