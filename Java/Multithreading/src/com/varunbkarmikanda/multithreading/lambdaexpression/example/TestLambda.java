package com.varunbkarmikanda.multithreading.lambdaexpression.example;

public class TestLambda {
    public static void main(String[] args) {
//        Student engineeringStudent = new Student() {
//            @Override
//            public String getDetails(String name) {
//                return name + " is an engineering student.";
//            }
//        };

//        Student engineeringStudent = (String name) -> {return name + " is an Engineering student";};

//        Student engineeringStudent = (String name) -> name + " is an Engineering student";

        Student engineeringStudent = name -> name + " is an Engineering student";

        String details = engineeringStudent.getDetails("Varun");
        System.out.println(details);
    }
}
