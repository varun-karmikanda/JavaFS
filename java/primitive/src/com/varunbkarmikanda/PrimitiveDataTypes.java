package com.varunbkarmikanda;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        // Integral numbers
            // byte
            // short
            // int
            // long

        byte num1 = 127;
        Short num2 = 32767;
        int num3 = 2147483647;
//        long num4 = 2147483648; // for long we need to use L at the end if the value exceeds integer max/min value
        long num4 = -9223372036854775808L;

//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);

//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);

        // Decimal numbers
            // float
            // double

        float dNum1 = 6363.51515151515151F;   // Approx 7 digit after decimal point in float(Max)
        float dNum1x = 6.51515151515151F;
        double dNum2 = 6363.51515151515151;   // Approx 15 digit after decimal point in double(Max)
        double dNum2x = 6.51515151515151;

//        System.out.println("Float: "+ dNum1);
//        System.out.println("Float: "+ dNum1x);
//        System.out.println("Double: "+dNum2);
//        System.out.println("Float: "+ dNum2x);

        float dNum1y = 6363005555555533355555555333.51515151515151F;
        double dNum2y = 6363005555555533355555555333.51515151515151;

//        System.out.println("Float: "+ dNum1y);
//        System.out.println("Float: "+ dNum2y);
//
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Float.MAX_VALUE);
//
//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);


        // Characters
            // char

        char character = 'V';
//        System.out.println(character);
//        System.out.println((int) character);

//        System.out.println((int) Character.MIN_VALUE);
//        System.out.println((int) Character.MAX_VALUE);

//        System.out.println((char) 10084);
//        char heart = '\u2764';              //UNICODE representation
//        System.out.println(heart);
//
//        char symbol = 9760;
//        System.out.println(symbol);
//
//        char sz = '\u5a45';
//        System.out.println(sz);

//        for(int i=0;i<65536;i++){
//            if(i != 0 && i%60==0) System.out.println();
//            System.out.print((char) i+" ");
//        }

        // Booleans
            //boolean

        boolean isReal = true;
        System.out.println(isReal);

        boolean isEligible = false;
        System.out.println(isEligible);

    }
}
