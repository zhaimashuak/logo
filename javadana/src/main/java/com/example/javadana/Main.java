package com.example.javadana;
import org.apache.logging.log4j.LogManager;import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.trace("Это TRACE сообщение");
        logger.debug("Это DEBUG сообщение");
        logger.info("Это INFO сообщение");
        logger.warn("Это WARN сообщение");
        logger.error("Это ERROR сообщение");
    }
}