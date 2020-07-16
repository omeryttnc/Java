package techproed2020.day09nestedTernary;

import java.util.Scanner;

/*
Type java code by using nested ternary.
Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */
public class Nested_leap_year {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        System.out.println("enter year");
        int year = snc.nextInt();

   String result=      (year% 100 == 0) ? (year % 400 == 0 ? "leap year" : "not leap year" ): (year % 100 != 0 ? (year % 4 == 0? "leap year" : "it is not leap year"): "not leap year");
        System.out.println(result);

    }
}
