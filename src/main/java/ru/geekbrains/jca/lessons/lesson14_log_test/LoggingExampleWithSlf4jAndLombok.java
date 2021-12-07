package ru.geekbrains.jca.lessons.lesson14_log_test;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingExampleWithSlf4jAndLombok {


    public static void main(String[] args) {
        float f = .0324f;
        String s = "Hello";
        log.info("I'm sending 2 objects: string - {} and number {}", s, f);
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info log");
        log.warn("Warn log");
        log.error("Error log");

        new Thread(() -> log.warn("From thread")).start();
    }
}
