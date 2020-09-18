package revision.officeHours.day01;

import java.util.Random;
import java.util.Scanner;

public class example03_guessNumber {
    public static void main(String[] args) {


        Random rnd = new Random();
        int number = rnd.nextInt(100);
        System.out.println(number);
        int guessNumber;
        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a digit");
            guessNumber = scanner.nextInt();
            count ++;
            if (guessNumber == number) {
                System.out.println("you got the answer");
            } else if (guessNumber > number) {
                System.out.println(" your number is bigger than number try again");
            } else {
                System.out.println("your number is smaller than try again");
            }

        } while (number != guessNumber);
        System.out.println("you got the answer but you tried " + count + " times");
    }
}