package net.ichigotake.yanchasdk.lib.model;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * API level 1
 * 
 * {@link PostMessage} を生成する
 */
public class PostMessageFactory {

	/**
	 * API level 1
	 * 
	 * JSON文字列から {@link PostMessage} を生成する
	 * 
	 * @param jsonString
	 * @return
	 * @throws JSONException
	 */
	public static PostMessage create(String jsonString) throws JSONException {
		return create(new JSONObject(jsonString));
	}
	
	/**
	 * API level 1
	 * 
	 * {@link JSONObject} から {@link PostMessage} を生成する
	 * 
	 * @param json
	 * @return
	 * @throws JSONException
	 */
	public static PostMessage create(JSONObject json) throws JSONException {
		ArrayList<String> tags = new ArrayList<String>();
		JSONArray argsTags = json.getJSONArray("tags");
		int tagLength = argsTags.length();
		for (int i=0; i<tagLength; i++) {
			String tag = argsTags.getString(i);
			tags.add(tag);
		}

		PostMessage message = new PostMessage.PostMessageBuilder()
			.setId(json.getInt("id"))
			.setProfileImageUrl(json.getString("profile_image_url"))
			.setCreatedTime(json.getLong("created_at_ms"))
			.setMessage(json.getString("text"))
			.setNickname(json.getString("nickname"))
			.setPlusplus(json.getInt("plusplus"))
			.setTags(tags)
			.setUserKey(json.getString("user_key"))
			.build();
			
		return message;
	}
}
