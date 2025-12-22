package com.varunbkarmikanda.oop.pillars.encapsulation.test;

public class TestStudent {

    // Encapsulation: here we cannot se the values directly
    // need to use methods
    // Getters & Setters

    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Varun";
        student.setName("Varun");
//        student.rollNumber = 51;
        student.setRollNumber(51);
        student.setAge(21);
//        System.out.println(student.getAge());
        System.out.println(student);
    }

}
