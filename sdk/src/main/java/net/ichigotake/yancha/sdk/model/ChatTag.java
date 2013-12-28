package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;

/**
 * チャットで利用するタグ
 */
public interface ChatTag extends Serializable {

    public String getName();

    public String getFormattedName();
}
