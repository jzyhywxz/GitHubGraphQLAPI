package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Autogenerated input type of UpdateCheckSuitePreferences")
public class UpdateCheckSuitePreferencesInput {
    @NonNull("[!]!")
    @Description("The check suite preferences to modify.")
    private com.zzw.github.graphql.schema.inputobjects.CheckSuiteAutoTriggerPreference[] autoTriggerPreferences;
    public com.zzw.github.graphql.schema.inputobjects.CheckSuiteAutoTriggerPreference[] getAutoTriggerPreferences() { return this.autoTriggerPreferences; }
    public void setAutoTriggerPreferences(com.zzw.github.graphql.schema.inputobjects.CheckSuiteAutoTriggerPreference[] autoTriggerPreferences) { this.autoTriggerPreferences = autoTriggerPreferences; }

    @Description("A unique identifier for the client performing the mutation.")
    private com.zzw.github.graphql.schema.scalars.String clientMutationId;
    public com.zzw.github.graphql.schema.scalars.String getClientMutationId() { return this.clientMutationId; }
    public void setClientMutationId(com.zzw.github.graphql.schema.scalars.String clientMutationId) { this.clientMutationId = clientMutationId; }

    @NonNull("!")
    @Description("The Node ID of the repository.")
    private com.zzw.github.graphql.schema.scalars.ID repositoryId;
    public com.zzw.github.graphql.schema.scalars.ID getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(com.zzw.github.graphql.schema.scalars.ID repositoryId) { this.repositoryId = repositoryId; }
}
