package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class UserApiBuilder implements ApiBuilder {

    final private Uri.Builder mBuilder;

    public UserApiBuilder() {
        this(BasicEndpoint.USER);
    }

    public UserApiBuilder(Endpoint endpoint) {
        mBuilder = new Uri.Builder().path(endpoint.getPath());
    }

    @Override
    public Uri.Builder get() {
        return mBuilder;
    }

    @Override
    public String toString() {
        return mBuilder.toString();
    }
}
