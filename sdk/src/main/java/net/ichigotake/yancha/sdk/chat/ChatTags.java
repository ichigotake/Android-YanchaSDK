package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatTags implements Serializable {

    final private Map<String, ChatTag> mTags = new HashMap<String, ChatTag>();

    public boolean contains(String name) {
        return mTags.containsKey(name);
    }
    
    public void add(String name) {
        mTags.put(name, new ChatTagBuilder(name).build());
    }
    
    public ChatTag get(String name) {
        return mTags.get(name);
    }
    
    public List<ChatTag> getList() {
        List<ChatTag> tagList = new CopyOnWriteArrayList<ChatTag>();
        for (Map.Entry<String, ChatTag> entry : mTags.entrySet()) {
            tagList.add(entry.getValue());
        }
        return tagList;
    }
    
}
