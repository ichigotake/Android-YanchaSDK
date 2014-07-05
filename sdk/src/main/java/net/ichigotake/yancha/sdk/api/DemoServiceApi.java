package net.ichigotake.yancha.sdk.api;

public class DemoServiceApi implements ServiceApi {

    private final ServerHost serverHost;

    public DemoServiceApi(ServerHost serverHost) {
        this.serverHost = serverHost;
    }

    @Override
    public SearchPostMessageApiEndpoint getSearchMessageApiEndpoint(SearchPostMessageApiRequestParameter requestParameter) {
        return new DemoSearchPostMessageApiEndpoint(serverHost, requestParameter);
    }

    @Override
    public PostMessageApiEndpoint getPostMessageApiEndpoint(PostMessageApiRequestParameter requestParameter) {
        return new DemoPostMessageApiEndpoint(serverHost, requestParameter);
    }

    @Override
    public UsersApiEndpoint getUsersApiEndpoint() {
        return new DemoUsersApiEndpoint(serverHost);
    }

    @Override
    public TagsApiEndpoint getTagsApiEndpoint() {
        return new DemoTagsApiEndpoint(serverHost);
    }
}
