package homework.day13_while_loop;

import java.util.Scanner;

/*
3) Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.


 */
public class homework03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int i = -1;
        int product = 1;

        while (i < 1) {
            System.out.println("enter an prompt number");
            i = scn.nextInt();
        }
        while (i>0){
            product *=i;
            i--;
            System.out.println(product);

        }
    }
}
