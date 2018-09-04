package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A listing in the GitHub integration marketplace.")
public class MarketplaceListing extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @Description("The GitHub App this listing represents.")
    private com.zzw.github.graphql.schema.objects.App app;
    public com.zzw.github.graphql.schema.objects.App getApp() { return this.app; }
    public void setApp(com.zzw.github.graphql.schema.objects.App app) { this.app = app; }

    @Description("URL to the listing owner's company site.")
    private com.zzw.github.graphql.schema.scalars.URI companyUrl;
    public com.zzw.github.graphql.schema.scalars.URI getCompanyUrl() { return this.companyUrl; }
    public void setCompanyUrl(com.zzw.github.graphql.schema.scalars.URI companyUrl) { this.companyUrl = companyUrl; }

    @NonNull("!")
    @Description("The HTTP path for configuring access to the listing's integration or OAuth app")
    private com.zzw.github.graphql.schema.scalars.URI configurationResourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getConfigurationResourcePath() { return this.configurationResourcePath; }
    public void setConfigurationResourcePath(com.zzw.github.graphql.schema.scalars.URI configurationResourcePath) { this.configurationResourcePath = configurationResourcePath; }

    @NonNull("!")
    @Description("The HTTP URL for configuring access to the listing's integration or OAuth app")
    private com.zzw.github.graphql.schema.scalars.URI configurationUrl;
    public com.zzw.github.graphql.schema.scalars.URI getConfigurationUrl() { return this.configurationUrl; }
    public void setConfigurationUrl(com.zzw.github.graphql.schema.scalars.URI configurationUrl) { this.configurationUrl = configurationUrl; }

    @Description("URL to the listing's documentation.")
    private com.zzw.github.graphql.schema.scalars.URI documentationUrl;
    public com.zzw.github.graphql.schema.scalars.URI getDocumentationUrl() { return this.documentationUrl; }
    public void setDocumentationUrl(com.zzw.github.graphql.schema.scalars.URI documentationUrl) { this.documentationUrl = documentationUrl; }

    @Description("The listing's detailed description.")
    private com.zzw.github.graphql.schema.scalars.String extendedDescription;
    public com.zzw.github.graphql.schema.scalars.String getExtendedDescription() { return this.extendedDescription; }
    public void setExtendedDescription(com.zzw.github.graphql.schema.scalars.String extendedDescription) { this.extendedDescription = extendedDescription; }

    @NonNull("!")
    @Description("The listing's detailed description rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML extendedDescriptionHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getExtendedDescriptionHTML() { return this.extendedDescriptionHTML; }
    public void setExtendedDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML extendedDescriptionHTML) { this.extendedDescriptionHTML = extendedDescriptionHTML; }

    @NonNull("!")
    @Description("The listing's introductory description.")
    private com.zzw.github.graphql.schema.scalars.String fullDescription;
    public com.zzw.github.graphql.schema.scalars.String getFullDescription() { return this.fullDescription; }
    public void setFullDescription(com.zzw.github.graphql.schema.scalars.String fullDescription) { this.fullDescription = fullDescription; }

    @NonNull("!")
    @Description("The listing's introductory description rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML fullDescriptionHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getFullDescriptionHTML() { return this.fullDescriptionHTML; }
    public void setFullDescriptionHTML(com.zzw.github.graphql.schema.scalars.HTML fullDescriptionHTML) { this.fullDescriptionHTML = fullDescriptionHTML; }

    @NonNull("!")
    @Description("Whether this listing has been submitted for review from GitHub for approval to be displayed in the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean hasApprovalBeenRequested;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasApprovalBeenRequested() { return this.hasApprovalBeenRequested; }
    public void setHasApprovalBeenRequested(com.zzw.github.graphql.schema.scalars.Boolean hasApprovalBeenRequested) { this.hasApprovalBeenRequested = hasApprovalBeenRequested; }

    @NonNull("!")
    @Description("Does this listing have any plans with a free trial?")
    private com.zzw.github.graphql.schema.scalars.Boolean hasPublishedFreeTrialPlans;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasPublishedFreeTrialPlans() { return this.hasPublishedFreeTrialPlans; }
    public void setHasPublishedFreeTrialPlans(com.zzw.github.graphql.schema.scalars.Boolean hasPublishedFreeTrialPlans) { this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans; }

    @NonNull("!")
    @Description("Does this listing have a terms of service link?")
    private com.zzw.github.graphql.schema.scalars.Boolean hasTermsOfService;
    public com.zzw.github.graphql.schema.scalars.Boolean getHasTermsOfService() { return this.hasTermsOfService; }
    public void setHasTermsOfService(com.zzw.github.graphql.schema.scalars.Boolean hasTermsOfService) { this.hasTermsOfService = hasTermsOfService; }

    @Description("A technical description of how this app works with GitHub.")
    private com.zzw.github.graphql.schema.scalars.String howItWorks;
    public com.zzw.github.graphql.schema.scalars.String getHowItWorks() { return this.howItWorks; }
    public void setHowItWorks(com.zzw.github.graphql.schema.scalars.String howItWorks) { this.howItWorks = howItWorks; }

    @NonNull("!")
    @Description("The listing's technical description rendered to HTML.")
    private com.zzw.github.graphql.schema.scalars.HTML howItWorksHTML;
    public com.zzw.github.graphql.schema.scalars.HTML getHowItWorksHTML() { return this.howItWorksHTML; }
    public void setHowItWorksHTML(com.zzw.github.graphql.schema.scalars.HTML howItWorksHTML) { this.howItWorksHTML = howItWorksHTML; }

    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @Description("URL to install the product to the viewer's account or organization.")
    private com.zzw.github.graphql.schema.scalars.URI installationUrl;
    public com.zzw.github.graphql.schema.scalars.URI getInstallationUrl() { return this.installationUrl; }
    public void setInstallationUrl(com.zzw.github.graphql.schema.scalars.URI installationUrl) { this.installationUrl = installationUrl; }

    @NonNull("!")
    @Description("Whether this listing's app has been installed for the current viewer")
    private com.zzw.github.graphql.schema.scalars.Boolean installedForViewer;
    public com.zzw.github.graphql.schema.scalars.Boolean getInstalledForViewer() { return this.installedForViewer; }
    public void setInstalledForViewer(com.zzw.github.graphql.schema.scalars.Boolean installedForViewer) { this.installedForViewer = installedForViewer; }

    @NonNull("!")
    @Description("Whether this listing has been approved for display in the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean isApproved;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsApproved() { return this.isApproved; }
    public void setIsApproved(com.zzw.github.graphql.schema.scalars.Boolean isApproved) { this.isApproved = isApproved; }

    @NonNull("!")
    @Description("Whether this listing has been removed from the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean isDelisted;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDelisted() { return this.isDelisted; }
    public void setIsDelisted(com.zzw.github.graphql.schema.scalars.Boolean isDelisted) { this.isDelisted = isDelisted; }

    @NonNull("!")
    @Description("Whether this listing is still an editable draft that has not been submitted for review and is not publicly visible in the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean isDraft;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsDraft() { return this.isDraft; }
    public void setIsDraft(com.zzw.github.graphql.schema.scalars.Boolean isDraft) { this.isDraft = isDraft; }

    @NonNull("!")
    @Description("Whether the product this listing represents is available as part of a paid plan.")
    private com.zzw.github.graphql.schema.scalars.Boolean isPaid;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsPaid() { return this.isPaid; }
    public void setIsPaid(com.zzw.github.graphql.schema.scalars.Boolean isPaid) { this.isPaid = isPaid; }

    @NonNull("!")
    @Description("Whether this listing has been rejected by GitHub for display in the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean isRejected;
    public com.zzw.github.graphql.schema.scalars.Boolean getIsRejected() { return this.isRejected; }
    public void setIsRejected(com.zzw.github.graphql.schema.scalars.Boolean isRejected) { this.isRejected = isRejected; }

    @NonNull("!")
    @Description("The hex color code, without the leading '#', for the logo background.")
    private com.zzw.github.graphql.schema.scalars.String logoBackgroundColor;
    public com.zzw.github.graphql.schema.scalars.String getLogoBackgroundColor() { return this.logoBackgroundColor; }
    public void setLogoBackgroundColor(com.zzw.github.graphql.schema.scalars.String logoBackgroundColor) { this.logoBackgroundColor = logoBackgroundColor; }

    @Arguments({
        @Argument(name="size", type="com.zzw.github.graphql.schema.scalars.Int", nonNull=@NonNull(""), description=@Description("The size in pixels of the resulting square image.")),
    })
    @Description("URL for the listing's logo image.")
    private com.zzw.github.graphql.schema.scalars.URI logoUrl;
    public com.zzw.github.graphql.schema.scalars.URI getLogoUrl() { return this.logoUrl; }
    public void setLogoUrl(com.zzw.github.graphql.schema.scalars.URI logoUrl) { this.logoUrl = logoUrl; }

    @NonNull("!")
    @Description("The listing's full name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("!")
    @Description("The listing's very short description without a trailing period or ampersands.")
    private com.zzw.github.graphql.schema.scalars.String normalizedShortDescription;
    public com.zzw.github.graphql.schema.scalars.String getNormalizedShortDescription() { return this.normalizedShortDescription; }
    public void setNormalizedShortDescription(com.zzw.github.graphql.schema.scalars.String normalizedShortDescription) { this.normalizedShortDescription = normalizedShortDescription; }

    @Description("URL to the listing's detailed pricing.")
    private com.zzw.github.graphql.schema.scalars.URI pricingUrl;
    public com.zzw.github.graphql.schema.scalars.URI getPricingUrl() { return this.pricingUrl; }
    public void setPricingUrl(com.zzw.github.graphql.schema.scalars.URI pricingUrl) { this.pricingUrl = pricingUrl; }

    @NonNull("!")
    @Description("The category that best describes the listing.")
    private com.zzw.github.graphql.schema.objects.MarketplaceCategory primaryCategory;
    public com.zzw.github.graphql.schema.objects.MarketplaceCategory getPrimaryCategory() { return this.primaryCategory; }
    public void setPrimaryCategory(com.zzw.github.graphql.schema.objects.MarketplaceCategory primaryCategory) { this.primaryCategory = primaryCategory; }

    @NonNull("!")
    @Description("URL to the listing's privacy policy.")
    private com.zzw.github.graphql.schema.scalars.URI privacyPolicyUrl;
    public com.zzw.github.graphql.schema.scalars.URI getPrivacyPolicyUrl() { return this.privacyPolicyUrl; }
    public void setPrivacyPolicyUrl(com.zzw.github.graphql.schema.scalars.URI privacyPolicyUrl) { this.privacyPolicyUrl = privacyPolicyUrl; }

    @NonNull("!")
    @Description("The HTTP path for the Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.URI resourcePath;
    public com.zzw.github.graphql.schema.scalars.URI getResourcePath() { return this.resourcePath; }
    public void setResourcePath(com.zzw.github.graphql.schema.scalars.URI resourcePath) { this.resourcePath = resourcePath; }

    @NonNull("!")
    @Description("The URLs for the listing's screenshots.")
    private com.zzw.github.graphql.schema.scalars.String[] screenshotUrls;
    public com.zzw.github.graphql.schema.scalars.String[] getScreenshotUrls() { return this.screenshotUrls; }
    public void setScreenshotUrls(com.zzw.github.graphql.schema.scalars.String[] screenshotUrls) { this.screenshotUrls = screenshotUrls; }

    @Description("An alternate category that describes the listing.")
    private com.zzw.github.graphql.schema.objects.MarketplaceCategory secondaryCategory;
    public com.zzw.github.graphql.schema.objects.MarketplaceCategory getSecondaryCategory() { return this.secondaryCategory; }
    public void setSecondaryCategory(com.zzw.github.graphql.schema.objects.MarketplaceCategory secondaryCategory) { this.secondaryCategory = secondaryCategory; }

    @NonNull("!")
    @Description("The listing's very short description.")
    private com.zzw.github.graphql.schema.scalars.String shortDescription;
    public com.zzw.github.graphql.schema.scalars.String getShortDescription() { return this.shortDescription; }
    public void setShortDescription(com.zzw.github.graphql.schema.scalars.String shortDescription) { this.shortDescription = shortDescription; }

    @NonNull("!")
    @Description("The short name of the listing used in its URL.")
    private com.zzw.github.graphql.schema.scalars.String slug;
    public com.zzw.github.graphql.schema.scalars.String getSlug() { return this.slug; }
    public void setSlug(com.zzw.github.graphql.schema.scalars.String slug) { this.slug = slug; }

    @Description("URL to the listing's status page.")
    private com.zzw.github.graphql.schema.scalars.URI statusUrl;
    public com.zzw.github.graphql.schema.scalars.URI getStatusUrl() { return this.statusUrl; }
    public void setStatusUrl(com.zzw.github.graphql.schema.scalars.URI statusUrl) { this.statusUrl = statusUrl; }

    @Description("An email address for support for this listing's app.")
    private com.zzw.github.graphql.schema.scalars.String supportEmail;
    public com.zzw.github.graphql.schema.scalars.String getSupportEmail() { return this.supportEmail; }
    public void setSupportEmail(com.zzw.github.graphql.schema.scalars.String supportEmail) { this.supportEmail = supportEmail; }

    @NonNull("!")
    @Description("Either a URL or an email address for support for this listing's app.")
    private com.zzw.github.graphql.schema.scalars.URI supportUrl;
    public com.zzw.github.graphql.schema.scalars.URI getSupportUrl() { return this.supportUrl; }
    public void setSupportUrl(com.zzw.github.graphql.schema.scalars.URI supportUrl) { this.supportUrl = supportUrl; }

    @Description("URL to the listing's terms of service.")
    private com.zzw.github.graphql.schema.scalars.URI termsOfServiceUrl;
    public com.zzw.github.graphql.schema.scalars.URI getTermsOfServiceUrl() { return this.termsOfServiceUrl; }
    public void setTermsOfServiceUrl(com.zzw.github.graphql.schema.scalars.URI termsOfServiceUrl) { this.termsOfServiceUrl = termsOfServiceUrl; }

    @NonNull("!")
    @Description("The HTTP URL for the Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.URI url;
    public com.zzw.github.graphql.schema.scalars.URI getUrl() { return this.url; }
    public void setUrl(com.zzw.github.graphql.schema.scalars.URI url) { this.url = url; }

    @NonNull("!")
    @Description("Can the current viewer add plans for this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanAddPlans;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanAddPlans() { return this.viewerCanAddPlans; }
    public void setViewerCanAddPlans(com.zzw.github.graphql.schema.scalars.Boolean viewerCanAddPlans) { this.viewerCanAddPlans = viewerCanAddPlans; }

    @NonNull("!")
    @Description("Can the current viewer approve this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanApprove;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanApprove() { return this.viewerCanApprove; }
    public void setViewerCanApprove(com.zzw.github.graphql.schema.scalars.Boolean viewerCanApprove) { this.viewerCanApprove = viewerCanApprove; }

    @NonNull("!")
    @Description("Can the current viewer delist this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelist;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanDelist() { return this.viewerCanDelist; }
    public void setViewerCanDelist(com.zzw.github.graphql.schema.scalars.Boolean viewerCanDelist) { this.viewerCanDelist = viewerCanDelist; }

    @NonNull("!")
    @Description("Can the current viewer edit this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanEdit;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanEdit() { return this.viewerCanEdit; }
    public void setViewerCanEdit(com.zzw.github.graphql.schema.scalars.Boolean viewerCanEdit) { this.viewerCanEdit = viewerCanEdit; }

    @NonNull("!")
    @Description("Can the current viewer edit the primary and secondary category of this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanEditCategories;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanEditCategories() { return this.viewerCanEditCategories; }
    public void setViewerCanEditCategories(com.zzw.github.graphql.schema.scalars.Boolean viewerCanEditCategories) { this.viewerCanEditCategories = viewerCanEditCategories; }

    @NonNull("!")
    @Description("Can the current viewer edit the plans for this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanEditPlans;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanEditPlans() { return this.viewerCanEditPlans; }
    public void setViewerCanEditPlans(com.zzw.github.graphql.schema.scalars.Boolean viewerCanEditPlans) { this.viewerCanEditPlans = viewerCanEditPlans; }

    @NonNull("!")
    @Description("Can the current viewer return this Marketplace listing to draft state so it becomes editable again.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanRedraft;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanRedraft() { return this.viewerCanRedraft; }
    public void setViewerCanRedraft(com.zzw.github.graphql.schema.scalars.Boolean viewerCanRedraft) { this.viewerCanRedraft = viewerCanRedraft; }

    @NonNull("!")
    @Description("Can the current viewer reject this Marketplace listing by returning it to an editable draft state or rejecting it entirely.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanReject;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanReject() { return this.viewerCanReject; }
    public void setViewerCanReject(com.zzw.github.graphql.schema.scalars.Boolean viewerCanReject) { this.viewerCanReject = viewerCanReject; }

    @NonNull("!")
    @Description("Can the current viewer request this listing be reviewed for display in the Marketplace.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerCanRequestApproval;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerCanRequestApproval() { return this.viewerCanRequestApproval; }
    public void setViewerCanRequestApproval(com.zzw.github.graphql.schema.scalars.Boolean viewerCanRequestApproval) { this.viewerCanRequestApproval = viewerCanRequestApproval; }

    @NonNull("!")
    @Description("Indicates whether the current user has an active subscription to this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasPurchased;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasPurchased() { return this.viewerHasPurchased; }
    public void setViewerHasPurchased(com.zzw.github.graphql.schema.scalars.Boolean viewerHasPurchased) { this.viewerHasPurchased = viewerHasPurchased; }

    @NonNull("!")
    @Description("Indicates if the current user has purchased a subscription to this Marketplace listing for all of the organizations the user owns.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerHasPurchasedForAllOrganizations;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerHasPurchasedForAllOrganizations() { return this.viewerHasPurchasedForAllOrganizations; }
    public void setViewerHasPurchasedForAllOrganizations(com.zzw.github.graphql.schema.scalars.Boolean viewerHasPurchasedForAllOrganizations) { this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations; }

    @NonNull("!")
    @Description("Does the current viewer role allow them to administer this Marketplace listing.")
    private com.zzw.github.graphql.schema.scalars.Boolean viewerIsListingAdmin;
    public com.zzw.github.graphql.schema.scalars.Boolean getViewerIsListingAdmin() { return this.viewerIsListingAdmin; }
    public void setViewerIsListingAdmin(com.zzw.github.graphql.schema.scalars.Boolean viewerIsListingAdmin) { this.viewerIsListingAdmin = viewerIsListingAdmin; }
}
