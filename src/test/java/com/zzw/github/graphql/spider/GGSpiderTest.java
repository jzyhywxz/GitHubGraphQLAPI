package com.zzw.github.graphql.spider;

import org.junit.Test;

/**
 * Created by zzw on 2018/6/10.
 */
public class GGSpiderTest {
//    @Test
    public void testGitHubGraphQLSpider() {
        GGSpider.main(new String[]{
                "https://developer.github.com/v4/",
                "C:/Users/zzw/Desktop/GitHubGraphQLAPI/",
        });
    }
}
