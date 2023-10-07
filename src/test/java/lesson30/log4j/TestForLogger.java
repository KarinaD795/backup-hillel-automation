package lesson30.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestForLogger {

    private static final Logger logger = LogManager.getLogger(TestForLogger.class);

    @Test
    public void logger() {

        System.out.println("hello");

        logger.trace("Trace logging level");

    }


}
