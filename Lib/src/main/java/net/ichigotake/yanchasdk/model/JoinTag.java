package net.ichigotake.yanchasdk.model;

import java.util.Date;

/**
 * 購読しているタグ
 */
public class JoinTag {

	final private String mName;
	
	private Date mLastUpdatedTime;
	
	public JoinTag(String name) {
		mName = name;
		mLastUpdatedTime = new Date(0);
	}
	
	public String getName() {
		return mName;
	}
	
	/**
	 * API level 1
	 *
     * タグの最終更新日時のタイムスタンプをミリ秒で返す
	 *
	 * @return
	 */
	public Date getLastUpdatedTime() {
		return mLastUpdatedTime;
	}
	
	/**
	 * API level 1
	 *
     * タグの最終更新日時のタイムスタンプをミリ秒でセットする
	 *
	 * @param createdAtMillisecconds
	 */
	public void setLastUpdatedTime(long createdAtMillisecconds) {
		mLastUpdatedTime = new Date(createdAtMillisecconds);
	}
	
}
