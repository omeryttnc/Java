package homework.day02;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
/*
Type a program which calculates the cube of a number which is entered by
user.
Hint 1: Cube of a number is a x a x a
 */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a side for cube");
        int sideOfCube = scn.nextInt();
        System.out.println("cube is: " + sideOfCube *sideOfCube*sideOfCube);

    }
}
