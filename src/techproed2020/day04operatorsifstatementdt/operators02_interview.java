package techproed2020.day04operatorsifstatementdt;

import java.util.Scanner;

public class operators02_interview {
    public static void main(String[] args) {
        /*
        Ask user to enter two integer values. Write a Java Program to swap
 two numbers by using the third variable.
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("enter two digit");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = 0;

        System.out.println("Before swapping a: " + a + "," + "b: " + b);
        c = a ;
        a = b ;
        b = c;
        System.out.println("After swapping a: " + a + "," + "b: " + b);
   scn.close();
    }
}
