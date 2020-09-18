package repl;

import java.util.Scanner;

/*
 Write a program in Java to display the cube of the number upto given an integer.
Number is : 1 and cube of 1 is : 1
 */
public class q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and cube of "+ i + " is : " + i*i*i);
        }


    }
}
