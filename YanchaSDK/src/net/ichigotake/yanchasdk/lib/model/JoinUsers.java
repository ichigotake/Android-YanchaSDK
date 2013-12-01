package net.ichigotake.yanchasdk.lib.model;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * チャットに参加しているユーザーの一覧
 */
public class JoinUsers {

    final private List<JoinUser> mUsers;

    public JoinUsers() {
        mUsers = new ArrayList<JoinUser>();
    }

    public void add(JoinUser user) {
        mUsers.add(user);
    }

    public int count() {
        return mUsers.size();
    }

    public void sort() {
        Collections.sort(mUsers, new NicknameComparator());
    }

    public List<JoinUser> toList() {
        return mUsers;
    }

}
