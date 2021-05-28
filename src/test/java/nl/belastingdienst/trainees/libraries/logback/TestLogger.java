package nl.belastingdienst.trainees.libraries.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    private static final Logger logger = LoggerFactory.getLogger("nl.belastingdienst.trainees.libraries.logback");
    @Test
    public void printLog() {
        logger.info("Example info statement!");
    }
}
