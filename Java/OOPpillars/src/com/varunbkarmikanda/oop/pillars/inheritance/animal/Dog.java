package com.varunbkarmikanda.oop.pillars.inheritance.animal;

public class Dog extends Animal{

    // Method overriding
    // child class methods overrides a parent class method

    @Override
    public void sayHello(){
        System.out.println("woof!");
    }

}
