package homework.day15_while_do;

import java.util.Scanner;

/*
5) Ask user to enter a number.
If the number is divisible by 10 then print "Won!" on the console
otherwise ask user to enter another number.
Use do-while loop.
"
 */
public class Homework05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int i;


        do{
            i = scn.nextInt();

        if(i % 10 != 0) {
            System.out.println("enter another number");
        }
        }while (i % 10 !=0);

        System.out.println("won");
    }
}
