package com.zzw.github.graphql.schema.mutations;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.NonNull;

public class Mutation {
    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AcceptTopicSuggestionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AcceptTopicSuggestion acceptTopicSuggestion;
    public AcceptTopicSuggestion getAcceptTopicSuggestion() { return acceptTopicSuggestion; }
    public void setAcceptTopicSuggestion(AcceptTopicSuggestion acceptTopicSuggestion) { this.acceptTopicSuggestion = acceptTopicSuggestion; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddComment addComment;
    public AddComment getAddComment() { return addComment; }
    public void setAddComment(AddComment addComment) { this.addComment = addComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddProjectCardInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddProjectCard addProjectCard;
    public AddProjectCard getAddProjectCard() { return addProjectCard; }
    public void setAddProjectCard(AddProjectCard addProjectCard) { this.addProjectCard = addProjectCard; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddProjectColumnInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddProjectColumn addProjectColumn;
    public AddProjectColumn getAddProjectColumn() { return addProjectColumn; }
    public void setAddProjectColumn(AddProjectColumn addProjectColumn) { this.addProjectColumn = addProjectColumn; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddPullRequestReviewInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddPullRequestReview addPullRequestReview;
    public AddPullRequestReview getAddPullRequestReview() { return addPullRequestReview; }
    public void setAddPullRequestReview(AddPullRequestReview addPullRequestReview) { this.addPullRequestReview = addPullRequestReview; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddPullRequestReviewCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddPullRequestReviewComment addPullRequestReviewComment;
    public AddPullRequestReviewComment getAddPullRequestReviewComment() { return addPullRequestReviewComment; }
    public void setAddPullRequestReviewComment(AddPullRequestReviewComment addPullRequestReviewComment) { this.addPullRequestReviewComment = addPullRequestReviewComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddReactionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddReaction addReaction;
    public AddReaction getAddReaction() { return addReaction; }
    public void setAddReaction(AddReaction addReaction) { this.addReaction = addReaction; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.AddStarInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private AddStar addStar;
    public AddStar getAddStar() { return addStar; }
    public void setAddStar(AddStar addStar) { this.addStar = addStar; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateCheckRunInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateCheckRun createCheckRun;
    public CreateCheckRun getCreateCheckRun() { return createCheckRun; }
    public void setCreateCheckRun(CreateCheckRun createCheckRun) { this.createCheckRun = createCheckRun; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateCheckSuiteInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateCheckSuite createCheckSuite;
    public CreateCheckSuite getCreateCheckSuite() { return createCheckSuite; }
    public void setCreateCheckSuite(CreateCheckSuite createCheckSuite) { this.createCheckSuite = createCheckSuite; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateDeploymentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateDeployment createDeployment;
    public CreateDeployment getCreateDeployment() { return createDeployment; }
    public void setCreateDeployment(CreateDeployment createDeployment) { this.createDeployment = createDeployment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateDeploymentStatusInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateDeploymentStatus createDeploymentStatus;
    public CreateDeploymentStatus getCreateDeploymentStatus() { return createDeploymentStatus; }
    public void setCreateDeploymentStatus(CreateDeploymentStatus createDeploymentStatus) { this.createDeploymentStatus = createDeploymentStatus; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateProjectInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateProject createProject;
    public CreateProject getCreateProject() { return createProject; }
    public void setCreateProject(CreateProject createProject) { this.createProject = createProject; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateTeamDiscussionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateTeamDiscussion createTeamDiscussion;
    public CreateTeamDiscussion getCreateTeamDiscussion() { return createTeamDiscussion; }
    public void setCreateTeamDiscussion(CreateTeamDiscussion createTeamDiscussion) { this.createTeamDiscussion = createTeamDiscussion; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.CreateTeamDiscussionCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private CreateTeamDiscussionComment createTeamDiscussionComment;
    public CreateTeamDiscussionComment getCreateTeamDiscussionComment() { return createTeamDiscussionComment; }
    public void setCreateTeamDiscussionComment(CreateTeamDiscussionComment createTeamDiscussionComment) { this.createTeamDiscussionComment = createTeamDiscussionComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeclineTopicSuggestionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeclineTopicSuggestion declineTopicSuggestion;
    public DeclineTopicSuggestion getDeclineTopicSuggestion() { return declineTopicSuggestion; }
    public void setDeclineTopicSuggestion(DeclineTopicSuggestion declineTopicSuggestion) { this.declineTopicSuggestion = declineTopicSuggestion; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeleteProjectInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeleteProject deleteProject;
    public DeleteProject getDeleteProject() { return deleteProject; }
    public void setDeleteProject(DeleteProject deleteProject) { this.deleteProject = deleteProject; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeleteProjectCardInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeleteProjectCard deleteProjectCard;
    public DeleteProjectCard getDeleteProjectCard() { return deleteProjectCard; }
    public void setDeleteProjectCard(DeleteProjectCard deleteProjectCard) { this.deleteProjectCard = deleteProjectCard; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeleteProjectColumnInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeleteProjectColumn deleteProjectColumn;
    public DeleteProjectColumn getDeleteProjectColumn() { return deleteProjectColumn; }
    public void setDeleteProjectColumn(DeleteProjectColumn deleteProjectColumn) { this.deleteProjectColumn = deleteProjectColumn; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeletePullRequestReviewInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeletePullRequestReview deletePullRequestReview;
    public DeletePullRequestReview getDeletePullRequestReview() { return deletePullRequestReview; }
    public void setDeletePullRequestReview(DeletePullRequestReview deletePullRequestReview) { this.deletePullRequestReview = deletePullRequestReview; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeleteTeamDiscussionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeleteTeamDiscussion deleteTeamDiscussion;
    public DeleteTeamDiscussion getDeleteTeamDiscussion() { return deleteTeamDiscussion; }
    public void setDeleteTeamDiscussion(DeleteTeamDiscussion deleteTeamDiscussion) { this.deleteTeamDiscussion = deleteTeamDiscussion; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DeleteTeamDiscussionCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DeleteTeamDiscussionComment deleteTeamDiscussionComment;
    public DeleteTeamDiscussionComment getDeleteTeamDiscussionComment() { return deleteTeamDiscussionComment; }
    public void setDeleteTeamDiscussionComment(DeleteTeamDiscussionComment deleteTeamDiscussionComment) { this.deleteTeamDiscussionComment = deleteTeamDiscussionComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.DismissPullRequestReviewInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private DismissPullRequestReview dismissPullRequestReview;
    public DismissPullRequestReview getDismissPullRequestReview() { return dismissPullRequestReview; }
    public void setDismissPullRequestReview(DismissPullRequestReview dismissPullRequestReview) { this.dismissPullRequestReview = dismissPullRequestReview; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.LockLockableInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private LockLockable lockLockable;
    public LockLockable getLockLockable() { return lockLockable; }
    public void setLockLockable(LockLockable lockLockable) { this.lockLockable = lockLockable; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.MoveProjectCardInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private MoveProjectCard moveProjectCard;
    public MoveProjectCard getMoveProjectCard() { return moveProjectCard; }
    public void setMoveProjectCard(MoveProjectCard moveProjectCard) { this.moveProjectCard = moveProjectCard; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.MoveProjectColumnInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private MoveProjectColumn moveProjectColumn;
    public MoveProjectColumn getMoveProjectColumn() { return moveProjectColumn; }
    public void setMoveProjectColumn(MoveProjectColumn moveProjectColumn) { this.moveProjectColumn = moveProjectColumn; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.RemoveOutsideCollaboratorInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private RemoveOutsideCollaborator removeOutsideCollaborator;
    public RemoveOutsideCollaborator getRemoveOutsideCollaborator() { return removeOutsideCollaborator; }
    public void setRemoveOutsideCollaborator(RemoveOutsideCollaborator removeOutsideCollaborator) { this.removeOutsideCollaborator = removeOutsideCollaborator; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.RemoveReactionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private RemoveReaction removeReaction;
    public RemoveReaction getRemoveReaction() { return removeReaction; }
    public void setRemoveReaction(RemoveReaction removeReaction) { this.removeReaction = removeReaction; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.RemoveStarInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private RemoveStar removeStar;
    public RemoveStar getRemoveStar() { return removeStar; }
    public void setRemoveStar(RemoveStar removeStar) { this.removeStar = removeStar; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.RequestReviewsInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private RequestReviews requestReviews;
    public RequestReviews getRequestReviews() { return requestReviews; }
    public void setRequestReviews(RequestReviews requestReviews) { this.requestReviews = requestReviews; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.RerequestCheckSuiteInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private RerequestCheckSuite rerequestCheckSuite;
    public RerequestCheckSuite getRerequestCheckSuite() { return rerequestCheckSuite; }
    public void setRerequestCheckSuite(RerequestCheckSuite rerequestCheckSuite) { this.rerequestCheckSuite = rerequestCheckSuite; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.SubmitPullRequestReviewInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private SubmitPullRequestReview submitPullRequestReview;
    public SubmitPullRequestReview getSubmitPullRequestReview() { return submitPullRequestReview; }
    public void setSubmitPullRequestReview(SubmitPullRequestReview submitPullRequestReview) { this.submitPullRequestReview = submitPullRequestReview; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UnlockLockableInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UnlockLockable unlockLockable;
    public UnlockLockable getUnlockLockable() { return unlockLockable; }
    public void setUnlockLockable(UnlockLockable unlockLockable) { this.unlockLockable = unlockLockable; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateCheckRunInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateCheckRun updateCheckRun;
    public UpdateCheckRun getUpdateCheckRun() { return updateCheckRun; }
    public void setUpdateCheckRun(UpdateCheckRun updateCheckRun) { this.updateCheckRun = updateCheckRun; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateCheckSuitePreferencesInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateCheckSuitePreferences updateCheckSuitePreferences;
    public UpdateCheckSuitePreferences getUpdateCheckSuitePreferences() { return updateCheckSuitePreferences; }
    public void setUpdateCheckSuitePreferences(UpdateCheckSuitePreferences updateCheckSuitePreferences) { this.updateCheckSuitePreferences = updateCheckSuitePreferences; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateProjectInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateProject updateProject;
    public UpdateProject getUpdateProject() { return updateProject; }
    public void setUpdateProject(UpdateProject updateProject) { this.updateProject = updateProject; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateProjectCardInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateProjectCard updateProjectCard;
    public UpdateProjectCard getUpdateProjectCard() { return updateProjectCard; }
    public void setUpdateProjectCard(UpdateProjectCard updateProjectCard) { this.updateProjectCard = updateProjectCard; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateProjectColumnInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateProjectColumn updateProjectColumn;
    public UpdateProjectColumn getUpdateProjectColumn() { return updateProjectColumn; }
    public void setUpdateProjectColumn(UpdateProjectColumn updateProjectColumn) { this.updateProjectColumn = updateProjectColumn; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdatePullRequestReview updatePullRequestReview;
    public UpdatePullRequestReview getUpdatePullRequestReview() { return updatePullRequestReview; }
    public void setUpdatePullRequestReview(UpdatePullRequestReview updatePullRequestReview) { this.updatePullRequestReview = updatePullRequestReview; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdatePullRequestReviewCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdatePullRequestReviewComment updatePullRequestReviewComment;
    public UpdatePullRequestReviewComment getUpdatePullRequestReviewComment() { return updatePullRequestReviewComment; }
    public void setUpdatePullRequestReviewComment(UpdatePullRequestReviewComment updatePullRequestReviewComment) { this.updatePullRequestReviewComment = updatePullRequestReviewComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateSubscriptionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateSubscription updateSubscription;
    public UpdateSubscription getUpdateSubscription() { return updateSubscription; }
    public void setUpdateSubscription(UpdateSubscription updateSubscription) { this.updateSubscription = updateSubscription; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateTeamDiscussionInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateTeamDiscussion updateTeamDiscussion;
    public UpdateTeamDiscussion getUpdateTeamDiscussion() { return updateTeamDiscussion; }
    public void setUpdateTeamDiscussion(UpdateTeamDiscussion updateTeamDiscussion) { this.updateTeamDiscussion = updateTeamDiscussion; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateTeamDiscussionCommentInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateTeamDiscussionComment updateTeamDiscussionComment;
    public UpdateTeamDiscussionComment getUpdateTeamDiscussionComment() { return updateTeamDiscussionComment; }
    public void setUpdateTeamDiscussionComment(UpdateTeamDiscussionComment updateTeamDiscussionComment) { this.updateTeamDiscussionComment = updateTeamDiscussionComment; }

    @Arguments({
        @Argument(name="input", type="com.zzw.github.graphql.schema.inputobjects.UpdateTopicsInput", nonNull=@NonNull("!"), description=@Description("")),
    })
    private UpdateTopics updateTopics;
    public UpdateTopics getUpdateTopics() { return updateTopics; }
    public void setUpdateTopics(UpdateTopics updateTopics) { this.updateTopics = updateTopics; }
}
