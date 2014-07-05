package net.ichigotake.yancha.sdk.chat;

import junit.framework.TestCase;

import java.util.List;
import java.util.ArrayList;

/**
 * Testing for {@link ChatUserTest}
 */
public class ChatUsersTest extends TestCase {

    private List<String> getNicknames() {
        List<String> nicknames = new ArrayList<String>();
        nicknames.add("himeko");
        nicknames.add("963");
        nicknames.add("miyako");
        nicknames.add("rei");

        return nicknames;
    }

    private List<String> getSortedNicknames() {
        List<String> nicknames = new ArrayList<String>();
        nicknames.add("963");
        nicknames.add("himeko");
        nicknames.add("miyako");
        nicknames.add("rei");

        return nicknames;
    }



    private ChatUser build(String nickname) {
        return new ChatUserBuilder(nickname).build();
    }

    public void testBuild() {
        ChatUsers users = new ChatUsers();

        List<String> nicknames = getNicknames();
        for (String nickname : nicknames) {
            users.add(build(nickname));
        }

        for (int i=0, count=users.count(); i<count; i++) {
            String get = users.get(i).getNickname();
            String expect = nicknames.get(i);
            assertEquals(get, expect);
        }
    }

    public void testSort() {
        ChatUsers users = new ChatUsers();

        List<String> nicknames = getNicknames();
        for (String nickname : nicknames) {
            users.add(build(nickname));
        }

        ChatUsers sortedUsers = users.sort();

        List<String> expectNicknames = getSortedNicknames();
        for (int i=0, count=users.count(); i<count; i++) {
            String get = sortedUsers.get(i).getNickname();
            String expect = expectNicknames.get(i);
            assertEquals(get, expect);
        }
    }
}
