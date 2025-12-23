package com.varunbkarmikanda.oop.pillars.inheritance.human;

public class GrandParent {
    private String name;

    private int age;

    private boolean hasSuperPowers;

    public GrandParent(String name, int age){
        this.name = name;
        this.age = age;
        hasSuperPowers = false;
        System.out.println("GrandParent constructor called.");
    }

    public boolean getHasSuperPowers() {
        return hasSuperPowers;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GrandParent{" +
                "\n\tname=" + name + "," +
                "\n\tage=" + age + "," +
                "\n\thasSuperPowers=" + hasSuperPowers + "," +
                "\n}";
    }
}
