package homework.day03;
/*
Type a program which asks user to enter his/her first name and last name,
then print it on the console.
Hint: To get String, use nextLine()
 */
import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your first name and last name");
        String name = scn.nextLine();
        String surname = scn.nextLine();
        System.out.println("your name and surname is " + name +" " + surname);
    }
}
