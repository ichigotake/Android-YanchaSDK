package net.ichigotake.yanchasdk.lib.model;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * チャットに参加しているユーザーの一覧
 */
public class JoinUsers {

    final private List<ChatUser> mUsers;

    public JoinUsers() {
        mUsers = new ArrayList<ChatUser>();
    }

    public void add(ChatUser user) {
        mUsers.add(user);
    }

    public int count() {
        return mUsers.size();
    }

    public void sort() {
        Collections.sort(mUsers, new NicknameComparator());
    }

    public JoinUsers excludeMyself(ChatUser own) {
        JoinUsers users = new JoinUsers();
        String ownNickname = own.getNickname();
        for (ChatUser user : toList()) {
            if (! ownNickname.equals(user.getNickname())) {
                users.add(user);
            }
        }
        return users;
    }

    public List<ChatUser> toList() {
        return mUsers;
    }

}
