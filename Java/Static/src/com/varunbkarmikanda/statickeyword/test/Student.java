package com.varunbkarmikanda.statickeyword.test;

public class Student {

    public static int count = 0;

    // This block is used if we need to use any logics
    static {
        System.out.println("STATIC!");
    }

    public Student(){
        count++;
    }

    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getStudentsCount(){
        System.out.println("Total student = "+count);
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\tname=" + name + "," +
                "\n\tid=" + id + "," +
                "\n\tage=" + age + "," +
                "\n\ttotalStudents=" + count + "," +
                "\n}";
    }
}
