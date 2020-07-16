package homework.day11_String_replace_;

import java.util.Scanner;

            /*
            Ask user ta enter his/her first name, last name and Social Security Number.
            Then type a program which makes
            a) initials of the first name and the last name in uppercase,
            other characters will be in lowercase.
            b) all characters except last 4 characters of the Social Security Number “ * ”.
            For example; Suleyman Alptekin *****5678
             */
public class Homework08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first name");
        String name = scn.nextLine().toLowerCase();
        System.out.println("enter last name");
        String last = scn.nextLine().toLowerCase();
        System.out.println("enter security number");
        String secNumber = scn.next();

       System.out.print(name.substring(0,1).toUpperCase()+name.substring(1)+ " " +
                        last.substring(0,1).toUpperCase()+last.substring(1) + " ");
        System.out.println(secNumber.substring(0,4) + secNumber.substring(4).replaceAll("\\d","*"));


        //System.out.println(last.toUpperCase().charAt(0));
    }

}
