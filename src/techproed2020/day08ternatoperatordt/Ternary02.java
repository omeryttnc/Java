package techproed2020.day08ternatoperatordt;

import java.util.Scanner;

/*
Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
 */
public class Ternary02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a digit");

        int num = scn.nextInt();

        if(num % 2 == 0 ){
            System.out.println("The integer is even");
        } else{
            System.out.println("The integer is odd");

        }


        System.out.println(  (num % 2 == 0) ? "The integer is even" : "The integer is odd");

    }
}
