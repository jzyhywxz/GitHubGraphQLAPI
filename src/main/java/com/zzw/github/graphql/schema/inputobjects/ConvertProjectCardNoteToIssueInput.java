package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of ConvertProjectCardNoteToIssue")
public class ConvertProjectCardNoteToIssueInput {
    @Description("The body of the newly created issue.")
    private com.zzw.github.graphql.schema.scalars.String body;
    public com.zzw.github.graphql.schema.scalars.String getBody() { return this.body; }
    public void setBody(com.zzw.github.graphql.schema.scalars.String body) { this.body = body; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The ProjectCard ID to convert.")
    private com.zzw.github.graphql.schema.scalars.ID projectCardId;
    public com.zzw.github.graphql.schema.scalars.ID getProjectCardId() { return this.projectCardId; }
    public void setProjectCardId(com.zzw.github.graphql.schema.scalars.ID projectCardId) { this.projectCardId = projectCardId; }

    @NonNull("!")
    @Description("The ID of the repository to create the issue in.")
    private com.zzw.github.graphql.schema.scalars.ID repositoryId;
    public com.zzw.github.graphql.schema.scalars.ID getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(com.zzw.github.graphql.schema.scalars.ID repositoryId) { this.repositoryId = repositoryId; }

    @Description("The title of the newly created issue. Defaults to the card's note text.")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }
}
