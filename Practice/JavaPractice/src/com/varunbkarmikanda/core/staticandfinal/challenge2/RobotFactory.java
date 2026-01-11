package com.varunbkarmikanda.core.staticandfinal.challenge2;

public class RobotFactory extends BaseFactory{

    static {
        FACTORY_ID_PREFIX = "ROBO-";
        System.out.println("[RobotFactory] Static Block: Prefix updated to " + FACTORY_ID_PREFIX);
    }

    public static void printInfo(){
        System.out.println("Factory ID: " + FACTORY_ID_PREFIX);
    }

}
