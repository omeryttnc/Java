package homework.day04;

import java.util.Scanner;

public class homework04_The_integer_is_even {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a digit");
        int a = scn.nextInt();
        if (a % 2 == 1) {
            System.out.println(a + " is odd");
        }
            if (a % 2 == 0) {
                System.out.println(a + " is even");
            }

        }
    }
