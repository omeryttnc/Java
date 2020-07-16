package homework.day04;

import java.util.Scanner;

public class homework06_workday_weekend {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = scn.nextLine().toLowerCase();
        if (day.contains("Monday".toLowerCase())) {
            System.out.println("weekday");
        }
        if (day.contains("Tuesday".toLowerCase())) {
            System.out.println("weekday");
        }
        if (day.contains("Wednesday".toLowerCase())) {
            System.out.println("weekday");
        }
        if (day.contains("Thursday".toLowerCase())) {
            System.out.println("weekday");
        }
        if (day.contains("Friday".toLowerCase())) {
            System.out.println("weekday");
        }
        if (day.contains("Saturday".toLowerCase())) {
            System.out.println("weekend");
        }
        if (day.contains("Sunday".toLowerCase())) {
            System.out.println("weekend");
        }

    }
}

