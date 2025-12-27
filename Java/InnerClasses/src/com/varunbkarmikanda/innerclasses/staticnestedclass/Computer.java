package com.varunbkarmikanda.innerclasses.staticnestedclass;

public class Computer {
    private String brand;

    private String model;

    private OperatingSystem os;

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        @Override
        public String toString() {
            return "USB{" +
                    "\n\ttype=" + type + "," +
                    "\n}";
        }
    }

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void display(){
            System.out.println("Computer Model: "+model+"\nComputer Brand: "+brand+"\nOperating system: "+osName);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\n\tbrand=" + brand + "," +
                "\n\tmodel=" + model + "," +
                "\n\tos=" + os.osName + "," +
                "\n}";
    }
}
