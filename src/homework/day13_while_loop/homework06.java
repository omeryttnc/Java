package homework.day13_while_loop;

import java.util.Scanner;

/*
6) Type java code by using while loop,
Write a program that prompts the user to input an integer.
It should then find sum of the digits of that number
 */
public class homework06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an integer");
   int sum = 0;

        int num = scn.nextInt();
   while(num>0){

       sum += num % 10;
       num/=10;



        }

  System.out.println(sum);
    }
}
