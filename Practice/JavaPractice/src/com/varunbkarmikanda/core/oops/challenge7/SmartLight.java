package com.varunbkarmikanda.core.oops.challenge7;

public class SmartLight implements Operatable{

    private boolean isLightOn;

    private int brightnessLevel = 100;

    public SmartLight(boolean lightStatus){
        this.isLightOn = lightStatus;
    }

    public void adjustBrightness(int brightnessLevel){
        if(!isLightOn){
            System.out.println("Turn the light on to adjust the brightness");
            return;
        }
        this.brightnessLevel = Math.max(MIN_BRIGHTNESS, Math.min(MAX_BRIGHTNESS, brightnessLevel));
        System.out.println("Brightness changed to "+ brightnessLevel +"%");
    }

    @Override
    public void turnOn() {
        if(isLightOn){
            System.out.println("Smart Light is already ON!");
        }
        else {
            isLightOn = true;
            System.out.println("Smart Light turned ON!");
        }
    }

    @Override
    public void turnOff() {
        if(!isLightOn){
            System.out.println("Smart Light is already OFF!");
        }
        else{
            isLightOn = false;
            System.out.println("Smart Light turned OFF!");
        }
    }

    @Override
    public boolean isEnabled() {
        return isLightOn;
    }
}
