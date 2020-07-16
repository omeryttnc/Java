package homework.day09_SwitchStatementQuestions;

import java.util.Scanner;

/*
Write a Java program user will choose answer among A, B, C, or D.
If the answer is true, output will be “True.” If the answer is false, output will be
“False”. Correct answer is ‘C’ for the multiple option question.
 */
public class homework2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an answer");
        String answer = scn.next().toLowerCase();

        switch (answer){

            case "a":
                System.out.println("False");
                break;

            case "b":
                System.out.println("False");
                break;

            case "c":
                System.out.println("True");
                break;

            case "d":
                System.out.println("False");
                break;


        }
    }
}
