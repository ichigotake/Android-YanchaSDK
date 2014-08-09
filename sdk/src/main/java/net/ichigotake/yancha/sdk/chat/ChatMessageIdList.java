package net.ichigotake.yancha.sdk.chat;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * 発言のIDリストを扱う
 */
public class ChatMessageIdList extends ArrayList<Integer> implements Parcelable {

    public ChatMessageIdList() {
        super();
    }

    public ChatMessageIdList(Collection<? extends Integer> collection) {
        super(collection);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.modCount);
    }

    private ChatMessageIdList(Parcel in) {
        this.modCount = in.readInt();
    }

    public static final Creator<ChatMessageIdList> CREATOR = new Creator<ChatMessageIdList>() {
        public ChatMessageIdList createFromParcel(Parcel source) {
            return new ChatMessageIdList(source);
        }

        public ChatMessageIdList[] newArray(int size) {
            return new ChatMessageIdList[size];
        }
    };
}
