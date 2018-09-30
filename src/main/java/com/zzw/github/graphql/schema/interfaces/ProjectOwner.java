package com.zzw.github.graphql.schema.interfaces;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@ImplementedBy({
        "com.zzw.github.graphql.schema.objects.Organization",
        "com.zzw.github.graphql.schema.objects.Repository",
})
@Description("Represents an owner of a Project.")
public interface ProjectOwner {
    public com.zzw.github.graphql.schema.scalars.ID getId();
    public void setId(com.zzw.github.graphql.schema.scalars.ID id);

    @Arguments({
        @Argument(name="number", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull("!"), description=@Description("The project number to find.")),
    })
    public com.zzw.github.graphql.schema.objects.Project getProject();
    public void setProject(com.zzw.github.graphql.schema.objects.Project project);

    public com.zzw.github.graphql.schema.scalars.URI getProjectsResourcePath();
    public void setProjectsResourcePath(com.zzw.github.graphql.schema.scalars.URI projectsResourcePath);

    public com.zzw.github.graphql.schema.scalars.URI getProjectsUrl();
    public void setProjectsUrl(com.zzw.github.graphql.schema.scalars.URI projectsUrl);

    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanCreateProjects();
    public void setViewerCanCreateProjects(com.zzw.github.graphql.schema.scalars.Boolean viewerCanCreateProjects);
}
