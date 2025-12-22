package com.Conditionals;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a == b: "+ (a == b));
        System.out.println("a <  b: "+ (a < b));
        System.out.println("a <= b: "+ (a <= b));
        System.out.println("a >  b: "+ (a > b));
        System.out.println("a >= b: "+ (a >= b));
        System.out.println("a != b: "+ (a != b));

        String str1 = "JAVA";
        String str2 = "JAVA";
        String str3 = new String("JAVA");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }
}
