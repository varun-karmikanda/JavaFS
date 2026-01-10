package com.varunbkarmikanda.core.oops.challenge9;

public class HybridCar implements FuelEngine, ElectricEngine{
    @Override
    public void start() {
        FuelEngine.super.start();
        ElectricEngine.super.start();
    }

    @Override
    public String getFuelType() {
        return "This car uses both "
                + FuelEngine.fuelType
                + " and "
                + ElectricEngine.fuelType;
    }
}
