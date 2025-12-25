package com.varunbkarmikanda.oop.pillars.abstraction;

public class Abstraction {

    // ABSTRACTION: Hiding internal details

    public static void main(String[] args) {

//        Animal animal = new Animal();
        // Cannot create object of the abstract class
        // If we want to create we neet to implement the abstract method when initializing the object
        Animal animal = new Animal() {
            @Override
            public void sayHello() {
                System.out.println("..");
            }
        };

        Animal cat = new Cat();
        cat.sayHello();

        Animal dog = new Dog();
        dog.sayHello();

    }

}
