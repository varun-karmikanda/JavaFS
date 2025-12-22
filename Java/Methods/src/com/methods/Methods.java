package com.methods;

public class Methods {
    public static void main(String[] args) {

        int[] array = {31, 6543, 67, -31, 3, 86};
        int z = sumOfArray(array);
        System.out.println("SUM = " + z);

            int a = 321;
            int b = 972;
            int sum = sumOfTwo(a, b);
            System.out.println("SUM = "+sum);

        String name = "    Varun B Karmikanda          ";
        String filteredName = filterString(name);
        System.out.println(filteredName);

    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }

    private static int sumOfTwo(int a, int b){
        return a + b;
    }

    private static String filterString(String s){
        return s.trim().toUpperCase();
    }
}
