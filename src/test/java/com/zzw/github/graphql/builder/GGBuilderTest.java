package com.zzw.github.graphql.builder;

import org.junit.Test;

/**
 * Created by zzw on 2018/6/10.
 */
public class GGBuilderTest {
//    @Test
    public void testWithoutVariableAndArgument() {
        GGBuilder builder = new GGBuilder("query");
        builder.m("viewer/name,login");
        System.out.println("=== VISUALIZE ===");
        System.out.println(builder.visualize());
        System.out.println("=== SERIALIZE ===");
        System.out.println(builder.serialize());
    }

//    @Test
    public void testWithoutVariableAndWithArgument() {
        GGBuilder builder = new GGBuilder("query");
        builder.m("repository[@owner='\"mrdoob\"',@name='\"three.js\"']").
                f("issues[@first='3',@states='CLOSED']/edges/node/title,bodyText").
                f("pullRequests[@first='3',@states='OPEN']/edges/node/title,bodyText");
        System.out.println("=== VISUALIZE ===");
        System.out.println(builder.visualize());
        System.out.println("=== SERIALIZE ===");
        System.out.println(builder.serialize());
    }

//    @Test
    public void testPreviousAndCurrentLevel() {
        GGBuilder builder = new GGBuilder("query");
        builder.m("./viewer/name/../login");
        System.out.println("=== VISUALIZE ===");
        System.out.println(builder.visualize());
        System.out.println("=== SERIALIZE ===");
        System.out.println(builder.serialize());
    }

//    @Test
    public void testDuplication() {
        GGBuilder builder = new GGBuilder("query");
        builder.m("repository[@owner='\"mrdoob\"',@name='\"three.js\"']").
                f("issues[@first='3',@states='CLOSED']/edges/node/title,bodyText").
                f("pullRequests[@first='3',@states='OPEN']/edges/node/title,bodyText").
                f("issues[@first='3',@states='OPEN']/edges/node/title,bodyText").
                f("pullRequests[@first='3',@states='CLOSED']/edges/node/title,bodyText");
        System.out.println("=== VISUALIZE ===");
        System.out.println(builder.visualize());
        System.out.println("=== SERIALIZE ===");
        System.out.println(builder.serialize());
    }

//    @Test
    public void testDifficulty() {
        GGBuilder builder = new GGBuilder("query");

        String owner = "mrdoob";
        String name = "three.js";
        GraphQLNode pageInfoNode = GGBuilder.newNode("pageInfo/startCursor,endCursor,hasPreviousPage,hasNextPage");

        builder.m("repository[@owner='\"" + owner + "\"',@name='\"" + name + "\"']").
                f("owner/login,url").
                f("name,description,url,homepageUrl,createdAt,pushedAt,forkCount,isArchived,isFork,isPrivate,isMirror,mirrorUrl,isLocked,lockReason").
                save().
                m("commitComments[@last='1']/edges/node/commit/history[@first='1']").
                save().
                m("edges/cursor,node").
                f("author/name,date,user/login").
                f("committer/name,date,user/login").
                f("message,authoredDate,committedDate,pushedDate,tarballUrl,zipballUrl,treeUrl,commitUrl,url").
                restore().
                f(pageInfoNode).
                f("totalCount").
                restore().
                save().
                m("repositoryTopics[@first='100']").
                save().
                m("edges/cursor,node/url,topic/name").
                restore().
                f(pageInfoNode).
                f("totalCount").
                restore().
                f("primaryLanguage/name").
                save().
                m("languages[@first='100']").
                save().
                m("edges/cursor,size,node/name").
                restore().
                f(pageInfoNode).
                f("totalCount").
                f("totalSize").
                restore().
                save().
                m("licenseInfo").
                f("name,nickname,key,spdxId,description,body,url,implementation").
                f("conditions/description,key,label").
                f("permissions/description,key,label").
                f("limitations/description,key,label").
                restore();
        System.out.println("=== VISUALIZE ===");
        System.out.println(builder.visualize());
        System.out.println("=== SERIALIZE ===");
        System.out.println(builder.serialize());
    }
}
