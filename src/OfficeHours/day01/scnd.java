package OfficeHours.day01;

import java.util.Scanner;

/*
Write a Java program that asks to user 2 questions
Question 1 = how many tea do you drink in a day?
Question 2 = how many sugar do you use for a glass of tea?
Calculate how many sugar does user use as kilogram in a year and in 40 years then print it on the console
If user doesn’t use sugar print “Good Job, less sugar more health”
(Hint 1 sugar = 2.7 gr)
 */
public class scnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many tea do you drink in a day?");
        int tea = scanner.nextInt();
        System.out.println("how many sugar do you use for a glass of tea?");
        int sugar = scanner.nextInt();
        double yearlySugar = (2.7 * tea * sugar * 365) / 1000;

        double totalSugar = (2.7 * tea * sugar * 365 * 40) / 1000;
        if (totalSugar == 0) {
            System.out.println("Good Job, less sugar more health");
        } else {
            System.out.println("your total sugar been used in 40 years is " + totalSugar + " kg "+ "and every year you are using " + yearlySugar +" kg");
        }
    }
}
