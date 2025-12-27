package com.varunbkarmikanda.innerclasses.localinnerclass.test;

public class Test {
    public static void main(String... args){
        Hotel hotel = new Hotel("Sunrise", 15, 8);
        hotel.reserveRooms("Ram", 6);
        hotel.reserveRooms("Ankit", 8);
        hotel.reserveRooms("Adit", -6);
        hotel.reserveRooms("", 1);
        hotel.reserveRooms("Adi", 1);
        hotel.reserveRooms("  ", 1);
    }
}
