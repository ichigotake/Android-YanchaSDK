package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;

public interface ChatUser extends Serializable {

    String getProfileUrl();

    String getProfileImageUrl();

    String getNickname();
}
