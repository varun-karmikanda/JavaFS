package com.varunbkarmikanda.core.oops.challenge9;

public interface ElectricEngine {

    String fuelType = "Electricity";

    default void start(){
        System.out.println("electric engine started!");
    }

    default String getFuelType(){
        return "Uses " + fuelType;
    }

}
