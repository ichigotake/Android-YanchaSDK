package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public interface Endpoint {

    HttpMethod getMethod();

    Uri getPath();
}
