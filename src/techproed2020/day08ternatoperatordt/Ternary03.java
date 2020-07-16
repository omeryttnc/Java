package techproed2020.day08ternatoperatordt;

import java.util.Scanner;

/*
Type java code by using ternary and if-else. Ask user to enter two integers
Write a program to print the minimum one on the console.
 */
public class Ternary03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a digit");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if(num1<num2){
            System.out.println("min : " + num1);
        }else if (num2 < num1) {
            System.out.println("min " + num2);
        } else {
        System.out.println("they are equal");
    }
        System.out.println(num1<num2 ? num1 : num2);
    }
}
