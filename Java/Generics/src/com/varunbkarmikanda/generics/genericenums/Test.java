package com.varunbkarmikanda.generics.genericenums;

// type-safe by default

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Test {
    public static void main(String[] args) {
        Day day = Day.THURSDAY;
//        Day day1 = "MONDAY";
    }
}
