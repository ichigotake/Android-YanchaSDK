package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoTwitterLoginApiRequestParameter implements TwitterLoginApiRequestParameter {

    private final Uri callbackUrl;

    public DemoTwitterLoginApiRequestParameter(Uri callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Override
    public Uri getCallbackUrl() {
        return callbackUrl;
    }
}
