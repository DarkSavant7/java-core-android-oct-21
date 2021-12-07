package ru.geekbrains.jca.lessons.lesson14_log_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
* Trace << Debug << Info << Warn << Error << Fatal
 */
public class LoggingExample {
//    private static final Logger log = LogManager.getLogger();
//    private static final Logger log = LogManager.getLogger("root");
//    private static final Logger log = LogManager.getLogger("super_logger");
    private static final Logger log = LogManager.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        float f = .0324f;
        String s = "Hello";
        log.info("I'm sending 2 objects: string - {} and number {}", s, f);
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info log");
        log.warn("Warn log");
        log.error("Error log");
        log.fatal("Fatal log");

        try {
            throw new RuntimeException("AAAAAAAAAAAAAA");
        } catch (RuntimeException e) {
            log.throwing(e);
        }

        new Thread(() -> log.warn("From thread")).start();
    }
}
