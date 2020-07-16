package UDEMY.u71_scanner;

import java.util.Scanner;

public class Scanner_exercise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter your age " );
        int age = scn.nextInt();
  scn.nextLine();



        System.out.println("enter your name " );
        String name = scn.nextLine();
        System.out.println("birth date is " + (2020 - age) + ", and your name is " + name);
    }
}
