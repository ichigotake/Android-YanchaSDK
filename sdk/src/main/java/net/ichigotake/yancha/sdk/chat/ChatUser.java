package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;

public interface ChatUser extends Serializable {

    public static final String DEFAULT_PROFILE_IMAGE_PATH = "/static/img/nobody.png";

    String getProfileUrl();

    String getProfileImageUrl();

    String getNickname();
}
