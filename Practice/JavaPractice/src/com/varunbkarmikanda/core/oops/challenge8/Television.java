package com.varunbkarmikanda.core.oops.challenge8;

public class Television implements Operatable{

    private boolean isTelevisionOn;

    private int channel = 0;

    public Television(boolean isTelevisionOn) {
        this.isTelevisionOn = isTelevisionOn;
    }

    @Override
    public boolean isEnabled() {
        return isTelevisionOn;
    }

    @Override
    public void turnOn() {
        if (isTelevisionOn){
            System.out.println("TV already ON!");
            return;
        }
        this.isTelevisionOn = true;
        System.out.println("TV turned ON!");
    }

    @Override
    public void turnOff() {
        if(!isTelevisionOn){
            System.out.println("TV already OFF");
            return;
        }
        this.isTelevisionOn = false;
        System.out.println("TV turned OFF!");
    }

    public void changeChannel(int channel){
        if (!isTelevisionOn){
            System.out.println("Turn on the TV to change the channel!");
            return;
        }
        this.channel = channel;
        System.out.println("TV channel changed to "+channel);
    }
}
