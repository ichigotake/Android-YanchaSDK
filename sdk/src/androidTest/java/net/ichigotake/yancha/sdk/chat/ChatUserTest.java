package net.ichigotake.yancha.sdk.chat;

import junit.framework.TestCase;

/**
 * Testing for {@link ChatUser}
 */
public class ChatUserTest extends TestCase {

    private String getNickname() {
        return "Tester";
    }

    private String getProfileUrl() {
        return "http://my-home/profile";
    }

    private String getProfileImageUrl() {
        return "http://my-home/img/profile.png";
    }

    public void testBuild() {
        ChatUser user = new ChatUserBuilder(getNickname())
                .setProfileUrl(getProfileUrl())
                .setProfileImageUrl(getProfileImageUrl())
                .build();

        assertEquals(user.getNickname(), getNickname());
        assertEquals(user.getProfileUrl(), getProfileUrl());
        assertEquals(user.getProfileImageUrl(), getProfileImageUrl());
    }
}
