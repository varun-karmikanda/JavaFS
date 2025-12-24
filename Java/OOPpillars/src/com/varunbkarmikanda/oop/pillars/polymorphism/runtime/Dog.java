package com.varunbkarmikanda.oop.pillars.polymorphism.runtime;

public class Dog extends Animal {
    @Override
    public void sayHello(){
        System.out.println("woof!");
    }

    public void sayBye(){
        System.out.println("woof woof");
    }
}
