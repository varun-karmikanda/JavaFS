package com.arrays;

public class ForEach {
    public static void main(String[] args){
        int[] array = {1, 2, 33 , 4, 5};

        for (int i: array){
            System.out.print(i+ " ");
        }

        System.out.println();

        // Search
        int[] arr = {12, 76, -34, 29, 83, 0, 238};

        for (int i: arr){
            if (i == -34) System.out.println("Found!");
        }

        // Max
        int[] ar = new int[5];
        ar[0] = 0;
        ar[1] = 83213;
        ar[2] = 1231;
        ar[4] = -31;
        ar[3] = 532;

        int maxNum = Integer.MIN_VALUE;

        for (int i: ar){
            if(i > maxNum) maxNum = i;
        }
        System.out.println("MAX: "+maxNum);

        maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > maxNum) maxNum = ar[i];
        }

        System.out.println("MAX: "+maxNum);

        // Reverse print array
        int[] a = {21, 423, 67, 890, -12, 0, 56, -32};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse");
        for (int i = arr.length; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        // Sum
        int sum =0;
        for(int i: a){
            sum += i;
        }
        System.out.println();
        System.out.println("SUM: "+sum);
    }
}
