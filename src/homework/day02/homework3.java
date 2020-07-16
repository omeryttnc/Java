package homework.day02;

import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {
        /*
        Type a program which calculates the area and the perimeter of a rectangle
         whose length and with are entered by user.
         Hint 1: Area of a rectangle is width x length
         Hint 2: Perimeter of a rectangle is 2x(width + length)
         */


        Scanner scn = new Scanner(System.in);
        System.out.println("enter width and length");

        double width= scn.nextDouble();
        double length = scn.nextDouble();
        System.out.println("area: " + width * length);
        System.out.println("Perimeter: " + (2 * (width+length)));
scn.close();
    }
}
