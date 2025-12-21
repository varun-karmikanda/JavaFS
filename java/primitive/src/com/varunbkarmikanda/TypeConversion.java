package com.varunbkarmikanda;

public class TypeConversion {
    public static void main(String[] args){
//        int a = 63;     // 4 bytes
//        long b = a;     // 8 bytes
//        float c = a;    // 4 bytes
//        double d = a;   // 8 bytes
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        float e = 5.1F;
//        int f = (int) e;
//        System.out.println(e);
//        System.out.println(f);

//        // Implicit/Widening/Automatic conversion
//        byte byteValue = 95;            // 1 byte
//        short shortValue = byteValue;   // 2 bytes
//        int intValue = shortValue;      // 4 bytes
//        long longValue = intValue;      // 8 bytes
//        float floatValue = longValue;   // 4 bytes
//        double doubleValue = floatValue;// 8 bytes
//
//        System.out.println("byte  : "+byteValue);
//        System.out.println("short : "+shortValue);
//        System.out.println("int   : "+intValue);
//        System.out.println("long  : "+longValue);
//        System.out.println("float : "+floatValue);
//        System.out.println("double: "+doubleValue);
//
//        char charVal = 'A';
//        int intVal = charVal;
//        float floatVal = charVal;
//        System.out.println("char  : "+charVal);
//        System.out.println("int   : "+intVal);
//        System.out.println("float : "+floatVal);

        // Explicit/Narrowing conversion
//        double doubleValue = 6351.9577;
//        float floatValue = (float) doubleValue;
//        long longValue = (long) floatValue;
//        int intValue = (int) longValue;
//
//        System.out.println("double: "+doubleValue);
//        System.out.println("float : "+floatValue);
//        System.out.println("long  : "+longValue);
//        System.out.println("int   : "+intValue);

        long a = Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a);
        int b = (int) a;         // 11111111 11111111 11111111 11111111
        System.out.println(b);

        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(9223372036854775807L));
        System.out.println(Integer.toBinaryString(-1));

    }
}
