package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Dependency manifest for a repository")
public class DependencyGraphManifest extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
    })
    @Description("A list of manifest dependencies")
    private com.zzw.github.graphql.schema.objects.DependencyGraphDependencyConnection dependencies;
    public com.zzw.github.graphql.schema.objects.DependencyGraphDependencyConnection getDependencies() { return this.dependencies; }
    public void setDependencies(com.zzw.github.graphql.schema.objects.DependencyGraphDependencyConnection dependencies) { this.dependencies = dependencies; }

    @NonNull("!")
    @Description("Path to view the manifest file blob")
    private com.zzw.github.graphql.schema.scalars.String blobPath;
    public com.zzw.github.graphql.schema.scalars.String getBlobPath() { return this.blobPath; }
    public void setBlobPath(com.zzw.github.graphql.schema.scalars.String blobPath) { this.blobPath = blobPath; }

    @Description("The number of dependencies listed in the manifest")
    private com.zzw.github.graphql.schema.scalars.Int dependenciesCount;
    public com.zzw.github.graphql.schema.scalars.Int getDependenciesCount() { return this.dependenciesCount; }
    public void setDependenciesCount(com.zzw.github.graphql.schema.scalars.Int dependenciesCount) { this.dependenciesCount = dependenciesCount; }

    @NonNull("!")
    @Description("Is the manifest too big to parse?")
    private com.zzw.github.graphql.schema.scalars.Boolean exceedsMaxSize;
    public com.zzw.github.graphql.schema.scalars.Boolean getExceedsMaxSize() { return this.exceedsMaxSize; }
    public void setExceedsMaxSize(com.zzw.github.graphql.schema.scalars.Boolean exceedsMaxSize) { this.exceedsMaxSize = exceedsMaxSize; }

    @NonNull("!")
    @Description("Fully qualified manifest filename")
    private com.zzw.github.graphql.schema.scalars.String filename;
    public com.zzw.github.graphql.schema.scalars.String getFilename() { return this.filename; }
    public void setFilename(com.zzw.github.graphql.schema.scalars.String filename) { this.filename = filename; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("Were we able to parse the manifest?")
    private com.zzw.github.graphql.schema.scalars.Boolean parseable;
    public com.zzw.github.graphql.schema.scalars.Boolean getParseable() { return this.parseable; }
    public void setParseable(com.zzw.github.graphql.schema.scalars.Boolean parseable) { this.parseable = parseable; }

    @NonNull("!")
    @Description("The repository containing the manifest")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }
}
