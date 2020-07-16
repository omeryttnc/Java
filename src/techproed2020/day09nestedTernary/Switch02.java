package techproed2020.day09nestedTernary;

import java.util.Scanner;

/*
Type code which types “even” for even integers, and “odd” for odd integers on console. Use if else if and switch
 */
public class Switch02 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scn.nextInt();

        if(number % 2 == 0){
            System.out.println("even ");

        }else{
            System.out.println("odd");
        }

        System.out.println(number % 2 == 0 ? "even" : "bad");




//        switch (number){
//            case number % 2==0:

            }
        }




