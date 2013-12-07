package net.ichigotake.yanchasdk.lib.model;

import junit.framework.TestCase;

import java.util.Date;

public class JoinTagTest extends TestCase {

    private String getTag() {
        return "PUBLIC";
    }
    
    public void testAddTag() {
        JoinTag tag = new JoinTag(getTag());
        assertEquals(getTag(), tag.getName());
        assertEquals(tag.getLastUpdatedTime().getTime(), new Date(0).getTime());
    }
}
