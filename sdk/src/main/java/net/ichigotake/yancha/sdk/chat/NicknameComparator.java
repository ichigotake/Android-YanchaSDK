package net.ichigotake.yancha.sdk.chat;

import java.util.Comparator;

class NicknameComparator implements Comparator<ChatUser> {

    @Override
    public int compare(ChatUser s, ChatUser s2) {
        return s.getNickname().compareTo(s2.getNickname());
    }
}
