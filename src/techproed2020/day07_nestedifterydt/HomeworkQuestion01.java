package techproed2020.day07_nestedifterydt;

import java.util.Scanner;

public class HomeworkQuestion01 {
    public static void main(String[] args) {
        /*
        Type java code by using if-else if() statement.
Write a program to check if a year is leap year or not.
if the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("enter year");
        int year = scn.nextInt();

        if((year % 400 == 0) && (year % 100 == 0)){
            System.out.println("it is leap year");
        }else if((year % 100 != 0) && (year % 4 == 0)){
            System.out.println("it is leap year");
        } else {
            System.out.println("it is not leap year");
        }

    scn.close();
    }

}
