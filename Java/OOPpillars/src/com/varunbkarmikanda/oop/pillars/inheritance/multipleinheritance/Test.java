package com.varunbkarmikanda.oop.pillars.inheritance.multipleinheritance;

// IMPORTANT!!!!!
// DEMO: MULTIPLE INHERITANCE IS NOT POSSIBLE IN JAVA

public class Test {

    // Not possible as if there are methods with same name and params in more than 1 class then it will create confusion on what to call
    // This Multiple Inheritance problem is solved by Interfaces

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.clickPhoto();
    }
}
