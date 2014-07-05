package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;
import java.util.List;

/**
 * API level 1
 *
 * {@link ChatMessage} を構築する
 */
public class ChatMessageBuilder implements Serializable {
    private int mMessageId;
    private int mPlusplus;
    private long mCreatedTime;
    private String mUserKey;
    private String mNickname;
    private String mProfileImageUrl;
    private String mMessage;
    private List<String> mTags;

    public ChatMessage build() {
        return new ChatMessageImpl();
    }

    private class ChatMessageImpl implements ChatMessage {

        private ChatMessageImpl() {

        }

        @Override
        public long getCreatedTime() {
            return mCreatedTime;
        }

        @Override
        public String getNickname() {
            return mNickname;
        }

        @Override
        public String getProfileImageUrl() {
            return mProfileImageUrl;
        }

        @Override
        public String getUserKey() {
            return mUserKey;
        }

        @Override
        public int getPlusplus() {
            return mPlusplus;
        }

        @Override
        public String getMessage() {
            return mMessage;
        }

        @Override
        public List<String> getTags() {
            return mTags;
        }

        @Override
        public int getId() {
            return mMessageId;
        }

    }
    public ChatMessageBuilder setCreatedTime(long createdTime) {
        this.mCreatedTime = createdTime;
        return this;
    }

    public ChatMessageBuilder setNickname(String nickname) {
        this.mNickname = nickname;
        return this;
    }

    public ChatMessageBuilder setProfileImageUrl(String profileImageUrl) {
        this.mProfileImageUrl = profileImageUrl;
        return this;
    }

    public ChatMessageBuilder setUserKey(String userKey) {
        this.mUserKey = userKey;
        return this;
    }

    public ChatMessageBuilder setPlusplus(int plusplus) {
        this.mPlusplus = plusplus;
        return this;
    }

    public ChatMessageBuilder setMessage(String message) {
        this.mMessage = message;
        return this;
    }

    public ChatMessageBuilder setTags(List<String> tags) {
        this.mTags = tags;
        return this;
    }

    public ChatMessageBuilder setId(int id) {
        this.mMessageId = id;
        return this;
    }

}
