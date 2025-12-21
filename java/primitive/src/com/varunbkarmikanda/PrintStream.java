package com.varunbkarmikanda;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

public class PrintStream {
    public static void main(String[] args) {
//        Map<String, String> getENV = System.getenv();
//        System.out.println("Hello, World!");
//        // out is a static member of the system class which is conned to console
//
//        System.out.println(1);
//        System.out.println('x');
//        System.out.println("NiTR0X");
//        System.out.println();
//
//        System.out.print(1);
//        System.out.print('x');
//        System.out.print("NiTR0X");
//        System.out.println();

//        int a = 1;
//        int b = 2;
//        String c = "Sum";
//        System.out.println(a + b + c);
//        System.out.println(c + a + b);
//        System.out.println(c + ": " + (a + b));
//        System.out.println();
//
//        System.out.println(c + " of " + a + " & " + b + ": " + (a + b));
//        System.out.print(c + " of " + a + " & " + b + ": " + (a + b) + "\n");
//        System.out.printf(c + " of " + a + " & " + b + ": " + (a + b) + "\n");
//        System.out.printf("%s of %d & %d: %d", c, a, b, a+b);
//
//        char d = 'v';
//        float e = 123.67f;
//        float f = 1.2F;
//        System.out.println();
//        System.out.printf("Char: %c", d);
//        System.out.println();
//        System.out.printf("Float: %f", f);
//        System.out.println();
//        System.out.printf("Exp: %e", e);

        double number = 1323211321.67;

        System.out.printf("Default Locale: %,.2f%n", number);
        System.out.printf(Locale.US, "US Locale     : %,.2f%n", number);
        System.out.printf(Locale.GERMAN, "Germany Locale: %,.2f%n", number);
        System.out.printf(Locale.FRANCE, "France Locale : %,.2f%n", number);
    }
}
