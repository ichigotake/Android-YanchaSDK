package net.ichigotake.yancha.sdk.api;

import net.ichigotake.yancha.sdk.chat.ChatTags;

/**
 * TODO: newer,olderのインターフェース
 */
public interface SearchPostMessageApiRequestParameter {

    SearchPostMessageResponseFormat getResponseFormat();

    SearchPostMessageOrderFields getOrderFields();

    String getKeyword();

    Limit getLimit();

    TimeRange getTimeRange();

    ChatTags getTags();

}
