package com.varunbkarmikanda.multithreading.lambdaexpression.example;

public class Test {

    public static void main(String[] args) {
        EngineeringStudent engineeringStudent = new EngineeringStudent();
        String details = engineeringStudent.getDetails("Varun");
        System.out.println(details);
    }
}
