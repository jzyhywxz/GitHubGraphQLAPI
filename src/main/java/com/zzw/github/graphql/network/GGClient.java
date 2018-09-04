package com.zzw.github.graphql.network;

import com.zzw.tools.network.HttpAgent;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import java.io.IOException;

/**
 * Created by zzw on 2018/6/9.
 */
public class GGClient {
    private HttpAgent mHttpAgent = new HttpAgent();
    private String mRootEndpoint;
    private String mAccessToken;

    public GGClient(String rootEndpoint, String accessToken) {
        this.mRootEndpoint = rootEndpoint;
        this.mAccessToken = accessToken;
    }

    public void connect(String payload, boolean withGzip) throws IOException {
        mHttpAgent.setHeader(new String[]{
                "Accept", "*/*",
                "Connection", "keep-alive",
                "Content-Length", String.valueOf(payload.length()),
                "Authorization", "bearer " + mAccessToken
        });
        if (withGzip) {
            mHttpAgent.addHeader(new String[]{
                    "Accept-Encoding", "gzip, deflate, br"
            });
        }

        RequestBody requestBody = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), payload);
        mHttpAgent.connect4post(mRootEndpoint, requestBody);
    }

    public void disconnect() {
        mHttpAgent.disconnect();
    }

    public String result() throws IOException {
        return mHttpAgent.rawHtml();
    }
}
