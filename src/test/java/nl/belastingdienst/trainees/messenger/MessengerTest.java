package nl.belastingdienst.trainees.messenger;

import io.testsmith.messenger.Message;
import io.testsmith.messenger.MessengerApp;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MessengerTest {
    Message msg;

    @Test
    public void DoesMessengerAppFormatMessageCorrectly() {
        MessengerApp app = new MessengerApp();
        Message msg = new Message();
        msg.setAuthor("John Doe");
        msg.setContents("Anonimiteit: Wat geweldig!");
        msg.setLength(160);

        assertEquals("John Doe sent a message with contents 'Anonimiteit: Wat geweldig!' and length 160",
                app.sendMessage(msg));
    }
}
