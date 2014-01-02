package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * チャットに参加しているユーザーの一覧
 */
public class ChatUsers implements Serializable, MutableList<ChatUser> {

    final private List<ChatUser> mUsers;

    public ChatUsers() {
        mUsers = new ArrayList<ChatUser>();
    }

    public ChatUsers(Collection<ChatUser> collection) {
        mUsers = new ArrayList<ChatUser>(collection);
    }

    public ChatUsers(MutableList<ChatUser> users) {
        mUsers = users.toList();
    }

    public ChatUsers sort() {
        List<ChatUser> sortedUsers = mUsers;
        Collections.sort(sortedUsers, new NicknameComparator());
        return new ChatUsers(sortedUsers);
    }

    public ChatUsers excludeMyself(ChatUser own) {
        ChatUsers users = new ChatUsers();

        String ownNickname = own.getNickname();
        for (ChatUser user : toList()) {
            if (! ownNickname.equals(user.getNickname())) {
                users.add(user);
            }
        }

        return users;
    }

    @Override
    public void clear() {
        mUsers.clear();
    }

    @Override
    public void remove(int location) {
        mUsers.remove(location);
    }

    @Override
    public void add(ChatUser user) {
        mUsers.add(user);
    }

    @Override
    public void addAll(Collection<ChatUser> collection) {
        mUsers.addAll(collection);
    }

    @Override
    public void addAll(MutableList<ChatUser> list) {
        mUsers.addAll(list.toList());
    }

    public int count() {
        return mUsers.size();
    }

    @Override
    public List<ChatUser> toList() {
        return mUsers;
    }

    @Override
    public ChatUser[] toArray() {
        return (ChatUser[])mUsers.toArray();
    }

    @Override
    public ChatUser get(int location) {
        return mUsers.get(location);
    }

    @Override
    public int size() {
        return mUsers.size();
    }

    @Override
    public boolean isEmpty() {
        return mUsers.isEmpty();
    }

    @Override
    public boolean contains(ChatUser item) {
        return mUsers.contains(item);
    }

    @Override
    public boolean containsAll(Collection<ChatUser> collection) {
        return mUsers.containsAll(collection);
    }
}
