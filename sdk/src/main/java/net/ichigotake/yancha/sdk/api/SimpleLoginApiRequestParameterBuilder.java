package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class SimpleLoginApiRequestParameterBuilder {

    private final String nickname;
    private Uri callbackUri;

    public SimpleLoginApiRequestParameterBuilder(String nickname) {
        this.nickname = nickname;
    }

    public SimpleLoginApiRequestParameter build() {
        return new SimpleLoginApiRequestParameterImpl(this);
    }

    private static class SimpleLoginApiRequestParameterImpl implements SimpleLoginApiRequestParameter {

        private final String nickname;
        private final Uri callbackUri;

        public SimpleLoginApiRequestParameterImpl(SimpleLoginApiRequestParameterBuilder builder) {
            this.nickname = builder.nickname;
            this.callbackUri = builder.callbackUri;
        }

        @Override
        public String getNickname() {
            return nickname;
        }

        @Override
        public Uri getCallbackUrl() {
            return callbackUri;
        }
    }

    public SimpleLoginApiRequestParameterBuilder setCallbackUri(Uri callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

}
