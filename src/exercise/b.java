package exercise;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 0 - 100");
        int guess = scan.nextInt();
        int count = 1;
        while (num != guess) {
            if (num > guess) {
                System.out.println("Your guess too low. Try again!");
                guess = scan.nextInt();
            }
            if (num < guess) {
                System.out.println("Your guess too high. Try again!");
                guess = scan.nextInt();
            }
            count++;
        }
        System.out.println("Yes, The number is " + num);
        System.out.println("you tried " + count + " times");
    }
}