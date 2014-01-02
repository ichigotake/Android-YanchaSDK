package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;

/**
 * API level 1
 *
 * {@link ChatUser} を構築する
 */
public class ChatUserBuilder implements Serializable {
    final private String mNickname;
    private String mProfileImageUrl;
    private String mProfileUrl;

    public ChatUserBuilder(String nickname) {
        mNickname = nickname;
    }

    public ChatUser build() {
        return new CharUserImpl();
    }

    private class CharUserImpl implements ChatUser {

        @Override
        public String getProfileUrl() {
            return mProfileUrl;
        }

        @Override
        public String getProfileImageUrl() {
            return mProfileImageUrl;
        }

        @Override
        public String getNickname() {
            return mNickname;
        }

        /**
         * ニックネームを返す
         */
        @Override
        public String toString() {
            return getNickname();
        }
    }

    public ChatUserBuilder setProfileUrl(String profile) {
        mProfileUrl = profile;
        return this;
    }

    public ChatUserBuilder setProfileImageUrl(String image) {
        mProfileImageUrl = image;
        return this;
    }

}
