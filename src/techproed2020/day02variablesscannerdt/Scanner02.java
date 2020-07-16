package techproed2020.day02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter two integers to add");
        int num1 = scn.nextInt();

        int num2 = scn.nextInt();
        System.out.println("sum of those two number is " + (num1 + num2));
        System.out.println("product of those two number is " + (num1 * num2));
        System.out.println("division of those two number is " + (num1 / num2));
    }
}
