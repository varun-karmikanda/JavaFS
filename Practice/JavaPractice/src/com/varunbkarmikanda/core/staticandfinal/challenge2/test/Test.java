package com.varunbkarmikanda.core.staticandfinal.challenge2.test;

public class Test {
    public static void main(String[] args) {
        RobotFactory robotFactory1 = new RobotFactory("Robotics", FactoryType.ROBOTICS);
        robotFactory1.prntDetails();
        robotFactory1.robotFactoryInfo();

        RobotFactory robotFactory2 = new RobotFactory("Bots");
        robotFactory2.prntDetails();
    }
}
