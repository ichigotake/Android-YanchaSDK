package net.ichigotake.yancha.sdk.api;

public enum SearchPostMessageApiRequestParameterKey {

    ID("id"),
    TAG("tag"),
    KEYWORD("keyword"),
    TIME("time"),
    LIMIT("limit"),
    ORDER("order"),
    FORMAT("format"),
    ;

    private final String key;

    private SearchPostMessageApiRequestParameterKey(String key) {
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
