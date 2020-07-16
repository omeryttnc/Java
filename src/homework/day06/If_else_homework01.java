package homework.day06;

import java.util.Scanner;

/*
Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers”
 */
public class If_else_homework01 {
    public static void main(String[] args) {


    Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integers");
    int num1 = scn.nextInt();
    int num2 =scn.nextInt();
    if(num1 > 0 && num2 > 0){
        System.out.println("sum: " + (num1 + num2));
    }else if(num1 < 0 && num2 < 0){
        System.out.println("sum: " + (num1 * num2));
    }else {
        System.out.println("I cannot add or multiply different signed numbers");
    }




}}
