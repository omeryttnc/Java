package techproed2020.day13wrapperscropewhieledt;

import java.util.Scanner;

public class Forloop01_interview {
    public static void main(String[] args) {
        /*
        user enter string
        type java code to print String reverse on the console
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any string to reverse");
        String answer = scn.nextLine();
       //int length = answer.length();
       for(int length = answer.length() - 1 ; length >= 0 ; length -- ){
           System.out.print(answer.charAt(length));

        }

    }
}
