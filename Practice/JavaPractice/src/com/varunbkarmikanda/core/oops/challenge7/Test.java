package com.varunbkarmikanda.core.oops.challenge7;

public class Test {

    public static void main(String[] args) {

        Television television = new Television(false);
        SmartLight smartLight = new SmartLight(false);

        Operatable[] appliances = {
//                new Television(true),
//                new SmartLight(true)
                television,
                smartLight
        };

        for (Operatable a: appliances){
            a.turnOn();
            a.turnOff();
//            a.changeChannel();
        }

        System.out.println(television.isEnabled());



    }

}
