package techproed2020.day15dowhileoopdt;

import java.util.Scanner;

/*
// Ask user to enter a number
// If the number user entered is less than 10 print "Won!" on the console
// otherwise ask user to enter a number again.
 */
public class doWhile05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i =1;
        do{
            System.out.println("Enter a number");
            i =scn.nextInt();

        }while(i>=10);
        System.out.println("Won!");
    }
}
