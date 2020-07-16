package homework.day02;

import java.util.Scanner;

/*
Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()
 */
public class homework8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the hours ");
        long hour = scn.nextLong();

        System.out.println("the "+ hour +" hour is : " + (60 * 60 * hour) + " seconds ");
    }
}
