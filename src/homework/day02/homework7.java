package homework.day02;

import java.util.Scanner;

/*
Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
 */
public class homework7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the mile to convert km ");
        double mile = scn.nextDouble();

        System.out.println("km is : " + (1.6 * mile));
    }
}
