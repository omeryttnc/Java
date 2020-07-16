package techproed2020.day06ifelseifstatemetntdt;

import java.util.Scanner;

public class IfElseIf03 {
    public static void main(String[] args) {
        /*
        Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D     2. 50 to 60 - C       3. 60 to 80 - B.     4. Above 80 - A
Ask user to enter marks and print the corresponding grade.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two integers" );
        int num1 = scn.nextInt();
   if(num1<50){
       System.out.println("you got D");
   }else if(num1<60){
       System.out.println("you got C");
   }else if(num1<80){
       System.out.println("you got B");
   }else {
       System.out.println("you got A");
   }
scn.close();
    }
}
