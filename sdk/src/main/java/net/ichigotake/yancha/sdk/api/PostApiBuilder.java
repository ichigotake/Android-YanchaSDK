package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class PostApiBuilder implements ApiBuilder {

    final private Uri.Builder mBuilder;

    public PostApiBuilder(String token, String message) {
        this(BasicEndpoint.POST, token, message);
    }

    public PostApiBuilder(Endpoint endpoint, String token, String message) {
        mBuilder = new Uri.Builder()
                .path(endpoint.getPath())
                .appendQueryParameter("token", token)
                .appendQueryParameter("message", message);
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
