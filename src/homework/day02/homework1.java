package homework.day02;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        /*
        Type a program which calculates the area and the perimeter of a square
         whose side length is entered by user.
         Hint 1: Area of a square is length x length
         Hint 2: Perimeter of a square is 4 x length

         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter Length");

        int length = scn.nextInt();
        System.out.println("area is: " + length * length);
        System.out.println("Perimeter: " + 4 * length );
    }
}
