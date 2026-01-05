package com.varunbkarmikanda.core.oops.challenge7;

public interface Operatable {

    int MAX_BRIGHTNESS = 100;
    int MIN_BRIGHTNESS = 0;

    void turnOn();

    void turnOff();

    boolean isEnabled();

    default void reboot(){
        System.out.println("=====SYSTEM REBOOTING=====");
        turnOff();
        turnOn();
    }

}
