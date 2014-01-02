package net.ichigotake.yancha.sdk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * {@link ChatMessage} のリストを扱う
 */
public class ChatMessages implements Serializable, MutableList<ChatMessage> {

    final private List<ChatMessage> mMessages;

    public ChatMessages() {
        mMessages = new ArrayList<ChatMessage>();
    }

    public ChatMessages(Collection<ChatMessage> messages) {
        mMessages = new ArrayList<ChatMessage>(messages);
    }

    public ChatMessages(ChatMessages messages) {
        mMessages = messages.toList();
    }

    public ChatMessageIds toIds() {
        List<Integer> idList = new ArrayList<Integer>();
        for (ChatMessage message : mMessages) {
            idList.add(message.getId());
        }
        return new ChatMessageIds(idList);
    }

    @Override
    public void clear() {
        mMessages.clear();
    }

    @Override
    public void remove(int location) {
        mMessages.remove(location);
    }

    @Override
    public void add(ChatMessage message) {
        mMessages.add(message);
    }

    @Override
    public void addAll(Collection<ChatMessage> collection) {
        mMessages.addAll(collection);
    }

    @Override
    public void addAll(MutableList<ChatMessage> list) {
        mMessages.addAll(list.toList());
    }

    @Override
    public ChatMessage get(int location) {
        return mMessages.get(location);
    }

    @Override
    public int size() {
        return mMessages.size();
    }

    @Override
    public boolean isEmpty() {
        return mMessages.isEmpty();
    }

    @Override
    public boolean contains(ChatMessage message) {
        return mMessages.contains(message);
    }

    @Override
    public boolean containsAll(Collection<ChatMessage> collection) {
        return mMessages.containsAll(collection);
    }

    @Override
    public List<ChatMessage> toList() {
        return mMessages;
    }

    @Override
    public ChatMessage[] toArray() {
        return (ChatMessage[])mMessages.toArray();
    }

}
