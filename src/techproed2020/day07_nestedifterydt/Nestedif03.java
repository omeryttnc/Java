package techproed2020.day07_nestedifterydt;

import java.util.Scanner;

/*
Type java code by using nested if() statement.
Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”

 */
public class Nestedif03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter password");
        char password = scn.next().charAt(0);

        if (password >= 'A' && password <= 'Z') {
            if (password == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else if (password >= 'a' && password <= 'z') {
            if (password == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }

    }

}
