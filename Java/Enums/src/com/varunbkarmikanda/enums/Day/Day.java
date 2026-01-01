package com.varunbkarmikanda.enums.Day;

public class Day {
    public static void main(String[] args) {

        System.out.println(DayEnum.SUNDAY);
        System.out.println(DayEnum.MONDAY);
        System.out.println(DayEnum.TUESDAY);
        System.out.println(DayEnum.WEDNESDAY);
        System.out.println(DayEnum.THURSDAY);
        System.out.println(DayEnum.FRIDAY);
        System.out.println(DayEnum.SATURDAY);

        DayEnum monday = DayEnum.MONDAY;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday);

        DayEnum dayEnum = DayEnum.valueOf("MONDAY");
        System.out.println(dayEnum);

        DayEnum[] values = DayEnum.values();
        System.out.println(values);

        for (DayEnum day: values){
            System.out.println(day);
        }

    }
}
