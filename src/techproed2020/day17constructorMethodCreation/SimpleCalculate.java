package techproed2020.day17constructorMethodCreation;

import java.util.Scanner;

public class SimpleCalculate {
    public static void simpleCalculator() {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two nubers");
        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();
        System.out.println("Select an operayion +. -, *, /");
        char ch = scn.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println("your result is : " + (n1 + n2));
                break;
            case '-':
                System.out.println("your result is : " + (n1 - n2));
                break;
            case '*':
                System.out.println("your result is : " + (n1 * n2));
                break;
            case '/':
                System.out.println("your result is : " + (n1 / n2));
                break;
            default:
                System.out.println("check your operation");

        }
    }
}
