package net.ichigotake.yanchasdk.lib.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * ログインしているユーザー情報を生成するクラス
 */
public class JoinUserFactory {

    /**
     * API level 1
     *
     * SocketIOの "nicknames" イベントのレスポンスからニックネームの {@link List<String>}を生成する
     *
     * @param response
     * @return
     * @throws JSONException
     */
    public JoinUsers fromNicknameEvent(String response) throws JSONException {
        final JSONObject json = new JSONObject(response);
        final JoinUsers users = new JoinUsers();
        final Iterator<String> iter = json.keys();

        while (iter.hasNext()) {
            final JSONObject userJson = json.getJSONObject(iter.next());

            final JoinUser user = new JoinUser.JoinUserBuilder()
                    .setNickname(userJson.getString("nickname"))
                    .setProfileUrl(userJson.getString("profile_url"))
                    .setProfileImageUrl(userJson.getString("profile_image_url"))
                    .build();

            users.add(user);
        }

        return users;
    }
}
