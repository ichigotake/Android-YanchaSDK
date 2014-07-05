package net.ichigotake.yancha.sdk.api;

public interface LoginApi {

    SimpleLoginApiEndpoint getSimpleLoginApiEndpoint(SimpleLoginApiRequestParameter requestParameter);

    TwitterLoginApiEndpoint getTwitterLoginApiEndpoint(TwitterLoginApiRequestParameter requestParameter);
}
