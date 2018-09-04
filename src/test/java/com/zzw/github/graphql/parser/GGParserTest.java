package com.zzw.github.graphql.parser;

import com.zzw.github.graphql.network.GGClient;
import com.zzw.github.graphql.schema.objects.CommitComment;
import com.zzw.github.graphql.schema.query.QueryEntry;
import com.zzw.tools.io.OkTextReader;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zzw on 2018/8/24.
 */
public class GGParserTest {
//    @Test
    public void testGGParser() {
        String rootEndpoint = "https://api.github.com/graphql";
        OkTextReader reader = new OkTextReader();
        reader.open("F:\\JetBrains\\IntelliJIdea\\access_token.txt");
        String accessToken = reader.readLine();
        reader.close();
        GGClient connector = new GGClient(rootEndpoint, accessToken);
        String payload = "{\"query\":\"query{\\n  node(id:\\\"MDEzOkNvbW1pdENvbW1lbnQyMDk1MDI1\\\"){\\n    __typename\\n    ... on CommitComment{\\n      id\\n    }\\n  }\\n}\",\"variables\":\"{}\"}";
        try {
            connector.connect(payload, true);
            String result = connector.result();
            QueryEntry entry = GGParser.fromJson(result, QueryEntry.class);
            CommitComment commitComment = (CommitComment) entry.getData().getNode();
            System.out.println("__typename:" + commitComment.getTypename());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connector.disconnect();
        }
    }

//    @Test
    public void test1() {
        String result = "{\"data\":{\"node\":{\"__typename\":\"Issue\",\"author\":{\"__typename\":\"User\",\"id\":\"MDQ6VXNlcjcxOA==\"},\"timeline\":{\"edges\":[{\"cursor\":\"MQ==\",\"node\":{\"__typename\":\"IssueComment\",\"id\":\"MDEyOklzc3VlQ29tbWVudDIyMDAwNA==\"}}]}}}}";
        QueryEntry entry = GGParser.fromJson(result, QueryEntry.class);

        Object[] infoNode = GGParser.get(entry, QueryEntry.class, "data/node");
        if ((infoNode == null) || (infoNode.length < 2)) {
            return;
        }
        Class infoNodeType = (Class) infoNode[0];
        Object infoNodeValue = infoNode[1];
        System.out.println("infoNodeType:" + infoNodeType);

        Object[] author = GGParser.get(infoNodeValue, infoNodeType, "author");
        if ((author == null) || (author.length < 2)) {
            return;
        }
        Class authorType = (Class) author[0];
        Object authorValue = author[1];
        System.out.println("authorType:" + authorType);

        Object[] authorId = GGParser.get(authorValue, authorType, "id/value");
        if ((authorId == null) || (authorId.length < 2)) {
            return;
        }
        Class authorIdType = (Class) authorId[0];
        Object authorIdValue = authorId[1];
        System.out.println("authorIdType:" + authorIdType + ", authorIdValue:" + authorIdValue);

        Object[] timelineNode = GGParser.get(infoNodeValue, infoNodeType, "timeline/edges[0]/node");
        if ((timelineNode == null) || (timelineNode.length < 2)) {
            return;
        }
        Class timelineNodeType = (Class) timelineNode[0];
        Object timelineNodeValue = timelineNode[1];
        System.out.println("timelineNodeType:" + timelineNodeType);

        Object[] timelineNodeId = GGParser.get(timelineNodeValue, timelineNodeType, "id/value");
        if ((timelineNodeId == null) || (timelineNodeId.length < 2)) {
            return;
        }
        Class timelineNodeIdType = (Class) timelineNodeId[0];
        Object timelineNodeIdValue = timelineNodeId[1];
        System.out.println("timelineNodeIdType:" + timelineNodeIdType + ", timelineNodeIdValue:" + timelineNodeIdValue);

//        String infoTypeName = (String) GGParser.get(entry, QueryEntry.class, "data/node/__typename")[1];
//        System.out.println("infoTypeName:" + infoTypeName);

//        String authorTypeName = (String) GGParser.get(entry, QueryEntry.class, "data/node/author/__typename")[1];
//        String userId = (String) GGParser.get(entry, QueryEntry.class, "data/node/author/id/value")[1];
//        System.out.println("authorTypeName:" + authorTypeName + ", userId:" + userId);

//        String timelineNodeTypeName = (String) GGParser.get(entry, QueryEntry.class, "data/node/timeline/edges[0]/node/__typename")[1];
//        String timelineNodeId = (String) GGParser.get(entry, QueryEntry.class, "data/node/timeline/edges[0]/node/id/value")[1];
//        System.out.println("timelineNodeTypeName:" + timelineNodeTypeName + ", timelineNodeId:" + timelineNodeId);
    }
}
