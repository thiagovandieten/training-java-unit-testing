package nl.belastingdienst.trainees.ownerTest;

import nl.belastingdienst.trainees.util.properties.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OwnerTest {
    @Test
    public void isEmailAsExpected() {
        GeneralConfig cfg = ConfigFactory.create(GeneralConfig.class);
        assertEquals("test@test.com", cfg.email());
    }
}
