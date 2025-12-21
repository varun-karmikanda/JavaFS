package com.datatypes;

public class Student {
    String name;
    String address;
    int standard;
    int rollNumber;

//    Student(String name, String address, int standard, int rollNumber){}

    public String toString(){
        return "Student {"+
                "\n\tname=" + name +
                ",\n\taddress=" + address +
                ",\n\tstandard=" + standard +
                ",\n\trollNumber=" + rollNumber +
                "\n}";
    }
}
