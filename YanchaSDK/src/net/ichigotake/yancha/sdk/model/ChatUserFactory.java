package net.ichigotake.yancha.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * ログインしているユーザー情報を生成するクラス
 */
public class ChatUserFactory {

    /**
     * API level 1
     *
     * SocketIOの "nicknames" イベントのレスポンスからニックネームの {@link List<String>}を生成する
     *
     * @param response
     * @return
     * @throws JSONException
     */
    public ChatUsers fromNicknameEvent(String response) throws JSONException {
        final JSONObject json = new JSONObject(response);
        final ChatUsers users = new ChatUsers();
        final Iterator<String> iter = json.keys();

        while (iter.hasNext()) {
            final JSONObject userJson = json.getJSONObject(iter.next());
            users.add(build(userJson));
        }

        return users;
    }

    public ChatUser fromTokenLoginEvent(String response)throws JSONException {
        JSONObject userJson = new JSONObject(response).getJSONObject("user_data");
        return build(userJson);
    }

    private ChatUser build(JSONObject json) throws JSONException {
        return new ChatJoinUser.JoinUserBuilder()
                .setNickname(json.getString("nickname"))
                .setProfileUrl(json.getString("profile_url"))
                .setProfileImageUrl(json.getString("profile_image_url"))
                .build();

    }
}
