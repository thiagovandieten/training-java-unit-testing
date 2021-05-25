package io.testsmith.messenger;

public class MessengerApp {

    public String sendMessage(Message message) {

        String contents = message.getContents();
        String author = message.getAuthor();
        int length = message.getLength();

        return String.format("%s sent a message with contents '%s' and length %d", author, contents, length);
    }
}

