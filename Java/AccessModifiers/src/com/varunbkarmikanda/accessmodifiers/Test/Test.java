package com.varunbkarmikanda.accessmodifiers.Test;

import com.varunbkarmikanda.accessmodifiers.school.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name =  "Ram";
        student.age = 21;
        student.sayHello();
        System.out.println(student);


        // Restricting creation of objects
        School.getInstance();
        School.getInstance();
        School.getInstance();

        //Classes cannot be private
    }
}
