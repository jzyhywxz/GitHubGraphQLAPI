package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Represents information about the GitHub instance.")
public class GitHubMetadata extends com.zzw.github.graphql.schema.Metadata {
    @NonNull("!")
    @Description("Returns a String that's a SHA of github-services")
    private com.zzw.github.graphql.schema.scalars.GitObjectID gitHubServicesSha;
    public com.zzw.github.graphql.schema.scalars.GitObjectID getGitHubServicesSha() { return this.gitHubServicesSha; }
    public void setGitHubServicesSha(com.zzw.github.graphql.schema.scalars.GitObjectID gitHubServicesSha) { this.gitHubServicesSha = gitHubServicesSha; }

    @NonNull("[!]")
    @Description("IP addresses that users connect to for git operations")
    private com.zzw.github.graphql.schema.scalars.String[] gitIpAddresses;
    public com.zzw.github.graphql.schema.scalars.String[] getGitIpAddresses() { return this.gitIpAddresses; }
    public void setGitIpAddresses(com.zzw.github.graphql.schema.scalars.String[] gitIpAddresses) { this.gitIpAddresses = gitIpAddresses; }

    @NonNull("[!]")
    @Description("IP addresses that service hooks are sent from")
    private com.zzw.github.graphql.schema.scalars.String[] hookIpAddresses;
    public com.zzw.github.graphql.schema.scalars.String[] getHookIpAddresses() { return this.hookIpAddresses; }
    public void setHookIpAddresses(com.zzw.github.graphql.schema.scalars.String[] hookIpAddresses) { this.hookIpAddresses = hookIpAddresses; }

    @NonNull("[!]")
    @Description("IP addresses that the importer connects from")
    private com.zzw.github.graphql.schema.scalars.String[] importerIpAddresses;
    public com.zzw.github.graphql.schema.scalars.String[] getImporterIpAddresses() { return this.importerIpAddresses; }
    public void setImporterIpAddresses(com.zzw.github.graphql.schema.scalars.String[] importerIpAddresses) { this.importerIpAddresses = importerIpAddresses; }

    @NonNull("!")
    @Description("Whether or not users are verified")
    private com.zzw.github.graphql.schema.scalars.Boolean isPasswordAuthenticationVerifiable;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPasswordAuthenticationVerifiable() { return this.isPasswordAuthenticationVerifiable; }
    public void setIsPasswordAuthenticationVerifiable(com.zzw.github.graphql.schema.scalars.Boolean isPasswordAuthenticationVerifiable) { this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable; }

    @NonNull("[!]")
    @Description("IP addresses for GitHub Pages' A records")
    private com.zzw.github.graphql.schema.scalars.String[] pagesIpAddresses;
    public com.zzw.github.graphql.schema.scalars.String[] getPagesIpAddresses() { return this.pagesIpAddresses; }
    public void setPagesIpAddresses(com.zzw.github.graphql.schema.scalars.String[] pagesIpAddresses) { this.pagesIpAddresses = pagesIpAddresses; }
}
