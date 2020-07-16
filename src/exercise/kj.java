package exercise;

import java.util.Scanner;

public class kj {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("Please enter a number = ");
            number = scan.nextInt();
            if (number % 10 == 0) {
                System.out.println("You Won!");
            }
        } while (number % 10 != 0);


    }
}
