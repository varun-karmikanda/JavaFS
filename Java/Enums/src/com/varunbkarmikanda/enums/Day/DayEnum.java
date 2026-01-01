package com.varunbkarmikanda.enums.Day;

public enum DayEnum {

    // Without custom constructors

//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Custom constructors
    SUNDAY("Sunday", "sun"),
    MONDAY("Monday", "mon"),
    TUESDAY("Tuesday", "tue"),
    WEDNESDAY("Wednesday", "wed"),
    THURSDAY("Thursday", "thu"),
    FRIDAY("Friday", "fri"),
    SATURDAY("Saturday", "sat");

    private String lower;

    private String alternate;

    public String getLower() {
        return lower;
    }

    public String getAlternate(){
        return alternate;
    }

    private DayEnum(String lower, String alternate){
        this.lower = lower;
        this.alternate = alternate;
//        System.out.println("Our constructor called!");
    }

    public void display(){
        System.out.println("Today is "+ this.name());
    }

}
