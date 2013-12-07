package net.ichigotake.yanchasdk.lib.model;

/**
 * チャットに参加しているユーザー
 */
public class JoinUser implements ChatUser {

    final private String mNickname;
    final private String mProfileImageUrl;
    final private String mProfileUrl;

    private JoinUser(JoinUserBuilder builder) {
        mNickname = builder.mNickname;
        mProfileUrl = builder.mProfileUrl;
        mProfileImageUrl = builder.mProfileImageUrl;
    }

    public static class JoinUserBuilder {
        private String mNickname;
        private String mProfileUrl;
        private String mProfileImageUrl;

        public ChatUser build() {
            return new JoinUser(this);
        }

        public JoinUserBuilder setNickname(String nickname) {
            mNickname = nickname;
            return this;
        }

        public JoinUserBuilder setProfileUrl(String profile) {
            mProfileUrl = profile;
            return this;
        }

        public JoinUserBuilder setProfileImageUrl(String image) {
            mProfileImageUrl = image;
            return this;
        }

    }

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
