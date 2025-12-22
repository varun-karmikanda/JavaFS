package com.Conditionals;

public class LogicalOperators {
    public static void main(String[] args) {
        // && Logical AND
        // || Logical OR
        // !  Logical NOT

        // If both true  ([&&] Logical AND)
        int marks = 95;
        int age = 21;
        System.out.println(marks >= 35 && age < 24);

        // Any one condition true ([||] Logical OR)
        String name = "NiTR0X";
        int exp = 7;
        boolean tier1 = false;
        System.out.println(exp >=5 || tier1);
    }
}
