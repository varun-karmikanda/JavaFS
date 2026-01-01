package com.varunbkarmikanda.enums.Months;

public class Month {

    public static enum Months{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public static void main(String[] args) {
        Months month = Months.MAY;
        System.out.println(month);
    }

}
