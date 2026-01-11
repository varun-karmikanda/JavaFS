package com.varunbkarmikanda.core.staticandfinal.challenge2.test;

public enum FactoryType {

    ROBOTICS("ROBO"),
    AUTOMOTIVE("AUTO"),
    HEAVY_MACHINES("HEVY"),
    GENERIC("VOID");

    private final String prefix;

    FactoryType(String prefix){
        this.prefix = prefix;
    }

    public String getPrefix(){
        return prefix;
    }

}
