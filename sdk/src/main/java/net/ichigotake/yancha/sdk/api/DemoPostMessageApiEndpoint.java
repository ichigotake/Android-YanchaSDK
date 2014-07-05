package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoPostMessageApiEndpoint implements PostMessageApiEndpoint {

    private final ServerHost serverHost;
    private final PostMessageApiRequestParameter requestParameter;

    public DemoPostMessageApiEndpoint(ServerHost serverHost, PostMessageApiRequestParameter requestParameter) {
        this.serverHost = serverHost;
        this.requestParameter = requestParameter;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Uri getPath() {
        return serverHost.getHostUri().buildUpon()
                .appendQueryParameter(
                        PostMessageApiRequestParameterKey.MESSAGE.getKey(),
                        requestParameter.getMessage()
                )
                .appendQueryParameter(
                        PostMessageApiRequestParameterKey.TOKEN.getKey(),
                        requestParameter.getToken()
                )
                .path("/api/post")
                .build();
    }
}
