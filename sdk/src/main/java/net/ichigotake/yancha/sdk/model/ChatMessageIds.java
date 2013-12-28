package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * 発言のIDリストを扱う
 */
public class ChatMessageIds implements Serializable, MutableList<Integer> {

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

    @Override
    public void clear() {
        mIds.clear();
    }

    @Override
    public void remove(int location) {
        mIds.remove(location);
    }

    @Override
    public void add(Integer item) {
        mIds.add(item);
    }

    @Override
    public void addAll(Collection<Integer> collection) {
        mIds.addAll((collection));
    }

    @Override
    public void addAll(MutableList<Integer> list) {
        mIds.addAll(list.toList());
    }

    @Override
    public Integer get(int location) {
        return mIds.get(location);
    }

    @Override
    public int size() {
        return mIds.size();
    }

    @Override
    public boolean isEmpty() {
        return mIds.isEmpty();
    }

    @Override
    public boolean contains(Integer message) {
        return mIds.contains(message);
    }

    @Override
    public boolean containsAll(Collection<Integer> collection) {
        return mIds.containsAll(collection);
    }

    @Override
    public List<Integer> toList() {
        return mIds;
    }

    @Override
    public Integer[] toArray() {
        return (Integer[])mIds.toArray();
    }
}
