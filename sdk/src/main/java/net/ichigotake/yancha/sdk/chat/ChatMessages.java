package net.ichigotake.yancha.sdk.chat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ChatMessages implements Serializable {

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

    public void clear() {
        mMessages.clear();
    }

    public void remove(int location) {
        mMessages.remove(location);
    }

    public void add(ChatMessage message) {
        mMessages.add(message);
    }

    public void addAll(Collection<ChatMessage> collection) {
        mMessages.addAll(collection);
    }

    public ChatMessage get(int location) {
        return mMessages.get(location);
    }

    public int size() {
        return mMessages.size();
    }

    public boolean isEmpty() {
        return mMessages.isEmpty();
    }

    public boolean contains(ChatMessage message) {
        return mMessages.contains(message);
    }

    public boolean containsAll(Collection<ChatMessage> collection) {
        return mMessages.containsAll(collection);
    }

    public List<ChatMessage> toList() {
        return mMessages;
    }

}
