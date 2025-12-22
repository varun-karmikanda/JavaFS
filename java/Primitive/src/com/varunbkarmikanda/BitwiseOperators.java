package com.varunbkarmikanda;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Operands --> byte, short, int, long
//        &   AND
//        |   OR
//        ^   XOR
//        ~   NOT
//        <<  LEFT SHIFT
//        >>  RIGHT SHIFT
//        >>> UNSIGNED RIGHT SHIFT

//        | A | B | & | | | ^ |
//        | 0 | 0 | 0 | 0 | 0 |
//        | 0 | 1 | 0 | 1 | 1 |
//        | 1 | 0 | 0 | 1 | 1 |
//        | 1 | 1 | 1 | 1 | 0 |

//        System.out.println(5 & 4);
//        System.out.println(5 | 7);
//        System.out.println(5 ^ 7);
//        System.out.println(~5);
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(-6));

//        // LEFT SHIFT
//        int a = 5;
//        System.out.println(Integer.toBinaryString(a));
//        int b = a << 1;
//        System.out.println(b);
//        System.out.println(Integer.toBinaryString(b));

//        // RIGHT SHIFT
//        int a = 5;
//        System.out.println(Integer.toBinaryString(a));
//        int b = a >> 1;
//        System.out.println(b);
//        System.out.println(Integer.toBinaryString(b));

        // UNSIGNED RIGHT SHIFT
        int a = -5;
        System.out.println(Integer.toBinaryString(a));
        int b = a >> 1; // RIGHT SHIFT
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        int c = a >>> 1; // UNSIGNED RIGHT SHIFT
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));

    }
}
