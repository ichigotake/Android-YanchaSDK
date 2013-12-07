package net.ichigotake.yancha.sdk.model;

import java.util.Date;

/**
 * yancha�ōw�ǂ��Ă���^�O���
 */
public class ChatTag {

    final private String mName;
    
    private Date mLastUpdatedTime;
    
    public ChatTag(String name) {
        mName = name;
        mLastUpdatedTime = new Date(0);
    }
    
    /**
     * API level 1
     * 
     * �^�O�̖��O��Ԃ�
     * 
     * @return
     */
    public String getName() {
        return mName;
    }
    
    /**
     * API level 1
     * 
     * �^�O�̍ŏI�X�V���Ԃ�
     * 
     * @return
     */
    public Date getLastUpdatedTime() {
        return mLastUpdatedTime;
    }
    
    /**
     * API level 1
     * 
     * �^�O�̍ŏI�X�V����Z�b�g����
     * 
     * @param createdAtMillisecconds
     */
    public void setLastUpdatedTime(long createdAtMillisecconds) {
        mLastUpdatedTime = new Date(createdAtMillisecconds);
    }
    
}
