package net.ichigotake.yancha.sdk.api;

public interface Limit {

    int getOffset();

    int getLimit();

    String toQueryStringValue();

}
