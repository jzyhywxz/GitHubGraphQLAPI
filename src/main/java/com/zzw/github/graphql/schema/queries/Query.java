package com.zzw.github.graphql.schema.queries;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Every GraphQL schema has a root type for both queries and mutations. The query type defines GraphQL operations that retrieve data from the server.")
public class Query {
    @Arguments({
        @Argument(name="adminId", type="com.zzw.github.graphql.schema.scalars.ID", nonNull=@NonNull(""), description=@Description("Select listings that can be administered by the specified user.")),
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="allStates", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Select listings visible to the viewer even if they are not approved. If omitted or false, only approved listings will be returned.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="categorySlug", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Select only listings with the given category.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="organizationId", type="com.zzw.github.graphql.schema.scalars.ID", nonNull=@NonNull(""), description=@Description("Select listings for products owned by the specified organization.")),
        @Argument(name="primaryCategoryOnly", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Select only listings where the primary category matches the given category slug.")),
        @Argument(name="slugs", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull(""), description=@Description("Select the listings with these slugs, if they are visible to the viewer.")),
        @Argument(name="useTopicAliases", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Also check topic aliases for the category slug")),
        @Argument(name="viewerCanAdmin", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Select listings to which user has admin access. If omitted, listings visible to the viewer are returned.")),
        @Argument(name="withFreeTrialsOnly", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Select only listings that offer a free trial.")),
    })
    @NonNull("!")
    @Description("Look up Marketplace listings")
    private com.zzw.github.graphql.schema.objects.MarketplaceListingConnection marketplaceListings;
    public com.zzw.github.graphql.schema.objects.MarketplaceListingConnection getMarketplaceListings() { return this.marketplaceListings; }
    public void setMarketplaceListings(com.zzw.github.graphql.schema.objects.MarketplaceListingConnection marketplaceListings) { this.marketplaceListings = marketplaceListings; }

    @Arguments({
        @Argument(name="after", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come after the specified cursor.")),
        @Argument(name="before", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull(""), description=@Description("Returns the elements in the list that come before the specified cursor.")),
        @Argument(name="first", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the first n elements from the list.")),
        @Argument(name="last", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("Returns the last n elements from the list.")),
        @Argument(name="query", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The search string to look for.")),
        @Argument(name="type", type="com.zzw.github.graphql.schema.enums.SearchType", nonNull=@NonNull("!"), description=@Description("The types of search items to search within.")),
    })
    @NonNull("!")
    @Description("Perform a search across resources.")
    private com.zzw.github.graphql.schema.objects.SearchResultItemConnection search;
    public com.zzw.github.graphql.schema.objects.SearchResultItemConnection getSearch() { return this.search; }
    public void setSearch(com.zzw.github.graphql.schema.objects.SearchResultItemConnection search) { this.search = search; }

    @Arguments({
        @Argument(name="key", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The code of conduct's key")),
    })
    @Description("Look up a code of conduct by its key")
    private com.zzw.github.graphql.schema.objects.CodeOfConduct codeOfConduct;
    public com.zzw.github.graphql.schema.objects.CodeOfConduct getCodeOfConduct() { return this.codeOfConduct; }
    public void setCodeOfConduct(com.zzw.github.graphql.schema.objects.CodeOfConduct codeOfConduct) { this.codeOfConduct = codeOfConduct; }

    @Description("Look up a code of conduct by its key")
    private com.zzw.github.graphql.schema.objects.CodeOfConduct[] codesOfConduct;
    public com.zzw.github.graphql.schema.objects.CodeOfConduct[] getCodesOfConduct() { return this.codesOfConduct; }
    public void setCodesOfConduct(com.zzw.github.graphql.schema.objects.CodeOfConduct[] codesOfConduct) { this.codesOfConduct = codesOfConduct; }

    @Arguments({
        @Argument(name="key", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The license's downcased SPDX ID")),
    })
    @Description("Look up an open source license by its key")
    private com.zzw.github.graphql.schema.objects.License license;
    public com.zzw.github.graphql.schema.objects.License getLicense() { return this.license; }
    public void setLicense(com.zzw.github.graphql.schema.objects.License license) { this.license = license; }

    @NonNull("!")
    @Description("Return a list of known open source licenses")
    private com.zzw.github.graphql.schema.objects.License[] licenses;
    public com.zzw.github.graphql.schema.objects.License[] getLicenses() { return this.licenses; }
    public void setLicenses(com.zzw.github.graphql.schema.objects.License[] licenses) { this.licenses = licenses; }

    @Arguments({
        @Argument(name="excludeEmpty", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Exclude categories with no listings.")),
        @Argument(name="excludeSubcategories", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Exclude subcategories")),
        @Argument(name="includeCategories", type="com.zzw.github.graphql.schema.scalars.String[]", nonNull=@NonNull("[!]"), description=@Description("Return only the specified categories.")),
    })
    @NonNull("[!]!")
    @Description("Get alphabetically sorted list of Marketplace categories")
    private com.zzw.github.graphql.schema.objects.MarketplaceCategory[] marketplaceCategories;
    public com.zzw.github.graphql.schema.objects.MarketplaceCategory[] getMarketplaceCategories() { return this.marketplaceCategories; }
    public void setMarketplaceCategories(com.zzw.github.graphql.schema.objects.MarketplaceCategory[] marketplaceCategories) { this.marketplaceCategories = marketplaceCategories; }

    @Arguments({
        @Argument(name="slug", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The URL slug of the category.")),
        @Argument(name="useTopicAliases", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("Also check topic aliases for the category slug")),
    })
    @Description("Look up a Marketplace category by its slug.")
    private com.zzw.github.graphql.schema.objects.MarketplaceCategory marketplaceCategory;
    public com.zzw.github.graphql.schema.objects.MarketplaceCategory getMarketplaceCategory() { return this.marketplaceCategory; }
    public void setMarketplaceCategory(com.zzw.github.graphql.schema.objects.MarketplaceCategory marketplaceCategory) { this.marketplaceCategory = marketplaceCategory; }

    @Arguments({
        @Argument(name="slug", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("Select the listing that matches this slug. It's the short name of the listing used in its URL.")),
    })
    @Description("Look up a single Marketplace listing")
    private com.zzw.github.graphql.schema.objects.MarketplaceListing marketplaceListing;
    public com.zzw.github.graphql.schema.objects.MarketplaceListing getMarketplaceListing() { return this.marketplaceListing; }
    public void setMarketplaceListing(com.zzw.github.graphql.schema.objects.MarketplaceListing marketplaceListing) { this.marketplaceListing = marketplaceListing; }

    @NonNull("!")
    @Description("Return information about the GitHub instance")
    private com.zzw.github.graphql.schema.objects.GitHubMetadata meta;
    public com.zzw.github.graphql.schema.objects.GitHubMetadata getMeta() { return this.meta; }
    public void setMeta(com.zzw.github.graphql.schema.objects.GitHubMetadata meta) { this.meta = meta; }

    @Arguments({
        @Argument(name="id", type="com.zzw.github.graphql.schema.scalars.ID", nonNull=@NonNull("!"), description=@Description("ID of the object.")),
    })
    @Description("Fetches an object given its ID.")
    private com.zzw.github.graphql.schema.interfaces.Node node;
    public com.zzw.github.graphql.schema.interfaces.Node getNode() { return this.node; }
    public void setNode(com.zzw.github.graphql.schema.interfaces.Node node) { this.node = node; }

    @Arguments({
        @Argument(name="ids", type="com.zzw.github.graphql.schema.scalars.ID[]", nonNull=@NonNull("[!]!"), description=@Description("The list of node IDs.")),
    })
    @NonNull("!")
    @Description("Lookup nodes by a list of IDs.")
    private com.zzw.github.graphql.schema.interfaces.Node[] nodes;
    public com.zzw.github.graphql.schema.interfaces.Node[] getNodes() { return this.nodes; }
    public void setNodes(com.zzw.github.graphql.schema.interfaces.Node[] nodes) { this.nodes = nodes; }

    @Arguments({
        @Argument(name="login", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The organization's login.")),
    })
    @Description("Lookup a organization by login.")
    private com.zzw.github.graphql.schema.objects.Organization organization;
    public com.zzw.github.graphql.schema.objects.Organization getOrganization() { return this.organization; }
    public void setOrganization(com.zzw.github.graphql.schema.objects.Organization organization) { this.organization = organization; }

    @Arguments({
        @Argument(name="dryRun", type="com.zzw.github.graphql.schema.scalars.Boolean", nonNull=@NonNull(""), description=@Description("If true, calculate the cost for the query without evaluating it")),
    })
    @Description("The client's rate limit information.")
    private com.zzw.github.graphql.schema.objects.RateLimit rateLimit;
    public com.zzw.github.graphql.schema.objects.RateLimit getRateLimit() { return this.rateLimit; }
    public void setRateLimit(com.zzw.github.graphql.schema.objects.RateLimit rateLimit) { this.rateLimit = rateLimit; }

    @NonNull("!")
    @Description("Hack to workaround https://github.com/facebook/relay/issues/112 re-exposing the root query object")
    private com.zzw.github.graphql.schema.queries.Query relay;
    public com.zzw.github.graphql.schema.queries.Query getRelay() { return this.relay; }
    public void setRelay(com.zzw.github.graphql.schema.queries.Query relay) { this.relay = relay; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The name of the repository")),
        @Argument(name="owner", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The login field of a user or organization")),
    })
    @Description("Lookup a given repository by the owner and repository name.")
    private com.zzw.github.graphql.schema.objects.Repository repository;
    public com.zzw.github.graphql.schema.objects.Repository getRepository() { return this.repository; }
    public void setRepository(com.zzw.github.graphql.schema.objects.Repository repository) { this.repository = repository; }

    @Arguments({
        @Argument(name="login", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The username to lookup the owner by.")),
    })
    @Description("Lookup a repository owner (ie. either a User or an Organization) by login.")
    private com.zzw.github.graphql.schema.interfaces.RepositoryOwner repositoryOwner;
    public com.zzw.github.graphql.schema.interfaces.RepositoryOwner getRepositoryOwner() { return this.repositoryOwner; }
    public void setRepositoryOwner(com.zzw.github.graphql.schema.interfaces.RepositoryOwner repositoryOwner) { this.repositoryOwner = repositoryOwner; }

    @Arguments({
        @Argument(name="url", type="com.zzw.github.graphql.schema.scalars.URI", nonNull=@NonNull("!"), description=@Description("The URL.")),
    })
    @Description("Lookup resource by a URL.")
    private com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable resource;
    public com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable getResource() { return this.resource; }
    public void setResource(com.zzw.github.graphql.schema.interfaces.UniformResourceLocatable resource) { this.resource = resource; }

    @Arguments({
        @Argument(name="name", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The topic's name.")),
    })
    @Description("Look up a topic by name.")
    private com.zzw.github.graphql.schema.objects.Topic topic;
    public com.zzw.github.graphql.schema.objects.Topic getTopic() { return this.topic; }
    public void setTopic(com.zzw.github.graphql.schema.objects.Topic topic) { this.topic = topic; }

    @Arguments({
        @Argument(name="login", type="com.zzw.github.graphql.schema.scalars.String", nonNull=@NonNull("!"), description=@Description("The user's login.")),
    })
    @Description("Lookup a user by login.")
    private com.zzw.github.graphql.schema.objects.User user;
    public com.zzw.github.graphql.schema.objects.User getUser() { return this.user; }
    public void setUser(com.zzw.github.graphql.schema.objects.User user) { this.user = user; }

    @NonNull("!")
    @Description("The currently authenticated user.")
    private com.zzw.github.graphql.schema.objects.User viewer;
    public com.zzw.github.graphql.schema.objects.User getViewer() { return this.viewer; }
    public void setViewer(com.zzw.github.graphql.schema.objects.User viewer) { this.viewer = viewer; }
}
