package techproed2020.day04operatorsifstatementdt;

import java.util.Scanner;

public class operators03 {
    public static void main(String[] args) {
        /*
        Ask user to enter two integer values. Write a Java Program to swap
two numbers without using the third variable.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two digit");
        int a = scn.nextInt();
        int b = scn.nextInt();

  a = a+b;
  b = a-b;
  a = a-b;
        System.out.println(a +"," +b);
scn.close();
    }
}
