package net.ichigotake.yancha.sdk.model;

import junit.framework.TestCase;

/**
 * {@link ChatMessagesTest} のテストケース
 */
public class ChatMessagesTest extends TestCase {

    final private int mMessagesSize = 20;

    private ChatMessages buildMessages() {
        ChatMessages messages = new ChatMessages();
        for (int id=1; id<=mMessagesSize; id++) {
            ChatMessage message = new ChatMessageBuilder()
                    .setId(id)
                    .build();
            messages.add(message);
        }
        return messages;
    }

    public void testMessageID一覧を取得する() {
        ChatMessages messages = buildMessages();
        ChatMessageIds ids = messages.toIds();
        for (int index=0; index<mMessagesSize; index++) {
            assertTrue(index+1 == ids.get(index));
        }
    }
}
