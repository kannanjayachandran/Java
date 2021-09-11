package com.First;

import java.util.Scanner;

public class SwitchCase {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the name of a fruit");
//        String fruit = in.next();
//
//
//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruits");
//                break;
//            case "apple":
//                System.out.println("red fruit");
//                break;
//            case "orange":
//                System.out.println("Orange color");
//                break;
//            default:
//                System.out.println("NO fruit");
//        }
//    }
//}
/*  The above is the old Swith case syntax in Java.
     But it can be replaced with the new cleaner syntax given below..
 */


public static void main(String[]args){
    Scanner in = new Scanner(System.in);
       System.out.println("Enter the name of a fruit");
        String fruit = in.next();

        switch (fruit){
            case "apple" -> System.out.println("Apple is 1");
            case "mango" -> System.out.println("Mango is 2");
            case "orange" -> System.out.println("Orange is 3");
            default -> System.out.println("Enter a valid fruit");
        }
}

        }
// This is the new syntax ...