package net.ichigotake.yancha.sdk.chat;

import android.os.Parcelable;

public interface ChatUser extends Parcelable {

    public static final String DEFAULT_PROFILE_IMAGE_PATH = "/static/img/nobody.png";

    String getProfileUrl();

    String getProfileImageUrl();

    String getNickname();

    String getUserKey();
}
