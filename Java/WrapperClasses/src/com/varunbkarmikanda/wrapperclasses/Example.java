package com.varunbkarmikanda.wrapperclasses;

public class Example {
    public static void main(String[] args) {
        Student x = new Student();
        x.id = 5;
        fun(x);
        System.out.println(x.id);
        System.out.println("x: "+x);
        function(x);
        System.out.println(x.id);
    }

    private static void fun(Student a){
        Student student = new Student();
        student.id = 2;
        a = student;
        System.out.println("a: "+a);
    }

    private static void function(Student v){
        v.id = 3;
        System.out.println("v: "+v);
    }
}

class Student{
    public int id;
}
