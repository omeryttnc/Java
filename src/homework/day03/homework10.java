package homework.day03;

import java.util.Scanner;
/*
Type a program which asks user to enter his/her full name, and address
then print them on the console like the full name should be in the first line,
and the address will be in the second line.
Hint: To get String, use nextLine()
 */
public class homework10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your first name, last name and address");
        String name = scn.nextLine();
        String surname = scn.nextLine();
        String address = scn.nextLine();

        System.out.println("your name and surname is " + name +" " + surname);
        System.out.println(address);
    }
}
