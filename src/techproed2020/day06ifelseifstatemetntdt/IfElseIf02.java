package techproed2020.day06ifelseifstatemetntdt;

import java.util.Scanner;

public class IfElseIf02 {
    public static void main(String[] args) {
        /*
        Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers”
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two integers" );
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if(num1>0 && num2>0){
            System.out.println(num1+num2);
        }else if(num1<0 && num2<0){
            System.out.println(num1*num2);

        }else{
            System.out.println("I cannot add or multiply different signed numbers");
        }


    }
}
