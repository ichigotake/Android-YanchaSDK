package net.ichigotake.yancha.sdk.api;

public class DemoLoginApi implements LoginApi {

    private final ServerHost serverHost;

    public DemoLoginApi(ServerHost serverHost) {
        this.serverHost = serverHost;
    }

    @Override
    public SimpleLoginApiEndpoint getSimpleLoginApiEndpoint(SimpleLoginApiRequestParameter requestParameter) {
        return new DemoSimpleLoginApiEndpoint(serverHost, requestParameter);
    }

    @Override
    public TwitterLoginApiEndpoint getTwitterLoginApiEndpoint(TwitterLoginApiRequestParameter requestParameter) {
        return new DemoTwitterLoginApiEndpoint(serverHost, requestParameter);
    }
}
