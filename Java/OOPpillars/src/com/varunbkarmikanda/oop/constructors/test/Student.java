package com.varunbkarmikanda.oop.constructors.test;

public class Student {

    private String name;

    private int rollNumber;

    private int age;

    public Student(String name, int rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "\n\tname=" + this.name + "," +
                "\n\troll number=" + this.rollNumber + "," +
                "\n\tage=" + this.age +
                "\n}";
    }
}
