package homework.day04;

import java.util.Scanner;

public class homework05_initial_of_the_day_of_a_week {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an initial");
        String initial = scn.nextLine().toLowerCase();
        if(initial.contains("s")) {
            System.out.println("Saturday or Sunday");
        }
        if(initial.contains("m")) {
            System.out.println("Monday");
        }if(initial.contains("t")) {
            System.out.println("Tuesday and Thursday");
        }if(initial.contains("w")) {
            System.out.println("Wednesday");
        }if(initial.contains("f")) {
            System.out.println("Friday");
        }else{
            System.out.println("check your letter");
        }

    }
}
