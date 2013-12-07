package net.ichigotake.yanchasdk.lib.model;

import junit.framework.TestCase;

import java.util.Date;

public class ChatTagTest extends TestCase {

    private String getTag() {
        return "PUBLIC";
    }
    
    public void testAddTag() {
        ChatTag tag = new ChatTag(getTag());
        assertEquals(getTag(), tag.getName());
        assertEquals(tag.getLastUpdatedTime().getTime(), new Date(0).getTime());
    }
}
