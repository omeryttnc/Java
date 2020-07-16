package techproed2020.day15dowhileoopdt;

import java.util.Scanner;

/*
Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 otherwise print "Normal name" and finish the loop
 */
public class DoWhile08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your first name");
        String name = " ";

        do{
            name = scn.nextLine();
            if(name.length()<6) {
                System.out.println("normal name");
            }
        }while(name.length()<=6);
        System.out.println("long name");
    }
}
