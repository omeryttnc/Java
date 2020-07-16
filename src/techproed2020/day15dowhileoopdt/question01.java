package techproed2020.day15dowhileoopdt;

import java.util.Scanner;

/*
Ask user ta enter his/her first name, last name and Social Security Number.
 Then type a program which makes
 a)initials of the first name and the last name in uppercase,
other characters will be in lowercase.b)all characters except last 4 characters of the Social Security Number “ * ”.
	For example; Suleyman Alptekin *****5678
 */
public class question01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = scn.next();
        System.out.println("Enter your last name");
        String last = scn.next();
        System.out.println("Enter your ssn");
        String ssn = scn.next();

        String intialFirstname = name.substring(0,1).toUpperCase();
        String othersFirstname = name.substring(1).toLowerCase();
        String correctedFirstName= intialFirstname + othersFirstname;


        String intialLastname = last.substring(0,1).toUpperCase();
        String othersLastname = last.substring(1).toLowerCase();
        String correctedLastName= intialLastname + othersLastname;


        System.out.println(correctedFirstName + " " + correctedLastName);


    }

}
