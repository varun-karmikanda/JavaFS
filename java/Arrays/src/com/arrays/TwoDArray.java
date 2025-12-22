package com.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int[][] nums = {
                {1, 2, 3, 10}, // Jagged array: Array of different length of array
                {4, 5 ,6},
                {7, 8, 9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j=0;j< nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        char[][] a = new char[3][];
        a[0] = new char[2];
        a[1] = new char[3];
        a[2] = new char[2];
        a[0][0] = 'a';
        a[0][1] = 'b';
        a[1][0] = 'c';
        a[1][1] = 'd';
        a[2][0] = 'e';
        a[2][1] = 'f';
        for (int i = 0; i < a.length; i++) {
            for (int j = 0;j < a[i].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
