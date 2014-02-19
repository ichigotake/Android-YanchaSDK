package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class LoginApiBuilder {

    final private Uri.Builder mBuilder;

    public LoginApiBuilder(Endpoint endpoint, String nickname) {
        mBuilder = new Uri.Builder()
                .path(endpoint.getPath())
                .appendQueryParameter("token_only", "1")
                .appendQueryParameter("nick", nickname);
    }

    public static LoginApiBuilder simple(String nickname) {
        return new LoginApiBuilder(BasicEndpoint.LOGIN_SIMPLE, nickname);
    }

    public static LoginApiBuilder twitter(String nickname) {
        return new LoginApiBuilder(BasicEndpoint.LOGIN_TWITTER, nickname);
    }

    public LoginApiBuilder setCallbackUrl(String callbackUrl) {
        mBuilder.appendQueryParameter("callback_url", callbackUrl);
        return this;
    }

    @Override
    public String toString() {
        return mBuilder.toString();
    }

}
