package com.Loops;

public class LoopControls {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
            if(i == 6) break;
        }
        System.out.println("Hello!");

        int j = 1;
        while (j <= 10){
            if (j == 6) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
        System.out.println("World!!");


        for (int k = 1;k<= 10;k++){
            if(k==6) continue;
            System.out.println(k);
        }
        System.out.println("Hello, World!");
    }
}
