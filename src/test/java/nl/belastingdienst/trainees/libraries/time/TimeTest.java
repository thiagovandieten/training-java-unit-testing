package nl.belastingdienst.trainees.libraries.time;

import org.joda.time.LocalDateTime;
import org.junit.Test;

public class TimeTest {
    @Test
    public void tijdStipZesMaanden() {
        LocalDateTime tijdvanInitatie = LocalDateTime.now();
        System.out.println(tijdvanInitatie.plusMonths(6));
    }
}
