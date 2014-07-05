package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoSimpleLoginApiEndpoint implements SimpleLoginApiEndpoint {

    private final ServerHost serverHost;
    private final SimpleLoginApiRequestParameter requestParameter;

    public DemoSimpleLoginApiEndpoint(ServerHost serverHost, SimpleLoginApiRequestParameter requestParameter) {
        this.serverHost = serverHost;
        this.requestParameter = requestParameter;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Uri getPath() {
        Uri.Builder builder = serverHost.getHostUri().buildUpon();
        if (requestParameter.getCallbackUrl() != null) {
            builder.appendQueryParameter(
                    LoginApiRequestParameterKey.CALLBACK_URL.getKey(),
                    requestParameter.getCallbackUrl().toString()
            );
        }
        return builder
                .appendQueryParameter(
                        LoginApiRequestParameterKey.NICKNAME.getKey(), requestParameter.getNickname()
                )
                .appendQueryParameter(LoginApiRequestParameterKey.TOKEN_ONLY.getKey(), "1")
                .path("/login")
                .build();
    }

}
