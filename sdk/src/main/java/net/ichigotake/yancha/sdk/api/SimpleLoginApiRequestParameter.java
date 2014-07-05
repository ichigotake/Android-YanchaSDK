package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public interface SimpleLoginApiRequestParameter {

    String getNickname();

    Uri getCallbackUrl();
}
