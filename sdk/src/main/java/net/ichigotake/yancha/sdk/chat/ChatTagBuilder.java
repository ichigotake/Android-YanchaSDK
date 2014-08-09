package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;

public class ChatTagBuilder implements Serializable {

    private final String name;

    public ChatTagBuilder(String name) {
        this.name = name;
    }

    public ChatTag build() {
        return new ChatTagImpl(this);
    }

    private static class ChatTagImpl implements ChatTag {

        private final String name;

        public ChatTagImpl(ChatTagBuilder builder) {
            this.name = builder.name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getFormattedName() {
            return "#" + name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
