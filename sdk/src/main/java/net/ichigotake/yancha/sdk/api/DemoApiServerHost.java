package net.ichigotake.yancha.sdk.api;

import android.net.Uri;

public class DemoApiServerHost implements ServerHost {

    @Override
    public Uri getHostUri() {
        return new Uri.Builder()
                .scheme("http")
                .authority("yancha.hachiojipm.org")
                .build();
    }

}
