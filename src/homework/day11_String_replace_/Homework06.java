package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter a String and output will be the number of the characters in the String.
 */
public class Homework06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an name");
        String name = scn.nextLine();
        System.out.println(name.length());

        }
    }

