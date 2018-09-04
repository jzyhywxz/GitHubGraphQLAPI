package com.zzw.github.graphql.builder;

import com.zzw.github.graphql.schema.enums.IssueState;
import com.zzw.github.graphql.schema.enums.PullRequestState;
import com.zzw.github.graphql.schema.enums.ReactionContent;
import org.junit.Test;

/**
 * Created by zzw on 2018/4/8.
 */
public class GraphQLBuilderTest {
    private GraphQLBuilder builder = new GraphQLBuilder();

//    @Test
    public void testWithoutVariableAndArgument() {
        GraphQLNode queryNode = GraphQLNode.asNode("query").
                addNode(GraphQLNode.asNode("viewer").
                        addNode(GraphQLNode.asNode("name")).
                        addNode(GraphQLNode.asNode("login")));

        builder.prepare(queryNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }

//    @Test
    public void testWithoutVariableAndWithArgument() {
        GraphQLNode edgesNode = GraphQLNode.asNode("edges").
                addNode(GraphQLNode.asNode("node").
                        addNode(GraphQLNode.asNode("title")).
                        addNode(GraphQLNode.asNode("bodyText")));
        GraphQLNode totalCountNode = GraphQLNode.asNode("totalCount");

        GraphQLNode queryNode = GraphQLNode.asNode("query").
                addNode(GraphQLNode.asNode("repository").
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.String>asArgument(
                                "owner",
                                new com.zzw.github.graphql.schema.scalars.String("mrdoob"),
                                com.zzw.github.graphql.schema.scalars.String.class)).
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.String>asArgument(
                                "name",
                                new com.zzw.github.graphql.schema.scalars.String("three.js"),
                                com.zzw.github.graphql.schema.scalars.String.class)).
                        addNode(GraphQLNode.asNode("issues").
                                addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.Int>asArgument(
                                        "first",
                                        new com.zzw.github.graphql.schema.scalars.Int(3),
                                        com.zzw.github.graphql.schema.scalars.Int.class)).
                                addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.enums.IssueState[]>asArgument(
                                        "states",
                                        new com.zzw.github.graphql.schema.enums.IssueState[]{ IssueState.CLOSED },
                                        com.zzw.github.graphql.schema.enums.IssueState[].class)).
                                addNode(edgesNode).
                                addNode(totalCountNode)).
                        addNode(GraphQLNode.asNode("pullRequests").
                                addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.Int>asArgument(
                                        "last",
                                        new com.zzw.github.graphql.schema.scalars.Int(3),
                                        com.zzw.github.graphql.schema.scalars.Int.class)).
                                addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.enums.PullRequestState[]>asArgument(
                                        "states",
                                        new com.zzw.github.graphql.schema.enums.PullRequestState[]{ PullRequestState.OPEN },
                                        com.zzw.github.graphql.schema.enums.PullRequestState[].class)).
                                addNode(edgesNode).
                                addNode(totalCountNode)));

        builder.prepare(queryNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }

//    @Test
    public void testWithVariableAndArgument() {
        GraphQLNode edgesNode = GraphQLNode.asNode("edges").
                addNode(GraphQLNode.asNode("node").
                        addNode(GraphQLNode.asNode("title")).
                        addNode(GraphQLNode.asNode("bodyText")));
        GraphQLNode totalCountNode = GraphQLNode.asNode("totalCount");

        GraphQLArgument<com.zzw.github.graphql.schema.scalars.Int> count =
                GraphQLArgument.asVariable(
                        "first",
                        new com.zzw.github.graphql.schema.scalars.Int(3),
                        com.zzw.github.graphql.schema.scalars.Int.class,
                        "count",
                        0);
        GraphQLArgument<com.zzw.github.graphql.schema.enums.IssueState[]> isStates =
                GraphQLArgument.asVariable(
                        "states",
                        new com.zzw.github.graphql.schema.enums.IssueState[]{ IssueState.CLOSED },
                        com.zzw.github.graphql.schema.enums.IssueState[].class,
                        "isStates",
                        GraphQLArgument.NONNULL_INNER_ONLY);
        GraphQLArgument<com.zzw.github.graphql.schema.enums.PullRequestState[]> prStates =
                GraphQLArgument.asVariable(
                        "states",
                        new com.zzw.github.graphql.schema.enums.PullRequestState[]{ PullRequestState.OPEN },
                        com.zzw.github.graphql.schema.enums.PullRequestState[].class,
                        "prStates",
                        GraphQLArgument.NONNULL_INNER_ONLY);

        GraphQLNode queryNode = GraphQLNode.asNode("query").
                addNode(GraphQLNode.asNode("repository").
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.String>asArgument(
                                "owner",
                                new com.zzw.github.graphql.schema.scalars.String("mrdoob"),
                                com.zzw.github.graphql.schema.scalars.String.class)).
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.String>asArgument(
                                "name",
                                new com.zzw.github.graphql.schema.scalars.String("three.js"),
                                com.zzw.github.graphql.schema.scalars.String.class)).
                        addNode(GraphQLNode.asNode("issues").
                                addArgument(count).
                                addArgument(isStates).
                                addNode(edgesNode).
                                addNode(totalCountNode)).
                        addNode(GraphQLNode.asNode("pullRequests").
                                addArgument(count).
                                addArgument(prStates).
                                addNode(edgesNode).
                                addNode(totalCountNode)));

        builder.prepare(queryNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }

