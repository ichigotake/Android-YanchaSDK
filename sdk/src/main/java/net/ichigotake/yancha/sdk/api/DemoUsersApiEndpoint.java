package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoUsersApiEndpoint implements UsersApiEndpoint {

    private final ServerHost serverHost;

    public DemoUsersApiEndpoint(ServerHost serverHost) {
        this.serverHost = serverHost;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Uri getPath() {
        return serverHost.getHostUri().buildUpon()
                .path("/api/user")
                .build();
    }
}
