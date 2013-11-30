package net.ichigotake.yanchasdk.model.test;

import java.util.Date;

import junit.framework.TestCase;

import net.ichigotake.yanchasdk.model.JoinTag;

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
