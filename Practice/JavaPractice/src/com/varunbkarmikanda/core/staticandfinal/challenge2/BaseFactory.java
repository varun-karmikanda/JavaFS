package com.varunbkarmikanda.core.staticandfinal.challenge2;

public class BaseFactory {

    public static String FACTORY_ID_PREFIX;

    public static int nextFactoryId = 1;

    static {
        FACTORY_ID_PREFIX = "VOID-";
        System.out.println("[BaseFactory] Static Block: Prefix initialized to " + FACTORY_ID_PREFIX);
    }

    public final String factoryId;

    public BaseFactory(){
        this.factoryId = FACTORY_ID_PREFIX + String.format("%06d", nextFactoryId++);
    }
}
