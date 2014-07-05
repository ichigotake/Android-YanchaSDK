package net.ichigotake.yancha.sdk.api;

import android.net.Uri;
import android.text.TextUtils;

public class DemoSearchPostMessageApiEndpoint implements SearchPostMessageApiEndpoint {

    private final ServerHost serverHost;
    private final SearchPostMessageApiRequestParameter requestParameter;

    public DemoSearchPostMessageApiEndpoint(ServerHost serverHost, SearchPostMessageApiRequestParameter requestParameter) {
        this.serverHost = serverHost;
        this.requestParameter = requestParameter;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Uri getPath() {
        Uri.Builder builder = serverHost.getHostUri().buildUpon();
        if (requestParameter.getKeyword() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.KEYWORD.getKey(),
                    requestParameter.getKeyword()
            );
        }
        if (requestParameter.getTags() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.TAG.getKey(),
                    TextUtils.join(",", requestParameter.getTags().getList())
            );
        }
        if (requestParameter.getLimit() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.LIMIT.getKey(),
                    requestParameter.getLimit().toQueryStringValue()
            );
        }
        if (requestParameter.getOrderFields() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.ORDER.getKey(),
                    TextUtils.join(",", requestParameter.getOrderFields().getFieldList())
            );
        }
        if (requestParameter.getResponseFormat() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.FORMAT.getKey(),
                    requestParameter.getResponseFormat().getFormatName()
            );
        }
        if (requestParameter.getTimeRange() != null) {
            builder.appendQueryParameter(
                    SearchPostMessageApiRequestParameterKey.TIME.getKey(),
                    requestParameter.getTimeRange().getValue()
            );
        }
        return builder
                .path("/api/search")
                .build();
    }
}
