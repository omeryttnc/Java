package practice.day_03;

import java.util.Scanner;

/*
Ask user to enter first and last name.
Then print the first initial Upper Case and rest lower case
And print the last initial Upper Case and rest lower case
e.g
JoHN cash => John Cash
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first name");
        String first = scn.nextLine();
        System.out.println("enter last name");
        String last = scn.nextLine();
        System.out.println(first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase() +" "+
                            last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase());


    }
}
