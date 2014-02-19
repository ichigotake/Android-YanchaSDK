package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class TagApiBuilder {

    final private Uri.Builder mBuilder;

    public TagApiBuilder() {
        this(BasicEndpoint.TAG);
    }

    public TagApiBuilder(Endpoint endpoint) {
        mBuilder = new Uri.Builder().path(endpoint.getPath());
    }

    public Uri.Builder get() {
        return mBuilder;
    }

    @Override
    public String toString() {
        return mBuilder.toString();
    }
}
