package com.varunbkarmikanda.core.staticandfinal.challenge2.test;

public class BaseFactory {

    private static int nextFactoryId = 1;

    private final String factoryID;
    private final String factoryName;

    public BaseFactory(String factoryName){
        this(factoryName, FactoryType.GENERIC);
    }

    public BaseFactory(String factoryName, FactoryType type){
        this.factoryName = factoryName;

//        String finalPrefix = (prefix != null && prefix.length() == 4) ? prefix : "VOID";

        this.factoryID = type.getPrefix() + "-" + String.format("%06d", nextFactoryId++);
    }

    public void prntDetails(){
        System.out.println("Factory ID : " + this.factoryID + " | Name : " + this.factoryName);
    }

    public String getFactoryID(){
        return factoryID;
    }

    public String getFactoryName(){
        return factoryName;
    }

}
