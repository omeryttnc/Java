package techproed2020.day08ternatoperatordt;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter a digit");

        int y = scn.nextInt();
        System.out.println((y > 5)? (2 * y) : (3*y));   }
}
