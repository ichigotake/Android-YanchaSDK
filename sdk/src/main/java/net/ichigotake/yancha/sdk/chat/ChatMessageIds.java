package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * 発言のIDリストを扱う
 */
public class ChatMessageIds implements Serializable {

    final private List<Integer> mIds;

    public ChatMessageIds() {
        mIds = new ArrayList<Integer>();
    }

    public ChatMessageIds(Collection<Integer> ids) {
        mIds = new ArrayList<Integer>(ids);
    }

    public ChatMessageIds(ChatMessageIds ids) {
        mIds = ids.toList();
    }

    public void clear() {
        mIds.clear();
    }

    public void remove(int location) {
        mIds.remove(location);
    }

    public void add(Integer item) {
        mIds.add(item);
    }

    public void addAll(Collection<Integer> collection) {
        mIds.addAll((collection));
    }

    public Integer get(int location) {
        return mIds.get(location);
    }

    public int size() {
        return mIds.size();
    }

    public boolean isEmpty() {
        return mIds.isEmpty();
    }

    public boolean contains(Integer message) {
        return mIds.contains(message);
    }

    public boolean containsAll(Collection<Integer> collection) {
        return mIds.containsAll(collection);
    }

    public List<Integer> toList() {
        return mIds;
    }

    public Integer[] toArray() {
        return (Integer[])mIds.toArray();
    }
}