//    @Test
    public void testFragment() {
        GraphQLNode queryNode = GraphQLNode.asNode("query").
                addNode(GraphQLNode.asNode("node").
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.scalars.ID>asArgument(
                                "id",
                                new com.zzw.github.graphql.schema.scalars.ID("MDU6SXNzdWUxNzkzMTE="),
                                com.zzw.github.graphql.schema.scalars.ID.class)).
                        addNode(GraphQLNode.asNode("id")).
                        addNode(GraphQLNode.asFragment(
                                com.zzw.github.graphql.schema.objects.Issue.class).
                                addNode(GraphQLNode.asNode("title")).
                                addNode(GraphQLNode.asNode("bodyText"))));

        builder.prepare(queryNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }

//    @Test
    public void testMutationWithArgument() {
        com.zzw.github.graphql.schema.inputobjects.AddReactionInput input = new com.zzw.github.graphql.schema.inputobjects.AddReactionInput();
        input.setSubjectId(new com.zzw.github.graphql.schema.scalars.ID("MDU6SXNzdWUyMTc5NTQ0OTc="));
        input.setContent(ReactionContent.HOORAY);

        GraphQLNode mutationNode = GraphQLNode.asNode("mutation").
                addNode(GraphQLNode.asNode("addReaction").
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.inputobjects.AddReactionInput>asArgument(
                                "input",
                                input,
                                com.zzw.github.graphql.schema.inputobjects.AddReactionInput.class)).
                        addNode(GraphQLNode.asNode("clientMutationId")).
                        addNode(GraphQLNode.asNode("reaction").
                                addNode(GraphQLNode.asNode("content"))).
                        addNode(GraphQLNode.asNode("subject").
                                addNode(GraphQLNode.asNode("id"))));

        builder.prepare(mutationNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }

//    @Test
    public void testMutationWithVariable() {
        com.zzw.github.graphql.schema.inputobjects.AddReactionInput input = new com.zzw.github.graphql.schema.inputobjects.AddReactionInput();
        input.setSubjectId(new com.zzw.github.graphql.schema.scalars.ID("MDU6SXNzdWUyMTc5NTQ0OTc="));
        input.setContent(ReactionContent.HOORAY);

        GraphQLNode mutationNode = GraphQLNode.asNode("mutation").
                addNode(GraphQLNode.asNode("addReaction").
                        addArgument(GraphQLArgument.<com.zzw.github.graphql.schema.inputobjects.AddReactionInput>asVariable(
                                "input",
                                input,
                                com.zzw.github.graphql.schema.inputobjects.AddReactionInput.class,
                                "var",
                                GraphQLArgument.NONNULL_OUTER_ONLY)).
                        addNode(GraphQLNode.asNode("clientMutationId")).
                        addNode(GraphQLNode.asNode("reaction").
                                addNode(GraphQLNode.asNode("content"))).
                        addNode(GraphQLNode.asNode("subject").
                                addNode(GraphQLNode.asNode("id"))));

        builder.prepare(mutationNode);
        String payload = builder.visualize();
        System.out.println(payload);
    }
}
