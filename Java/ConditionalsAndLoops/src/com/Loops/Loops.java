package com.Loops;

public class Loops {
    public static void main(String[] args){
        // WHILE
//        int i=1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

        //DO WHILE
//        int i= 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);

        // FOR
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }


//        for (int i = 1; i<= 100000; i=i*10){
//            System.out.println(i);
//        }
//
//        for (int i = 1, j = 1; j <= 6; i=i*10, j++){
//            System.out.println(i);
//        }

        // 14 Table
//        for (int i=1; i<= 10;i++){
//            System.out.println("14 X "+ i + " = " + i * 14);
//        }

//        // Sum of N natural numbers
//        int N = 50  ;
//        int sum =0;
//        for(int i=1;i<=N;i++){
//            sum += N;
//        }
//        System.out.println(sum);

//        // Count digits of a number
//        long num = 126893213131L;
//        int count = 0;
//        while (num > 0){
////            num = num / 10;
//            num /= 10;
//            count++;
//        }
//        System.out.println(count);

//        // Factorial
//        int n = 7;
//        int factorial = 1;
//        for (int i=n;i>0;i--){
//            factorial *= i;
//        }
//        System.out.println(n+"! = "+factorial);

        // Pattern
        int n =6;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
