package net.ichigotake.yancha.sdk.api;

public interface ServiceApi {

    SearchPostMessageApiEndpoint getSearchMessageApiEndpoint(SearchPostMessageApiRequestParameter requestParameter);

    PostMessageApiEndpoint getPostMessageApiEndpoint(PostMessageApiRequestParameter requestParameter);

    UsersApiEndpoint getUsersApiEndpoint();

    TagsApiEndpoint getTagsApiEndpoint();
}
