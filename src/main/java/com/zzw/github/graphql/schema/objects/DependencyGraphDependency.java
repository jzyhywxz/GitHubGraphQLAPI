package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A dependency manifest entry")
public class DependencyGraphDependency extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Does the dependency itself have dependencies?")
    private com.zzw.github.graphql.schema.scalars.Boolean hasDependencies;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasDependencies() { return this.hasDependencies; }
    public void setHasDependencies(com.zzw.github.graphql.schema.scalars.Boolean hasDependencies) { this.hasDependencies = hasDependencies; }

    @Description("The dependency package manager")
    private com.zzw.github.graphql.schema.scalars.String packageManager;
    public com.zzw.github.graphql.schema.scalars.String getPackageManager() { return this.packageManager; }
    public void setPackageManager(com.zzw.github.graphql.schema.scalars.String packageManager) { this.packageManager = packageManager; }

    @NonNull("!")
    @Description("The required package name")
    private com.zzw.github.graphql.schema.scalars.String packageName;
    public com.zzw.github.graphql.schema.scalars.String getPackageName() { return this.packageName; }
    public void setPackageName(com.zzw.github.graphql.schema.scalars.String packageName) { this.packageName = packageName; }

    @Description("The repository containing the package")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The dependency version requirements")
    private com.zzw.github.graphql.schema.scalars.String requirements;
    public com.zzw.github.graphql.schema.scalars.String getRequirements() { return this.requirements; }
    public void setRequirements(com.zzw.github.graphql.schema.scalars.String requirements) { this.requirements = requirements; }
}
