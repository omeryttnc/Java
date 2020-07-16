package homework.day06;

import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age and gender");
        int age = scn.nextInt();
        scn.nextLine();
        String gender = scn.nextLine();
        if (gender.equals("male") && age > 65) {
            System.out.println("Hey man you retired");
        } else {
            System.out.println("No need to work");
        }
    }
}
