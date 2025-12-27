package com.varunbkarmikanda.innerclasses.memberinnerclass.alternateapproach;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}
