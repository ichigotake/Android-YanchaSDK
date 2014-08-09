package net.ichigotake.yancha.sdk.chat;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public final class ChatMessageBuilder implements Parcelable {

    private int mMessageId;
    private int mPlusPlus;
    private long mCreatedTime;
    private String mUserKey;
    private String mNickname;
    private String mProfileImageUrl;
    private String mMessage;
    private ArrayList<String> mTags = new ArrayList<String>();

    public ChatMessage build() {
        return new ChatMessageImpl(this);
    }

    private static class ChatMessageImpl implements ChatMessage, Parcelable {

        private int mMessageId;
        private int mPlusPlus;
        private long mCreatedTime;
        private String mUserKey;
        private String mNickname;
        private String mProfileImageUrl;
        private String mMessage;
        private ArrayList<String> mTags;

        private ChatMessageImpl(ChatMessageBuilder builder) {
            this.mMessageId = builder.mMessageId;
            this.mPlusPlus = builder.mPlusPlus;
            this.mCreatedTime = builder.mCreatedTime;
            this.mUserKey = builder.mUserKey;
            this.mNickname = builder.mNickname;
            this.mProfileImageUrl = builder.mProfileImageUrl;
            this.mMessage = builder.mMessage;
            this.mTags = builder.mTags;
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
            return mPlusPlus;
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.mMessageId);
            dest.writeInt(this.mPlusPlus);
            dest.writeLong(this.mCreatedTime);
            dest.writeString(this.mUserKey);
            dest.writeString(this.mNickname);
            dest.writeString(this.mProfileImageUrl);
            dest.writeString(this.mMessage);
            dest.writeSerializable(this.mTags);
        }

        private ChatMessageImpl(Parcel in) {
            this.mMessageId = in.readInt();
            this.mPlusPlus = in.readInt();
            this.mCreatedTime = in.readLong();
            this.mUserKey = in.readString();
            this.mNickname = in.readString();
            this.mProfileImageUrl = in.readString();
            this.mMessage = in.readString();
            this.mTags = (ArrayList<String>) in.readSerializable();
        }

        public static final Creator<ChatMessageImpl> CREATOR = new Creator<ChatMessageImpl>() {
            public ChatMessageImpl createFromParcel(Parcel source) {
                return new ChatMessageImpl(source);
            }

            public ChatMessageImpl[] newArray(int size) {
                return new ChatMessageImpl[size];
            }
        };
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
        this.mPlusPlus = plusplus;
        return this;
    }

    public ChatMessageBuilder setMessage(String message) {
        this.mMessage = message;
        return this;
    }

    public ChatMessageBuilder setTags(ArrayList<String> tags) {
        this.mTags = tags;
        return this;
    }

    public ChatMessageBuilder setId(int id) {
        this.mMessageId = id;
        return this;
    }

    public ChatMessageBuilder() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mMessageId);
        dest.writeInt(this.mPlusPlus);
        dest.writeLong(this.mCreatedTime);
        dest.writeString(this.mUserKey);
        dest.writeString(this.mNickname);
        dest.writeString(this.mProfileImageUrl);
        dest.writeString(this.mMessage);
        dest.writeSerializable(this.mTags);
    }

    private ChatMessageBuilder(Parcel in) {
        this.mMessageId = in.readInt();
        this.mPlusPlus = in.readInt();
        this.mCreatedTime = in.readLong();
        this.mUserKey = in.readString();
        this.mNickname = in.readString();
        this.mProfileImageUrl = in.readString();
        this.mMessage = in.readString();
        this.mTags = (ArrayList<String>) in.readSerializable();
    }

    public static final Creator<ChatMessageBuilder> CREATOR = new Creator<ChatMessageBuilder>() {
        public ChatMessageBuilder createFromParcel(Parcel source) {
            return new ChatMessageBuilder(source);
        }

        public ChatMessageBuilder[] newArray(int size) {
            return new ChatMessageBuilder[size];
        }
    };
}
