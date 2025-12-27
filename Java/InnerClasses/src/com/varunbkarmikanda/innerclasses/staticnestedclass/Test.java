package com.varunbkarmikanda.innerclasses.staticnestedclass;

public class Test {
    public static void main(String[] args) {
        Computer computer =  new Computer("Acer", "Predator Helios Neo 16", "Windows");
        computer.getOs().display();
        System.out.println(computer);

        Computer.USB usb = new Computer.USB("Type-C");
        System.out.println(usb);
        Computer.USB usb1 = new Computer.USB("Type-A");
        System.out.println(usb1);

    }
}
