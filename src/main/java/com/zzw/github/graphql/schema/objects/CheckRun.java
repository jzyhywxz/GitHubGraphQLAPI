package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A check run.")
public class CheckRun extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node, com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable {
    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("elements from the list.")),
    })
    @Description("The check run's annotations")
    private com.zzw.github.graphql.schema.objects.CheckAnnotationConnection annotations;
    public com.zzw.github.graphql.schema.objects.CheckAnnotationConnection getAnnotations() { return this.annotations; }
    public void setAnnotations(com.zzw.github.graphql.schema.objects.CheckAnnotationConnection annotations) { this.annotations = annotations; }

    @NonNull("!")
    @Description("The check suite that this run is a part of.")
    private com.zzw.github.graphql.schema.objects.CheckSuite checkSuite;
    public com.zzw.github.graphql.schema.objects.CheckSuite getCheckSuite() { return this.checkSuite; }
    public void setCheckSuite(com.zzw.github.graphql.schema.objects.CheckSuite checkSuite) { this.checkSuite = checkSuite; }

    @Description("Identifies the date and time when the check run was completed.")
    private com.zzw.github.graphql.schema.scalars.DateTime completedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getCompletedAt() { return this.completedAt; }
    public void setCompletedAt(com.zzw.github.graphql.schema.scalars.DateTime completedAt) { this.completedAt = completedAt; }

    @Description("The conclusion of the check run.")
    private com.zzw.github.graphql.schema.enums.CheckConclusionState conclusion;
    public com.zzw.github.graphql.schema.enums.CheckConclusionState getConclusion() { return this.conclusion; }
    public void setConclusion(com.zzw.github.graphql.schema.enums.CheckConclusionState conclusion) { this.conclusion = conclusion; }

    @Description("Identifies the primary key from the database.")
    private com.zzw.github.graphql.schema.scalars.Int databaseId;
    public com.zzw.github.graphql.schema.scalars.Int getDatabaseId() { return this.databaseId; }
    public void setDatabaseId(com.zzw.github.graphql.schema.scalars.Int databaseId) { this.databaseId = databaseId; }

    @Description("The URL from which to find full details of the check run on the integrator's site.")
    private com.zzw.github.graphql.schema.scalars.URI detailsUrl;
    public com.zzw.github.graphql.schema.scalars.URI getDetailsUrl() { return this.detailsUrl; }
    public void setDetailsUrl(com.zzw.github.graphql.schema.scalars.URI detailsUrl) { this.detailsUrl = detailsUrl; }

    @Description("A reference for the check run on the integrator's system.")
    private com.zzw.github.graphql.schema.scalars.String externalId;
    public com.zzw.github.graphql.schema.scalars.String getExternalId() { return this.externalId; }
    public void setExternalId(com.zzw.github.graphql.schema.scalars.String externalId) { this.externalId = externalId; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The name of the check for this check run.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The permalink to the check run summary.")
    private com.zzw.github.graphql.schema.scalars.URI permalink;
    public com.zzw.github.graphql.schema.scalars.URI getPermalink() { return this.permalink; }
    public void setPermalink(com.zzw.github.graphql.schema.scalars.URI permalink) { this.permalink = permalink; }

    @NonNull("!")
    @Description("The repository associated with this check run.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @NonNull("!")
    @Description("The HTTP path for this check run.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @Description("Identifies the date and time when the check run was started.")
    private com.zzw.github.graphql.schema.scalars.DateTime startedAt;
    public com.zzw.github.graphql.schema.scalars.DateTime getStartedAt() { return this.startedAt; }
    public void setStartedAt(com.zzw.github.graphql.schema.scalars.DateTime startedAt) { this.startedAt = startedAt; }

    @NonNull("!")
    @Description("The current status of the check run.")
    private com.zzw.github.graphql.schema.enums.CheckStatusState status;
    public com.zzw.github.graphql.schema.enums.CheckStatusState getStatus() { return this.status; }
    public void setStatus(com.zzw.github.graphql.schema.enums.CheckStatusState status) { this.status = status; }

    @Description("A string representing the check run's summary")
    private com.zzw.github.graphql.schema.scalars.String summary;
    public com.zzw.github.graphql.schema.scalars.String getSummary() { return this.summary; }
    public void setSummary(com.zzw.github.graphql.schema.scalars.String summary) { this.summary = summary; }

    @Description("A string representing the check run's text")
    private com.zzw.github.graphql.schema.scalars.String text;
    public com.zzw.github.graphql.schema.scalars.String getText() { return this.text; }
    public void setText(com.zzw.github.graphql.schema.scalars.String text) { this.text = text; }

    @Description("A string representing the check run")
    private com.zzw.github.graphql.schema.scalars.String title;
    public com.zzw.github.graphql.schema.scalars.String getTitle() { return this.title; }
    public void setTitle(com.zzw.github.graphql.schema.scalars.String title) { this.title = title; }

    @NonNull("!")
    @Description("The HTTP URL for this check run.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }
}
