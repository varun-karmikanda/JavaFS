package com.varunbkarmikanda.core.miscellaneous.challenge1;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        SecurityLog log = new SecurityLog("Brute force", LocalDateTime.now());
        System.out.println(log);
//        log.setEvent("username enumeration");
        System.out.println(log.getEvent());
        log.setTimestamp(LocalDateTime.now() );
        System.out.println(log);
    }
}
