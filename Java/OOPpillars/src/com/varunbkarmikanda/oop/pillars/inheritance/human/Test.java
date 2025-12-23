package com.varunbkarmikanda.oop.pillars.inheritance.human;

public class Test {

    // Multi level inheritance

    // super() is always called first to instantiate the parent class constructor

    // Invoke super class methods or fields

    public static void main(String[] args) {

//        Child child = new Child();
//        child.setName("Ram");
//        child.setAge(19);
//        System.out.println(child);
//
//        Parent parent = new Parent();
//        parent.setName("Ramesh");
//        parent.setAge(45);
//        System.out.println(parent);
//
//        child.childMethod();

        Child child = new Child("Ram", 21);
        System.out.println(child);

    }
}
