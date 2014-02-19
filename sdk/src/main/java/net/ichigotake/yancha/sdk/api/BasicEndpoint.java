package net.ichigotake.yancha.sdk.api;

public enum BasicEndpoint implements Endpoint {

    LOGIN_SIMPLE("/login"),
    LOGIN_TWITTER("/login/twitter/start"),
    POST("/api/post"),
    SEARCH("/api/search"),
    TAG("/api/tag"),
    USER("/api/users"),
    ;

    final private String mPath;

    private BasicEndpoint(String path) {
        mPath = path;
    }

    @Override
    public String getPath() {
        return mPath;
    }

    @Override
    public String toString() {
        return getPath();
    }
}
