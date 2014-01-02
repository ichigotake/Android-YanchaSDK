package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;

public interface ChatUser extends Serializable {

    String getProfileUrl();

    String getProfileImageUrl();

    String getNickname();
}
