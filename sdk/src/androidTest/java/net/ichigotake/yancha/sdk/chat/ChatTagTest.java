package net.ichigotake.yancha.sdk.chat;

import junit.framework.TestCase;

public class ChatTagTest extends TestCase {

    private String getTag() {
        return "PUBLIC";
    }
    
    public void testAddTag() {
        ChatTag tag = new ChatTagBuilder(getTag()).build();
        assertEquals(getTag(), tag.getName());
    }
}
