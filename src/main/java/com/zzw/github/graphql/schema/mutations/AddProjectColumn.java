package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Adds a column to a Project.")
public class AddProjectColumn {
    @NonNull("!")
    private com.zzw.github.graphql.schema.inputobjects.AddProjectColumnInput input;
    public com.zzw.github.graphql.schema.inputobjects.AddProjectColumnInput getInput() { return this.input; }
    public void setInput(com.zzw.github.graphql.schema.inputobjects.AddProjectColumnInput input) { this.input = input; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The edge from the project's column connection.")
    private com.zzw.github.graphql.schema.objects.ProjectColumnEdge columnEdge;
    public com.zzw.github.graphql.schema.objects.ProjectColumnEdge getColumnEdge() { return this.columnEdge; }
    public void setColumnEdge(com.zzw.github.graphql.schema.objects.ProjectColumnEdge columnEdge) { this.columnEdge = columnEdge; }

    @NonNull("!")
    @Description("The project")
    private com.zzw.github.graphql.schema.objects.Project project;
    public com.zzw.github.graphql.schema.objects.Project getProject() { return this.project; }
    public void setProject(com.zzw.github.graphql.schema.objects.Project project) { this.project = project; }
}
