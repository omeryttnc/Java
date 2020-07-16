package UDEMY.u72_scanner_problem;

import java.util.Scanner;

public class Scanner_common_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your birth date : ");
        boolean hasNextInt = scn.hasNextInt();
        if (hasNextInt) {
            int dateOfBirth = scn.nextInt();
            scn.nextLine();
            System.out.println("enter your name: ");
            String name = scn.nextLine();
            int age = 2020 - dateOfBirth;
            if (age >= 0 && age < 100) {
                System.out.println("your age is " + age + ", your name is " + name);
            } else {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scn.close();
    }
}
