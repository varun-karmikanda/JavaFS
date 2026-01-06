package com.varunbkarmikanda.core.oops.challenge8;

public class SmartLight implements Operatable {

    private boolean isLightOn;

    private int brightness = 100;

    public SmartLight(boolean isLightOn){
        this.isLightOn = isLightOn;
    }


    @Override
    public void turnOn() {
        if(isLightOn){
            System.out.println("Light already ON!");
            return;
        }
        this.isLightOn = true;
        System.out.println("Turned light ON!");
    }

    @Override
    public void turnOff() {
        if(!isLightOn){
            System.out.println("Light already OFF!");
            return;
        }
        this.isLightOn = false;
        System.out.println("Turned light OFF!");
    }

    @Override
    public boolean isEnabled() {
        return this.isLightOn;
    }

    public void changeBrightness(int brightness){
        if(!isLightOn){
            System.out.println("Turn the light on to adjust brightness");
            return;
        }
        this.brightness = Math.max(MIN_BRIGHTNESS, Math.min(MAX_BRIGHTNESS, brightness));
        System.out.println("Brightness changed to "+ this.brightness);
    }

}
