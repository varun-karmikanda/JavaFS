package com.varunbkarmikanda.oop.pillars.encapsulation.test;

// "this" the instance variable of the particular object
// Whichever object you call the set method that instance is "this"
// normal one is the local variable

public class Student {

    // Properties/fields/instance variables & behaviours/methods

    // Instance variables
    private String name;

    private int rollNumber;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid age!");
            age = 0;
        }
        this.age = age;
    }

    public String toString(){
        return "Student{" +
                "\n\tname=" + this.name + "," +
                "\n\troll number=" + this.rollNumber + "," +
                "\n\tage=" + this.age +
                "\n}";
    }
}