package com.varunbkarmikanda.interfaces.devices;

// Achieving multiple inheritance via interfaces

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video with smartphone!");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopped music on smartphone!");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("calling "+ number +" on smartphone.");
    }

    @Override
    public void endCall() {
        System.out.println("ending call on smartphone.");
    }
}
