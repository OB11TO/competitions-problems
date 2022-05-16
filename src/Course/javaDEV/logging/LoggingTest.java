package Course.javaDEV.logging;

import java.util.logging.Logger;

public class LoggingTest {

    static Logger log = Logger.getLogger(LoggingTest.class.getName());
    public static void main(String[] args) {
       someMethod();
        log.info("G");
    }

    public static void someMethod()
    {
        log.info("Some message");
    }
}
