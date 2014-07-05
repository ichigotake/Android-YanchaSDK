package net.ichigotake.yancha.sdk.api;

public enum PostMessageApiRequestParameterKey {

    MESSAGE("message"),
    TOKEN("token"),
    ;

    private final String key;

    private PostMessageApiRequestParameterKey(String key) {
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
