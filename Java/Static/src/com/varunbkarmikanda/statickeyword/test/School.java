package com.varunbkarmikanda.statickeyword.test;

public class School {

    private static School instance = new School();

    private School(){}

    public static School getInstance(){
        return instance;
    }

}
