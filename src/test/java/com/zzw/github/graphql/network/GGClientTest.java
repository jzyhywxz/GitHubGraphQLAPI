package com.zzw.github.graphql.network;

import com.zzw.github.graphql.builder.GGBuilder;
import com.zzw.github.graphql.builder.GraphQLArgument;
import com.zzw.github.graphql.parser.GGParser;
import com.zzw.github.graphql.parser.GitHubGraphQLGson;
import com.zzw.github.graphql.schema.mutations.MutationEntry;
import com.zzw.github.graphql.schema.query.QueryEntry;
import com.zzw.github.graphql.schema.enums.ReactionContent;
import com.zzw.github.graphql.schema.inputobjects.AddReactionInput;
import com.zzw.github.graphql.schema.mutations.AddReaction;
import com.zzw.github.graphql.schema.mutations.Mutation;
import com.zzw.github.graphql.schema.objects.Repository;
import com.zzw.github.graphql.schema.objects.User;
import com.zzw.github.graphql.schema.query.Query;
import com.zzw.tools.io.OkTextReader;
import org.junit.Test;

/**
 * Created by zzw on 2018/6/10.
 */
public class GGClientTest {
    private static final String QUERY_STRING =
            "{" +
                    "  \"query\":\"query($number_of_repos:Int!){\\n" +
                    "    viewer{\\n" +
                    "      name\\n" +
                    "      repositories(last:$number_of_repos){\\n" +
                    "        nodes{\\n" +
                    "          name\\n" +
                    "        }\\n" +
                    "      }\\n" +
                    "    }\\n" +
                    "  }\"," +
                    "  \"variables\":\"{\\n" +
                    "    \\\"number_of_repos\\\":3\\n" +
                    "  }\"" +
                    "}";
    private static final String MUTATION_STRING =
            "{" +
                    "  \"query\":\"mutation($myVar:AddReactionInput!) {\\n" +
                    "    addReaction(input:$myVar) {\\n" +
                    "      reaction {\\n" +
                    "        content\\n" +
                    "      }\\n" +
                    "      subject {\\n" +
                    "        id\\n" +
                    "      }\\n" +
                    "    }\\n" +
                    "  }\"," +
                    "  \"variables\":\"{\\n" +
                    "    \\\"myVar\\\": {\\n" +
                    "      \\\"subjectId\\\":\\\"MDU6SXNzdWUyMzEzOTE1NTE=\\\",\\n" +
                    "      \\\"content\\\":\\\"HOORAY\\\"\\n" +
                    "    }\\n" +
                    "  }\"" +
                    "}";

    private String buildQueryString() {
        GGBuilder builder = new GGBuilder("query");
        builder.m("viewer/name,repositories[@last='3']/nodes/name");
        return builder.serialize();
    }

