package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The possible item types found in a timeline.")
public enum IssueTimelineItemsItemType {
    @Description("Represents a 'added_to_project' event on a given issue or pull request.")
    ADDED_TO_PROJECT_EVENT,
    @Description("Represents an 'assigned' event on any assignable object.")
    ASSIGNED_EVENT,
    @Description("Represents a 'closed' event on any Closable.")
    CLOSED_EVENT,
    @Description("Represents a 'comment_deleted' event on a given issue or pull request.")
    COMMENT_DELETED_EVENT,
    @Description("Represents a 'converted_note_to_issue' event on a given issue or pull request.")
    CONVERTED_NOTE_TO_ISSUE_EVENT,
    @Description("Represents a mention made by one issue or pull request to another.")
    CROSS_REFERENCED_EVENT,
    @Description("Represents a 'demilestoned' event on a given issue or pull request.")
    DEMILESTONED_EVENT,
    @Description("Represents a comment on an Issue.")
    ISSUE_COMMENT,
    @Description("Represents a 'labeled' event on a given issue or pull request.")
    LABELED_EVENT,
    @Description("Represents a 'locked' event on a given issue or pull request.")
    LOCKED_EVENT,
    @Description("Represents a 'mentioned' event on a given issue or pull request.")
    MENTIONED_EVENT,
    @Description("Represents a 'milestoned' event on a given issue or pull request.")
    MILESTONED_EVENT,
    @Description("Represents a 'moved_columns_in_project' event on a given issue or pull request.")
    MOVED_COLUMNS_IN_PROJECT_EVENT,
    @Description("Represents a 'referenced' event on a given ReferencedSubject.")
    REFERENCED_EVENT,
    @Description("Represents a 'removed_from_project' event on a given issue or pull request.")
    REMOVED_FROM_PROJECT_EVENT,
    @Description("Represents a 'renamed' event on a given issue or pull request")
    RENAMED_TITLE_EVENT,
    @Description("Represents a 'reopened' event on any Closable.")
    REOPENED_EVENT,
    @Description("Represents a 'subscribed' event on a given Subscribable.")
    SUBSCRIBED_EVENT,
    @Description("Represents an 'unassigned' event on any assignable object.")
    UNASSIGNED_EVENT,
    @Description("Represents an 'unlabeled' event on a given issue or pull request.")
    UNLABELED_EVENT,
    @Description("Represents an 'unlocked' event on a given issue or pull request.")
    UNLOCKED_EVENT,
    @Description("Represents an 'unsubscribed' event on a given Subscribable.")
    UNSUBSCRIBED_EVENT,
}
