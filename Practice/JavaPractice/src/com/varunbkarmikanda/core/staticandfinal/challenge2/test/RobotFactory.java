package com.varunbkarmikanda.core.staticandfinal.challenge2.test;

public class RobotFactory extends BaseFactory{

    public RobotFactory(String name){
        super(name);
    }

    public RobotFactory(String name, FactoryType type){
        super(name, type);

    }

    public void robotFactoryInfo(){
        System.out.println("Robot factory INFO");
        System.out.println("ID : " + getFactoryID() + " | Name : " + getFactoryName());
    }
}
