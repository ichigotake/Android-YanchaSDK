package net.ichigotake.yancha.sdk.model;

/**
 * {@link ChatTag} を構築する
 */
public class ChatTagBuilder {
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
    }
}
