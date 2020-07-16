package homework.day04;

import java.util.Scanner;

public class homework02_swipe_by_using_third {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integer");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = 0;
        System.out.println("before swap num1: " + num1 + " num 2: " + num2 );
        num3=num2;
        num2=num1;
        num1=num3;
        System.out.println("after swap num1: " + num1 + " num 2: " + num2 );

    }
}
