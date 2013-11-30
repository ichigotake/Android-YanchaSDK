package net.ichigotake.yanchasdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
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
    public static List<String> createNicknameList(String response) throws JSONException {
        JSONObject json = new JSONObject(response);
        List<String> nicknames = new ArrayList<String>();

        Iterator<String> iter = json.keys();
        while (iter.hasNext()) {
            nicknames.add(iter.next().toString());
        }

        return nicknames;
    }
}
