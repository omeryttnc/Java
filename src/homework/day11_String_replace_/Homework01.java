package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
and print it on the console.
 */
public class Homework01 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter an integer");
        int no = scn.nextInt();
        if(no<10){
            System.out.println(no*no);

        }else if(no>10){
            System.out.println(2*no);

        }else {
            System.out.println(no);
        }



    }
}
