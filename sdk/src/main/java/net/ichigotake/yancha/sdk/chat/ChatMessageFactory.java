package net.ichigotake.yancha.sdk.chat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * API level 1
 * 
 * {@link ChatMessage} を生成する
 */
public class ChatMessageFactory {
    
    private static ChatMessageFactory sInstance;
            
    private ChatMessageFactory() {}
    
    public static ChatMessageFactory getInstance() {
        if (sInstance == null) {
            sInstance = new ChatMessageFactory();
        }
        return sInstance;
    }

    public static ChatMessages createList(JSONArray response) throws JSONException {
        ChatMessages messages = new ChatMessages();
        int length = response.length();
        if (length > 0) {
            ChatMessageFactory factory = getInstance();
            for (int i=0; i<length; i++) {
                String string = response.get(i).toString();
                messages.add(factory.create(string));
            }
        }

        return messages;
    }
    /**
     * API level 1
     * 
     * JSON文字列から {@link ChatMessage} を生成する
     * 
     * @param jsonString
     * @return
     * @throws JSONException
     */
    public static ChatMessage create(String jsonString) throws JSONException {
        return getInstance().create(new JSONObject(jsonString));
    }
    
    /**
     * API level 1
     * 
     * {@link JSONObject} から {@link ChatMessage} を生成する
     * 
     * @param json
     * @return
     * @throws JSONException
     */
    public ChatMessage create(JSONObject json) throws JSONException {
        ArrayList<String> tags = new ArrayList<String>();
        JSONArray argsTags = json.getJSONArray("tags");
        int tagLength = argsTags.length();
        for (int i=0; i<tagLength; i++) {
            String tag = argsTags.getString(i);
            tags.add(tag);
        }

        ChatMessage message = new ChatMessageBuilder()
            .setId(json.getInt("id"))
            .setProfileImageUrl(json.getString("profile_image_url"))
            .setCreatedTime(json.getLong("created_at_ms") / 100)
            .setMessage(json.getString("text"))
            .setNickname(json.getString("nickname"))
            .setPlusplus(json.getInt("plusplus"))
            .setTags(tags)
            .setUserKey(json.getString("user_key"))
            .build();
            
        return message;
    }
}
