package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ChatUsers implements Serializable {

    final private List<ChatUser> mUsers;

    public ChatUsers() {
        mUsers = new ArrayList<ChatUser>();
    }

    public ChatUsers(Collection<ChatUser> collection) {
        mUsers = new ArrayList<ChatUser>(collection);
    }

    public ChatUsers sort() {
        List<ChatUser> sortedUsers = mUsers;
        Collections.sort(sortedUsers, new NicknameComparator());
        return new ChatUsers(sortedUsers);
    }

    public void clear() {
        mUsers.clear();
    }

    public void remove(int location) {
        mUsers.remove(location);
    }

    public void add(ChatUser user) {
        mUsers.add(user);
    }

    public void addAll(Collection<ChatUser> collection) {
        mUsers.addAll(collection);
    }

    public int count() {
        return mUsers.size();
    }

    public List<ChatUser> toList() {
        return mUsers;
    }

    public ChatUser[] toArray() {
        return (ChatUser[])mUsers.toArray();
    }

    public ChatUser get(int location) {
        return mUsers.get(location);
    }

    public int size() {
        return mUsers.size();
    }

    public boolean isEmpty() {
        return mUsers.isEmpty();
    }

    public boolean contains(ChatUser item) {
        return mUsers.contains(item);
    }

    public boolean containsAll(Collection<ChatUser> collection) {
        return mUsers.containsAll(collection);
    }
}
