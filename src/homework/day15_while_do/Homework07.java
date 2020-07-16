package homework.day15_while_do;

import java.util.Scanner;

/*
Ask user to enter a String
Print the characters whose indexes are odd on the console
For example; Germany ==> e m n
 */
public class Homework07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scn.nextLine();
        int i = 0;
        int j = str.length();
        while (i < j) {
            if (i % 2 != 0) {
                System.out.print(str.charAt(i) + " ");
            }
            i++;
        }

    }

}

