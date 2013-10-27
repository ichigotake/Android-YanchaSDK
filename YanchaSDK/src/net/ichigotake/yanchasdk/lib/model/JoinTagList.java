package net.ichigotake.yanchasdk.lib.model;

import java.util.HashMap;
import java.util.Map;

/**
 * API level 1
 * 
 * yanchaの購読タグリスト
 */
public class JoinTagList {

	final private Map<String, JoinTag> mTags = new HashMap<String, JoinTag>();

	/**
	 * API level
	 * 
	 * タグがリストに含まれていればtrueを返す
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
	 * タグを追加する
	 * 
	 * @param name
	 */
	public void add(String name) {
		mTags.put(name, new JoinTag(name));
	}
	
	/**
	 * API level 1
	 * 
	 * タグを取得する
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
	 * タグを {@link Map<String, JoinTag>} で返す
	 * 
	 * @return
	 */
	public Map<String, JoinTag> getAll() {
		return mTags;
	}
	
	/**
	 * API level 1
	 * 
	 * タグに最終更新日時をセットする
	 * 
	 * @param name
	 * @param millsecond
	 */
	public void setLastUpdatedTime(String name, long millsecond) {
		mTags.get(name).setLastUpdatedTime(millsecond);
	}
}
