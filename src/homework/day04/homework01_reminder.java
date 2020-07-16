package homework.day04;

import java.util.Scanner;

public class homework01_reminder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integer");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int width = num1%num2;
        int length = num1 + num2;

        System.out.println("area is: " + width * length);
        System.out.println("perimeter is: " + 2*(width + length));
    }

}
