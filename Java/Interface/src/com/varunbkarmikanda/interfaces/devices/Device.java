package com.varunbkarmikanda.interfaces.devices;

public class Device {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("6351956007");
        smartPhone.endCall();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
        smartPhone.playMusic();
        smartPhone.stopMusic();
    }
}
