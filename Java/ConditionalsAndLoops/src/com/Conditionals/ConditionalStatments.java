package com.Conditionals;

public class ConditionalStatments {
    public static void main(String[] args) {
        int age = 21;
        int marks = 95;

        // IF

//        if(age <= 24 && marks >= 33){
//            System.out.println("Congrats");
//        } else {
//            System.out.println("Better luck next time!");
//        }

        // IF-ELSE

//        if(marks >= 90){
//            System.out.println("Grade A");
//        } else if (marks >= 75) {
//            System.out.println("Grade B");
//        } else if (marks >= 60) {
//            System.out.println("Grade C");
//        } else {
//            System.out.println("Grade D");
//        }

        // SWITCH-CASE

//        int day = 9;
//
//        switch (day){
//            case 1:{
//                System.out.println("Monday");
//                break;
//            }
//            case 2: {
//                System.out.println("Tuesday");
//                break;
//            }
////            default: {
////                System.out.println("haha");
////            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thursday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("Saturday");
//                break;
//            }
//            case 7: {
//                System.out.println("Sunday");
//                break;
//            }
//            default: {
//                System.out.println("Enter a valid day!");
//            }
//        }


//        String fruit = "Mango";
//
//        switch (fruit){
//            case "Apple": {
//                System.out.println("Apple!");
//                break;
//            }
//            case "Mango": {
//                System.out.println("Mango!");
//                break;
//            }
//            default: {
//                System.out.println("Other fruit!");
//            }
//        }

        int number = 0;

        switch (number){
            case 0: break;
            case 1:
            case 2:
            case 3: {
                System.out.println("Number is 1, 2 or 3!");
                break;
            }
            case 4:
            case 5: {
                System.out.println("Number is 4 or 5!");
                break;
            }
            default:{
                System.out.println("Number is not 1, 2, 3, 4 or 5!");
            }
        }

        // Can use switch case on
        // byte, short, char, int, String, Enum Types

    }
}
