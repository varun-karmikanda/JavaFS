package com.datatypes;

public class Strings {
    public static void main(String[] args) {

        // Strings are immutable.
        // Why?
        // Strings are saved in string pools for optimization purpose
        // String name1 = "Varun";
        // String name2 = "Varun";
        // Here both name1 and name to points to the same reference in the string pool
        // Lets say I updated the name1 that means that it updates the value for the name 2 as its is pointed to the same reference
        // This is not safe. Hence the STRINGS are immutable.

        // Whenever a new method is applied on a string it returns a new string instead of modifying the same string


//        String address = new String("India");
//        String name = "Varun B Karmikanda"; // Directly using literal
//        System.out.println(name);

//        String a = new String("Varun");
//        String b = new String("Varun");
//        System.out.println(a == b);
//
//        String c = "Varun";
//        String d = "Varun";
//        System.out.println(c == d);

//        String x = "Varun";
//        String a= new String("Varun");
//        String b= new String(x);
//        String c = "Varun";
//        String d = x;
//        System.out.println(a == b);
//        System.out.println(c == d);

//        String name = "Varun B Karmikanda";
//        int length = name.length();
////        System.out.println(length);
//        char ch = name.charAt(length - 1);
////        System.out.println(ch);
//
//        // == checks the reference
//        // .equals() checks individual characters
//
//        String name2 = "varun b karmikanda";
////        System.out.println(name.equals(name2));
////        System.out.println(name.equalsIgnoreCase(name2));
//
//        String name3 = new String("Varun B Karmikanda");
////        System.out.println(name.equals(name3));
////        System.out.println(name3.equals(name));

//        String str1 = "remote";
//        String str2 = "ramote";
//        System.out.println((int) 'e');
//        System.out.println((int) 'a');
//        int i = str1.compareTo(str2);   // .compareTo() basically returns the difference of the first mismatched characters ASCII values
//        System.out.println(i);          // Case-sensitive
//        System.out.println();
//
//        String s1 = "nitr0X";
//        String s2 = "NiTR0X";
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareToIgnoreCase(s2));

        String name = "Varun B Karmikanda";
//        String substring1 = name.substring(8);
//        String substring2 = name.substring(8, name.length()); // As it only print till (arg2 - 1)
//        String substring3 = name.substring(2, 6);
//        System.out.println(substring1);
//        System.out.println(substring2);
//        System.out.println(substring3);
//
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//
//        String n = "   Varun     Karmikanda       ";
//        System.out.println(n.trim());       // Removes the unwanted spaces in the beginning and end

//        String newName = name.replace("B Karmikanda", "Devadiga");
//        System.out.println(newName);

//        System.out.println(name.contains("Karmikanda"));
//        System.out.println(name.contains("i"));

//        System.out.println(name.startsWith("Var"));
//        System.out.println(name.endsWith("da"));

//        String str1 = "";
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.isBlank());
//
//        String str2 = " ";
//        System.out.println(str2.isEmpty());
//        System.out.println(str2.isBlank());
//
//        System.out.println(name.indexOf("a"));
//        System.out.println(name.lastIndexOf("a"));
//        System.out.println(name.indexOf("Kar"));
//        System.out.println(name.indexOf("a", 7));

//        int a = 10;
//        String s = String.valueOf(a);
//        System.out.println(s);
//        System.out.println(s.length());

        // Methods that we access from the class is called as static methods

        String formattedString = String.format("My name is %s. I am %d years old", name, 21);
        System.out.println(formattedString);

        System.out.println(name.substring(2, 11));
        System.out.println(name.subSequence(2, 11)); // returns CharSequence

        String a = name.substring(2, 11);
        System.out.println(a);
//        String b = name.subSequence(2, 11); // returns CharSequence so this is not possible

    }
}
