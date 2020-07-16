package homework.day09_SwitchStatementQuestions;

import java.util.Scanner;

/*

Type java code by using switch statement.
A school has following rules for grading system:
1. For 50 - C 2. For 80 - B. 4. For 100 - A
Ask user to enter marks and print the corresponding grade.
 */
public class Homework03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a mark");
        int mark = scn.nextInt();


        switch (mark){
            case 50:
                System.out.println("C");
                break;

            case 80:
                System.out.println("B");
                break;

            case 1000:
                System.out.println("A");
                break;
            default:
                System.out.println("check your number");

        }
    }
}
