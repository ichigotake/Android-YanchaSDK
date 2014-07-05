package net.ichigotake.yancha.sdk.api;

public enum LoginApiRequestParameterKey {

    NICKNAME("nick"),
    TOKEN_ONLY("token_only"),
    CALLBACK_URL("callback_url"),
    ;

    private final String key;

    private LoginApiRequestParameterKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
