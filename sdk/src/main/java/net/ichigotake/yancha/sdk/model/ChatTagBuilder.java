package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;

/**
 * {@link ChatTag} を構築する
 */
public class ChatTagBuilder implements Serializable {
    final private String mName;

    public ChatTagBuilder(String name) {
        mName = name;
    }

    public ChatTag build() {
        return new ChatTagImpl();
    }

    private class ChatTagImpl implements ChatTag {

        @Override
        public String getName() {
            return mName;
        }

        @Override
        public String getFormattedName() {
            return "#" + getName();
        }
    }
}
