package com.varunbkarmikanda.accessmodifiers.zoo;

public class Cat extends Animal{

    public Cat(String name){
        super(name, "moew!");
    }

    public void wagTail(){
        System.out.println(getName()+ " is wagging its tail!");
    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public void setCatSound(String newSound){
        changeSound(newSound);
    }

}
