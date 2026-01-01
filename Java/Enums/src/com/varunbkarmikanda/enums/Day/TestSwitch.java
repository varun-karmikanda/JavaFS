package com.varunbkarmikanda.enums.Day;

public class TestSwitch {
    public static void main(String[] args) {
        DayEnum day1 = DayEnum.SATURDAY;

        switch (day1){
            case MONDAY:{
                System.out.println("MONDAY");
                break;
            }
            case TUESDAY:{
                System.out.println("TUESDAY");
                break;
            }
            case WEDNESDAY:{
                System.out.println("WEDNESDAY");
                break;
            }
            case THURSDAY:{
                System.out.println("THURSDAY");
                break;
            }
            case FRIDAY:{
                System.out.println("FRIDAY");
                break;
            }
            case SATURDAY, SUNDAY:{
                System.out.println("WEEKEND!");
                break;
            }
            default:{
                System.out.println("HUH!");
            }
        }

        DayEnum day2 = DayEnum.SUNDAY;

        // Java 12 Case statement
        switch (day2){
            case MONDAY -> {
                System.out.println("MONDAY");
                            }
            case TUESDAY -> {
                System.out.println("TUESDAY");
            }
            case WEDNESDAY -> {
                System.out.println("WEDNESDAY");
            }
            case THURSDAY -> {
                System.out.println("THURSDAY");
            }
            case FRIDAY -> {
                System.out.println("FRIDAY");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("WEEKEND!");
            }
            default -> {
                System.out.println("HUH!");
            }
        }

        DayEnum day3 = DayEnum.SATURDAY;

        String result = switch (day3){
            case MONDAY -> "MONDAY";
            case TUESDAY -> "TUESDAY";
            case WEDNESDAY -> "WEDNESDAY";
            case THURSDAY -> null;
            case FRIDAY -> null;
            default -> "WEEKEND!";
        };
        System.out.println(result);
    }
}
