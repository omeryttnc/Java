package repl;

import java.util.Scanner;

public class cs2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number1> number2){
            System.out.println(number1 + " > " + number2);
        }
        if(number1>= number2){
            System.out.println(number1 + " >= " + number2);
        }
        if(number1< number2){
            System.out.println(number1 + " < " + number2);
        }
        if(number1<= number2){
            System.out.println(number1 + " <= " + number2);
        }
        if(number1 == number2){
            System.out.println(number1 + " == " + number2);
        }
        if(number1 != number2){
            System.out.println(number1 + " != " + number2);
        }


    }
}