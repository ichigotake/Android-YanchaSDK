package net.ichigotake.yancha.sdk.model;

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
        return create(new JSONObject(jsonString));
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
    public static ChatMessage create(JSONObject json) throws JSONException {
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
