package com.varunbkarmikanda.oop.constructors.test;

public class TestStudent {

    // CONSTRUCTOR: It is a special method to initialize an object
    // Constructor with no parameter = default constructor
    // new Student();

    // No default constructor is possible if there are 1 or more user defined constructor

    public static void main(String[] args) {
        Student student = new Student("Varun", 51, 21);
        System.out.println(student);

        Student student1 = new Student("NiTR0X");
        System.out.println(student1);

        Student student2 = new Student(63);
        System.out.println(student2);
    }
}
