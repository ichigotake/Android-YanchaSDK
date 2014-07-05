package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoTwitterLoginApiEndpoint implements TwitterLoginApiEndpoint {

    private final ServerHost serverHost;
    private final TwitterLoginApiRequestParameter requestParameter;

    public DemoTwitterLoginApiEndpoint(ServerHost serverHost, TwitterLoginApiRequestParameter requestParameter) {
        this.serverHost = serverHost;
        this.requestParameter = requestParameter;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Uri getPath() {
        return serverHost.getHostUri().buildUpon()
                .appendQueryParameter(
                        LoginApiRequestParameterKey.CALLBACK_URL.getKey(),
                        requestParameter.getCallbackUrl().toString()
                )
                .appendQueryParameter(LoginApiRequestParameterKey.TOKEN_ONLY.getKey(), "1")
                .build();
    }
}
