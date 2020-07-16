package homework.day06;

import java.util.Scanner;

/*
Type java code by using if-else if() statement,
If age is less than 13 output will be “Should not work”,
If age is greater than 65 output will be “Retired”,
Otherwise; output will be “Should work
 */
public class If_else_homework02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integers");
        int num1 = scn.nextInt();
        if(num1 < 13){
            System.out.println("Should not work");
        } else if(num1 > 65){
            System.out.println("Retired");
        }else{
            System.out.println("Should work");
        }


    }
}
