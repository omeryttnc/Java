package homework.day02;

import java.util.Scanner;

/*
Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use byte)
Hint 1: Perimeter of a triangle is a + b + c
Hint 4: To get byte, use nextByte()
 */
public class homework6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the three side ");
        byte side1 = scn.nextByte();
        byte side2 = scn.nextByte();
        byte side3 = scn.nextByte();
        System.out.println("the perimeter: " + (side1 + side2 + side3));
    }
}
