package com.varunbkarmikanda.core.miscellaneous.challenge5;

public class LoggerUtil {
    public static void logger(LogLevel level, String message){
        System.out.println("["+ level + "]" + "(Priority: " + level.getPriority() + ")\nMessage: "+message);
    }
}
