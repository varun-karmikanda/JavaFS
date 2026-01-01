package com.varunbkarmikanda.core.miscellaneous.challenge5;

public class Test {
    public static void main(String[] args) {
        LoggerUtil log = new LoggerUtil();
        log.logger(LogLevel.INFO, "INFO LOGGER");
        log.logger(LogLevel.WARNING, "WARNING LOGGER");
        log.logger(LogLevel.ERROR, "ERROR LOGGER");


    }
}
