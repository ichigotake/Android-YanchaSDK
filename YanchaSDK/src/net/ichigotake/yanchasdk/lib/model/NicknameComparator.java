package net.ichigotake.yanchasdk.lib.model;

import java.util.Comparator;

/**
 * ニックネームの降順で比較する
 */
class NicknameComparator implements Comparator<ChatUser> {

    @Override
    public int compare(ChatUser s, ChatUser s2) {
        return s.getNickname().compareTo(s2.getNickname());
    }
}
