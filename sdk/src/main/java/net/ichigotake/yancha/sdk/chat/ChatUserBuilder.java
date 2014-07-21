package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;

public class ChatUserBuilder implements Serializable {
    final private String mNickname;
    private String mProfileImageUrl;
    private String mProfileUrl;
    private String mUserKey;

    public ChatUserBuilder(String nickname, String userKey) {
        mNickname = nickname;
        mUserKey = userKey;
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

        @Override
        public String getUserKey() {
            return mUserKey;
        }

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
