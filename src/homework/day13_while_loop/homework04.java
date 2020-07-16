package homework.day13_while_loop;

import java.util.Scanner;

/*
4) Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.


 */
public class homework04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int product = 1;
        int no = -1;


        while (no < 1) {
            System.out.println("enter an integer");
            no = scn.nextInt();

        }
        while (no > 0) {
            product *= no;
            no--;
        }
        System.out.println(product);


    }
}