    private String buildMutationString() {
        AddReactionInput input = new AddReactionInput();
        input.setSubjectId(new com.zzw.github.graphql.schema.scalars.ID("MDU6SXNzdWUyMzEzOTE1NTE="));
        input.setContent(ReactionContent.HOORAY);

        GGBuilder builder = new GGBuilder("mutation");
        builder.m("addReaction").
                a(GraphQLArgument.asVariable(
                        "input",
                        input,
                        AddReactionInput.class,
                        "myVar",
                        GraphQLArgument.NONNULL_OUTER_ONLY)).
                f("reaction/content").
                f("subject/id");

        return builder.serialize();
    }

//    @Test
    public void testOkGraphQL() {
        String queryString = buildQueryString();
        System.out.println(queryString);
        System.out.println(QUERY_STRING);

        String mutationString = buildMutationString();
        System.out.println(mutationString);
        System.out.println(MUTATION_STRING);
    }

//    @Test
    public void testNetwork() {
        String rootEndpoint = "https://api.github.com/graphql";
        OkTextReader reader = new OkTextReader();
        reader.open("F:\\JetBrains\\IntelliJIdea\\access_token.txt");
        String accessToken = reader.readLine();
        reader.close();
        GGClient client = new GGClient(rootEndpoint, accessToken);
        GitHubGraphQLGson gson = GitHubGraphQLGson.getInstance();

        System.out.println("===================================");
        System.out.println("            TEST  QUERY            ");
        System.out.println("===================================");
        try {
            String queryString = buildQueryString();
            client.connect(queryString, true);
            System.out.println("\n*****      Result      *****");
            String result = client.result();
            System.out.println(result);
            System.out.println("\n*****  Json to Object  *****");
            QueryEntry queryEntry = gson.fromJson(result, QueryEntry.class);
            User viewer = queryEntry.getData().getViewer();
            String userName = viewer.getName().getValue();
            System.out.println("viewer.name: " + userName);
            Repository[] repositories = viewer.getRepositories().getNodes();
            System.out.println("viewer.repositories.name: [");
            if ((repositories != null) && (repositories.length > 0)) {
                for (Repository repository : repositories) {
                    String repoName = repository.getName().getValue();
                    System.out.println("  " + repoName);
                }
            }
            System.out.println("]");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.disconnect();
        }

        System.out.println("===================================");
        System.out.println("           TEST MUTATION           ");
        System.out.println("===================================");
        try {
            String mutationString = buildMutationString();
            client.connect(mutationString, true);

            System.out.println("\n*****      Result      *****");
            String result = client.result();
            System.out.println(result);
            System.out.println("\n*****  Json to Object  *****");
            MutationEntry mutationEntry = gson.fromJson(result, MutationEntry.class);
            AddReaction addReaction = mutationEntry.getData().getAddReaction();
            ReactionContent content = addReaction.getReaction().getContent();
            System.out.println("addReaction.reaction.content: " + content);
            String id = addReaction.getSubject().getId().getValue();
            System.out.println("addReaction.subject.id: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.disconnect();
        }
    }

//    @Test
    public void testOkGson() {
        String rootEndpoint = "https://api.github.com/graphql";
        OkTextReader reader = new OkTextReader();
        reader.open("F:\\JetBrains\\IntelliJIdea\\access_token.txt");
        String accessToken = reader.readLine();
        reader.close();
        GGClient client = new GGClient(rootEndpoint, accessToken);

        System.out.println("===================================");
        System.out.println("            TEST  QUERY            ");
        System.out.println("===================================");
        try {
            String queryString = buildQueryString();
            client.connect(queryString, true);

            System.out.println("\n*****      Result      *****");
            String result = client.result();
            System.out.println(result);
            System.out.println("\n*****  Json to Object  *****");
            Query query = GGParser.fromJson(result, QueryEntry.class).getData();
            String viewerName = (String) GGParser.get(query, Query.class, "viewer/name/value")[1];
            System.out.println("viewer.name: " + viewerName);
            Repository[] repositories = (Repository[]) GGParser.get(query, Query.class, "viewer/repositories/nodes");
            if ((repositories != null) && (repositories.length > 0)) {
                for (int i = 0; i < repositories.length; i++) {
                    String input = "viewer/repositories/nodes[" + i + "]/name/value";
                    String repoName = (String) GGParser.get(query, Query.class, input)[1];
                    System.out.println("repositories[" + i + "].name: " + repoName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.disconnect();
        }

        System.out.println("===================================");
        System.out.println("           TEST MUTATION           ");
        System.out.println("===================================");
        try {
            String mutationString = buildMutationString();
            client.connect(mutationString, true);

            System.out.println("\n*****      Result      *****");
            String result = client.result();
            System.out.println(result);
            System.out.println("\n*****  Json to Object  *****");
            Mutation mutation = GGParser.fromJson(result, MutationEntry.class).getData();
            ReactionContent content = (ReactionContent) GGParser.get(mutation, Mutation.class, "addReaction/reaction/content")[1];
            System.out.println("addReaction.reaction.content: " + content);
            String id = (String) GGParser.get(mutation, Mutation.class, "addReaction/subject/id/value")[1];
            System.out.println("addReaction.subject.id: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.disconnect();
        }
    }
}
