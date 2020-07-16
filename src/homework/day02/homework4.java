package homework.day02;
/*
Type a program which calculates the volume of a rectangular prism
whose length, with, and height are entered by user.
Hint 1: Volume of a rectangular prism is width x length x height
 */
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length with and height to find volume");
        int length = scn.nextInt();
        int with = scn.nextInt();
        int height = scn.nextInt();
        System.out.println("volume : " + length * with * height);

    }
}
