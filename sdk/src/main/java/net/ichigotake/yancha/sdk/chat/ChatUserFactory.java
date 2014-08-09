package net.ichigotake.yancha.sdk.chat;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatUserFactory {

    private static ChatUserFactory sInstance;

    private ChatUserFactory() {}

    public static ChatUserFactory getInstance() {
        if (sInstance == null) {
            sInstance = new ChatUserFactory();
        }
        return sInstance;
    }

    /**
     * SocketIOの "nicknames" イベントのレスポンスからニックネームの {@link List<String>}を生成する
     */
    public static List<ChatUser> fromNicknameEvent(String response) throws JSONException {
        final JSONObject json = new JSONObject(response);
        final List<ChatUser> users = new ArrayList<ChatUser>();
        final Iterator<String> iter = json.keys();

        final ChatUserFactory factory = getInstance();
        while (iter.hasNext()) {
            final JSONObject userJson = json.getJSONObject(iter.next());
            users.add(factory.build(userJson));
        }

        return users;
    }

    public static ChatUser fromTokenLoginEvent(String response)throws JSONException {
        JSONObject userJson = new JSONObject(response).getJSONObject("user_data");
        return getInstance().build(userJson);
    }

    public ChatUser build(JSONObject json) throws JSONException {
        ChatUserBuilder builder = new ChatUserBuilder(json.getString("nickname"))
                .setProfileUrl(json.getString("profile_url"))
                .setProfileImageUrl(json.getString("profile_image_url"));
        if (json.has("user_key")) {
            builder.setUserKey(json.getString("user_key"));
        }
        return builder.build();
    }
}
