package com.varunbkarmikanda.core.oops.challenge3;

public class Test {
    public static void main(String[] args) {

        User user = new User("Ram", "123");

        JavaValue javaValue = new JavaValue();



        System.out.println(javaValue.changeValue(100));

        System.out.println(user.getName());
        javaValue.changeUserName(user);
        System.out.println(user.getName());

    }
}
