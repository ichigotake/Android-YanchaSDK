package net.ichigotake.yanchasdk.model.test;

import junit.framework.TestCase;

import net.ichigotake.yanchasdk.model.PostMessage;
import net.ichigotake.yanchasdk.model.PostMessageFactory;

import org.json.JSONException;

/**
 * Testing for {@link PostMessageFactory}
 */
public class PostMessageFactoryTest extends TestCase {

    private String getJSONString() {
        return "{\"tags\":[\"PUBLIC\"],\"plusplus\":2,\"id\":\"167741\",\"text\":\"#PUBLIC おはよう！\",\"profile_url\":\"https:\\/\\/twitter.com\\/#!\\/ichigotake\",\"nickname\":\"ichigotake\",\"user_key\":\"twitter:150657117\",\"is_message_log\":false,\"created_at_ms\":138271774824573,\"profile_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_images\\/3778759794\\/cf55ba56ebf29483039dbe73b63a1452_normal.png\"}";
    }
    
    public void testCreateFromJSONString() {
        try {
            PostMessage message = PostMessageFactory.create(getJSONString());
            assertEquals(message.getMessage(), "#PUBLIC おはよう！");
            assertEquals(message.getPlusplus(), 2);
            assertEquals(message.getId(), 167741);
            assertEquals(message.getNickname(), "ichigotake");
            assertEquals(message.getUserKey(), "twitter:150657117");
            assertEquals(message.getProfileImageUrl(), "http://a0.twimg.com/profile_images/3778759794/cf55ba56ebf29483039dbe73b63a1452_normal.png");
        } catch (JSONException e) {
            return ;
        }
        assertTrue(true);
    }
    
    public void testThrowJSONExceptionByInvalidJSONString() {
        try {
            PostMessageFactory.create("invalid json string");
        } catch (JSONException e) {
            assertTrue(true);
            return ;
        }
        assertTrue(false);
    }
}
