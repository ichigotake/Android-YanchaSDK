package net.ichigotake.yanchasdk.lib.model;

import java.util.Date;

/**
 * yanchaで購読しているタグ情報
 */
public class JoinTag {

	final private String mName;
	
	private Date mLastUpdatedTime;
	
	public JoinTag(String name) {
		mName = name;
		mLastUpdatedTime = new Date(0);
	}
	
	/**
	 * API level 1
	 * 
	 * タグの名前を返す
	 * 
	 * @return
	 */
	public String getName() {
		return mName;
	}
	
	/**
	 * API level 1
	 * 
	 * タグの最終更新日時を返す
	 * 
	 * @return
	 */
	public Date getLastUpdatedTime() {
		return mLastUpdatedTime;
	}
	
	/**
	 * API level 1
	 * 
	 * タグの最終更新日時をセットする
	 * 
	 * @param createdAtMillisecconds
	 */
	public void setLastUpdatedTime(long createdAtMillisecconds) {
		mLastUpdatedTime = new Date(createdAtMillisecconds);
	}
	
}
