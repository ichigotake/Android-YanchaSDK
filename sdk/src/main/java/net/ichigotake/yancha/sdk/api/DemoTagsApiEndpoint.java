package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoTagsApiEndpoint implements TagsApiEndpoint {

    private final ServerHost serverHost;

    public DemoTagsApiEndpoint(ServerHost serverHost) {
        this.serverHost = serverHost;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Uri getPath() {
        return serverHost.getHostUri();
    }
}
