package net.ichigotake.yancha.sdk.chat;

import android.os.Parcel;

public class ChatUserBuilder {

    final private String nickname;
    private String profileImageUrl;
    private String profileUrl;
    private String userKey;

    public ChatUserBuilder(String nickname) {
        this.nickname = nickname;
    }

    public ChatUser build() {
        return new CharUserImpl(this);
    }

    private static class CharUserImpl implements ChatUser, android.os.Parcelable {

        private final String nickname;
        private final String profileImageUrl;
        private final String profileUrl;
        private final String userKey;

        private CharUserImpl(ChatUserBuilder builder) {
            this.nickname = builder.nickname;
            this.profileImageUrl = builder.profileImageUrl;
            this.profileUrl = builder.profileUrl;
            this.userKey = builder.userKey;
        }

        @Override
        public String getProfileUrl() {
            return profileUrl;
        }

        @Override
        public String getProfileImageUrl() {
            return profileImageUrl;
        }

        @Override
        public String getNickname() {
            return nickname;
        }

        @Override
        public String getUserKey() {
            return userKey;
        }

        @Override
        public String toString() {
            return nickname;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.nickname);
            dest.writeString(this.profileImageUrl);
            dest.writeString(this.profileUrl);
            dest.writeString(this.userKey);
        }

        private CharUserImpl(Parcel in) {
            this.nickname = in.readString();
            this.profileImageUrl = in.readString();
            this.profileUrl = in.readString();
            this.userKey = in.readString();
        }

        public static final Creator<CharUserImpl> CREATOR = new Creator<CharUserImpl>() {
            public CharUserImpl createFromParcel(Parcel source) {
                return new CharUserImpl(source);
            }

            public CharUserImpl[] newArray(int size) {
                return new CharUserImpl[size];
            }
        };
    }

    public ChatUserBuilder setProfileUrl(String profile) {
        profileUrl = profile;
        return this;
    }

    public ChatUserBuilder setProfileImageUrl(String image) {
        profileImageUrl = image;
        return this;
    }

    public ChatUserBuilder setUserKey(String userKey) {
        this.userKey = userKey;
        return this;
    }

}
