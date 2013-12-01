package net.ichigotake.yanchasdk.lib.model;

import java.util.Comparator;

/**
 * ニックネームの降順で比較する
 */
class NicknameComparator implements Comparator<JoinUser> {

    @Override
    public int compare(JoinUser s, JoinUser s2) {
        return s.getNickname().compareTo(s2.getNickname());
    }
}
