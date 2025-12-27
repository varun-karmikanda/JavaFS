package com.varunbkarmikanda.innerclasses.memberinnerclass.alternateapproach;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("RS7");
        Engine engine =  new Engine(car);
        engine.start();
        engine.stop();

        Car car1 =  new Car("S Class");
        Engine engine1 = new Engine(car1);
        engine1.start();
        engine1.stop();

    }
}
