package com.varunbkarmikanda.accessmodifiers.Test;

import com.varunbkarmikanda.accessmodifiers.school.Student;
import com.varunbkarmikanda.accessmodifiers.zoo.Cat;

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

        //Classes cannot be private or protected
        // only public and default

        Cat cat = new Cat("Car");
        cat.makeSound();
//        cat.changeSound();    // Not accessible as it is a different package class that it is not accessing
        cat.setCatSound("me-ow!");
        cat.makeSound();
        cat.wagTail();
    }
}
