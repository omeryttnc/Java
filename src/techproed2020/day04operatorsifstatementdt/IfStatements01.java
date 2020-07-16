package techproed2020.day04operatorsifstatementdt;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        /*
        get an integer from user posisitive negative print
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("enter digit");
        int num = scn.nextInt();

        if(num>=0){
            System.out.println("it is positive");

        }else{
            System.out.println("it is negative");

       scn.close();
        }
    }
}
