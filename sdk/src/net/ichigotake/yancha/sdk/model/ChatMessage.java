package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;
import java.util.List;

/**
 * API level 1
 *
 * 投稿された発言
 */
public interface ChatMessage extends Serializable {

    public long getCreatedTime();

    public String getNickname();

    public String getProfileImageUrl();

    public String getUserKey();

    public int getPlusplus();

    public String getMessage();

    public List<String> getTags();

    public int getId();

}