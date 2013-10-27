package net.ichigotake.yanchasdk.lib.model;

import java.util.HashMap;
import java.util.Map;

/**
 * API level 1
 * 
 * yancha�̍w�ǃ^�O���X�g
 */
public class JoinTagList {

	final private Map<String, JoinTag> mTags = new HashMap<String, JoinTag>();

	/**
	 * API level
	 * 
	 * �^�O�����X�g�Ɋ܂܂�Ă����true��Ԃ�
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
	 * �^�O��ǉ�����
	 * 
	 * @param name
	 */
	public void add(String name) {
		mTags.put(name, new JoinTag(name));
	}
	
	/**
	 * API level 1
	 * 
	 * �^�O���擾����
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
	 * �^�O�� {@link Map<String, JoinTag>} �ŕԂ�
	 * 
	 * @return
	 */
	public Map<String, JoinTag> getAll() {
		return mTags;
	}
	
	/**
	 * API level 1
	 * 
	 * �^�O�ɍŏI�X�V�������Z�b�g����
	 * 
	 * @param name
	 * @param millsecond
	 */
	public void setLastUpdatedTime(String name, long millsecond) {
		mTags.get(name).setLastUpdatedTime(millsecond);
	}
}
