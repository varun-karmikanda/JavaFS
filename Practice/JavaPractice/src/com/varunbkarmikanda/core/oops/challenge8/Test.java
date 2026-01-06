package com.varunbkarmikanda.core.oops.challenge8;

public class Test {
    public static void main(String[] args) {

        SmartHomeHub hub = new SmartHomeHub();

        Television television = new Television(false);
        SmartLight smartLight = new SmartLight(true);
        SmartLight light = new SmartLight(false);
        Television tv = new Television(true);

        hub.addDevices(television);
        hub.addDevices(smartLight);
        hub.addDevices(light);
        hub.addDevices(tv);

        hub.sutDownAll();

    }
}
