package com.varunbkarmikanda.innerclasses.memberinnerclass;

public class Test {

    // Inner class behaves as a member of outer class

    public static void main(String[] args) {
        Car car = new Car("Fortuner");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
