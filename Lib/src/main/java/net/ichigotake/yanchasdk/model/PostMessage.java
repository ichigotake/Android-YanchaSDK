package net.ichigotake.yanchasdk.model;

import java.util.List;

/**
 * API level 1
 * 
 * 投稿された発言
 */
public class PostMessage {
    
    final private String defaultProfileImageUrl = "/static/img/nobody.png";

    final private int mMessageId;

    final private int mPlusplus;

    final private long mCreatedTime;

    final private String mUserKey;

    final private String mNickname;

    final private String mProfileImageUrl;

    final private String mMessage;

    final private List<String> mTags;

    private PostMessage(PostMessageBuilder builder) {
        mMessageId = builder.mMessageId;
        mPlusplus = builder.mPlusplus;
        mCreatedTime = builder.mCreatedTime;
        mUserKey = builder.mUserKey;
        mNickname = builder.mNickname;
        mProfileImageUrl = builder.mProfileImageUrl;
        mMessage = builder.mMessage;
        mTags = builder.mTags;
    }

    public long getCreatedTime() {
        return mCreatedTime;
    }

    public String getNickname() {
        return mNickname;
    }

    public String getProfileImageUrl() {
        return mProfileImageUrl;
    }

    public String getDefaultProfileImageUrl() {
        return defaultProfileImageUrl;
    }

    public String getUserKey() {
        return mUserKey;
    }

    public int getPlusplus() {
        return mPlusplus;
    }

    public String getMessage() {
        return mMessage;
    }

    public List<String> getTags() {
        return mTags;
    }

    public int getId() {
        return mMessageId;
    }

    /**
     * API level 1
     *
     * {@link PostMessage} をビルドする
     */
    public static class PostMessageBuilder {

        private int mMessageId;

        private int mPlusplus;

        private long mCreatedTime;

        private String mUserKey;

        private String mNickname;

        private String mProfileImageUrl;

        private String mMessage;

        private List<String> mTags;

        public PostMessage build() {
            return new PostMessage(this);
        }

        public PostMessageBuilder setCreatedTime(long createdTime) {
            this.mCreatedTime = createdTime;
            return this;
        }

        public PostMessageBuilder setNickname(String nickname) {
            this.mNickname = nickname;
            return this;
        }

        public PostMessageBuilder setProfileImageUrl(String profileImageUrl) {
            this.mProfileImageUrl = profileImageUrl;
            return this;
        }

        public PostMessageBuilder setUserKey(String userKey) {
            this.mUserKey = userKey;
            return this;
        }

        public PostMessageBuilder setPlusplus(int plusplus) {
            this.mPlusplus = plusplus;
            return this;
        }

        public PostMessageBuilder setMessage(String message) {
            this.mMessage = message;
            return this;
        }

        public PostMessageBuilder setTags(List<String> tags) {
            this.mTags = tags;
            return this;
        }

        public PostMessageBuilder setId(int id) {
            this.mMessageId = id;
            return this;
        }

    }
}
