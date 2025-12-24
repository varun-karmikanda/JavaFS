package com.varunbkarmikanda.oop.pillars.polymorphism;

import com.varunbkarmikanda.oop.pillars.polymorphism.compiletime.Addition;
import com.varunbkarmikanda.oop.pillars.polymorphism.runtime.Animal;
import com.varunbkarmikanda.oop.pillars.polymorphism.runtime.Cat;
import com.varunbkarmikanda.oop.pillars.polymorphism.runtime.Dog;

public class Polymorphism {

    // POLYMORPHISM: Method Overloading

    // POLYMORPHISM: Allows method to do different things based on the object that is acting upon
    // even tho the method name and the signature is same

    public static void main(String[] args) {

        // OVERLOADING

        Addition addition = new Addition();
        System.out.println(addition.add(6, 7));
        System.out.println(addition.add(21, 679, 29));
        System.out.println(addition.add(2.34, 7.33));

        // OVERRIDING [DYNAMIC METHOD DISPATCH  ]

        Animal animal = new Animal();
        Animal cat = new Cat();         // UPCASTING
        cat.sayHello();
        Animal dog = new Dog();
        dog.sayHello();

        Dog myDog = (Dog) dog;

    }

}
