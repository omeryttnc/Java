package homework.day04;

import java.util.Scanner;

public class homework03_swipe_by_using_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integer");
        int num1 = scn.nextInt(); //5
        int num2 = scn.nextInt(); //12
        System.out.println("before swap num1: " + num1 + " num 2: " + num2 );

        num1 = num1 + num2; //17
        num2 = num1 - num2 ;//5
        num1 = num1 - num2;
        System.out.println("after swap num1: " + num1 + " num 2: " + num2 );

    }
}
