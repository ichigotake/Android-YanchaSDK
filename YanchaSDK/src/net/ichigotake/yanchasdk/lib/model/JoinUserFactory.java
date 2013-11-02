package net.ichigotake.yanchasdk.lib.model;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
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
    public static List<String> createNicknameList(String response) throws JSONException {
        JSONArray json = new JSONArray(response);
        List<String> nicknames = new ArrayList<String>();

        int length = json.length();
        for (int i=0; i<length; i++) {
            nicknames.add(json.getString(i));
        }

        return nicknames;
    }
}
