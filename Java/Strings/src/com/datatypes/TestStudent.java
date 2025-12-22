package com.datatypes;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Varun";
        student.address = "India";
        student.standard = 5;
        student.rollNumber = 63;
        System.out.println(student.toString());
    }
}
