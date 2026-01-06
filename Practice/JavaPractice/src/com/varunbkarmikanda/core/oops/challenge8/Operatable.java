package com.varunbkarmikanda.core.oops.challenge8;

public interface Operatable {

    int MAX_BRIGHTNESS = 100;

    int MIN_BRIGHTNESS = 0;

    boolean isEnabled();

    void turnOn();

    void turnOff();

    default void reboot(){
        System.out.println("=====SYSTEM REBOOTING=====");
        turnOff();
        turnOn();
    }


}
