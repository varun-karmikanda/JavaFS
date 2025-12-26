package com.varunbkarmikanda.accessmodifiers.Test;

    // Create only one object of a particular class in an entire application

public class School {

    // Create a school type variable
    private static School instance;

    // Restricts creation of objects
    private School(){}

    public static School getInstance(){
        if(instance == null) {
            instance = new School();
        }
        return instance;
    }

}
