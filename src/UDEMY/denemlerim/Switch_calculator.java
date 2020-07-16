package UDEMY.denemlerim;

import java.util.Scanner;

public class Switch_calculator {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        System.out.println("enter your first digit");
        double firstDigit = scn.nextDouble();
        System.out.println("enter your second digit");
        double secondDigit = scn.nextDouble();
        System.out.println("enter your operation");
        char operation = scn.next().charAt(0);

        switch (operation){
            case '*':
                System.out.println("it is multipication and result is: " + (firstDigit * secondDigit));
                break;
            case '/':
                System.out.println("it is divison and result is: " + (firstDigit / secondDigit));
                break;
            case '+':
                System.out.println("it is addition and result is: " + (firstDigit + secondDigit));
                break;
            case '-':
                System.out.println("it is substruction and result is: " + (firstDigit - secondDigit));
                break;

            default:
                System.out.println("check your digits");
        }

    }
}


