package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * API level 1
 * 
 * チャットで購読しているタグリスト
 */
public class ChatTagList implements Serializable {

    final private Map<String, ChatTag> mTags = new HashMap<String, ChatTag>();

    /**
     * API level 1
     *
     * 指定したタグがリストに含まれていたらtrueを返す
     *
     * @param name
     * @return
     */
    public boolean contains(String name) {
        return mTags.containsKey(name);
    }
    
    /**
     * API level 1
     *
     * 指定したタグをタグリストに追加する
     *
     * @param name
     */
    public void add(String name) {
        mTags.put(name, new ChatTagBuilder(name).build());
    }
    
    /**
     * API level 1
     *
     * 指定したタグ文字列から {@link ChatTag} を取得する
     *
     * @param name
     * @return
     */
    public ChatTag get(String name) {
        return mTags.get(name);
    }
    
    /**
     * API level 1
     * 
     * {@link Map<String,  ChatTag >} 形式のタグ一覧オブジェクトを返す
     * 
     * @return
     */
    public Map<String, ChatTag> toMap() {
        return mTags;
    }
    
}
