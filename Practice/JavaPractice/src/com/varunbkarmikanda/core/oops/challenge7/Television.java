package com.varunbkarmikanda.core.oops.challenge7;

public class Television implements Operatable{

    private boolean isTelevisionOn;

    private int channel = 0;

    public Television(boolean televisionStatus){
        this.isTelevisionOn = televisionStatus;
    }

    public void changeChannel(int channel){
        if(!isTelevisionOn){
            System.out.println("Turn on the TV before trying to change the channel");
            return;
        }
        this.channel = channel;
        System.out.println("Channel changed to " + channel);
    }

    @Override
    public void turnOn() {
        if(isTelevisionOn){
            System.out.println("Television is already ON!");
        } else {
            this.isTelevisionOn = true;
            System.out.println("Television turned ON!");
        }
    }

    @Override
    public void turnOff() {
        if(!isTelevisionOn){
            System.out.println("Television is already OFF!");
        } else {
            this.isTelevisionOn = false;
            System.out.println("Television turned OFF!");
        }
    }

    @Override
    public boolean isEnabled() {
        return isTelevisionOn;
    }
}
