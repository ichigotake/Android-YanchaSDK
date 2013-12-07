package net.ichigotake.yanchasdk.lib.model;

import java.util.HashMap;
import java.util.Map;

/**
 * API level 1
 * 
 * チャットで購読しているタグリスト
 */
public class JoinTagList {

    final private Map<String, JoinTag> mTags = new HashMap<String, JoinTag>();

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
        mTags.put(name, new JoinTag(name));
    }
    
    /**
     * API level 1
     *
     * 指定したタグ文字列から {@link JoinTag} を取得する
     *
     * @param name
     * @return
     */
    public JoinTag get(String name) {
        return mTags.get(name);
    }
    
    /**
     * API level 1
     * 
     * {@link Map<String, JoinTag>} 形式のタグ一覧オブジェクトを返す
     * 
     * @return
     */
    public Map<String, JoinTag> toMap() {
        return mTags;
    }
    
    /**
     * API level 1
     *
     * 指定したタグ文字列の最終更新日時をセットする
     *
     * @param name
     * @param millsecond
     */
    public void setLastUpdatedTime(String name, long millsecond) {
        mTags.get(name).setLastUpdatedTime(millsecond);
    }
}
