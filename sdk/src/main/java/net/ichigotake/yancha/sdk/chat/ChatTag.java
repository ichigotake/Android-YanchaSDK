package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;

public interface ChatTag extends Serializable {

    public String getName();

    public String getFormattedName();
}
