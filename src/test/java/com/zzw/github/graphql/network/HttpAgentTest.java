package com.zzw.github.graphql.network;

import com.zzw.tools.io.OkTextReader;
import com.zzw.tools.network.HttpAgent;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zzw on 2018/6/9.
 */
public class HttpAgentTest {
//    @Test
    public void testGetMethod() {
        HttpAgent httpAgent = new HttpAgent();
        httpAgent.setHeader(new String[]{ "Accept-Encoding", "gzip, deflate, br" });
        String url = "https://developer.github.com/v4/";

        try {
            httpAgent.connect4get(url);
            System.out.println("=== Request Headers ===");
            httpAgent.printHeaders(httpAgent.getRequestHeaders());
            System.out.println("=== Response Headers ===");
            httpAgent.printHeaders(httpAgent.getResponseHeaders());
            System.out.println("=== Raw Html ===");
            String rawHtml = httpAgent.rawHtml();
            System.out.println(rawHtml);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpAgent.disconnect();
        }
    }

//    @Test
    public void testPostMethod() {
        String rootEndpoint = "https://api.github.com/graphql";
        OkTextReader reader = new OkTextReader();
        reader.open("F:\\JetBrains\\IntelliJIdea\\access_token.txt");
        String accessToken = reader.readLine();
        reader.close();
        String payload = "{\"query\":\"query{\\n  viewer{\\n    login\\n  }\\n}\",\"variables\":{}}";

        HttpAgent httpAgent = new HttpAgent();
        httpAgent.setHeader(new String[]{
                "Accept", "*/*",
                "Accept-Encoding", "gzip, deflate, br",
                "Connection", "keep-alive",
                "Content-Length", String.valueOf(payload.length()),
                "Authorization", "bearer " + accessToken
        });

        try {
            httpAgent.connect4post(rootEndpoint, RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"), payload));

            System.out.println("=== Request Headers ===");
            httpAgent.printHeaders(httpAgent.getRequestHeaders());
            System.out.println("=== Response Headers ===");
            httpAgent.printHeaders(httpAgent.getResponseHeaders());
            System.out.println("=== Raw Html ===");
            String rawHtml = httpAgent.rawHtml();
            System.out.println(rawHtml);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpAgent.disconnect();
        }
    }
}
