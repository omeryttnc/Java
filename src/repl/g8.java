package repl;

import java.util.Scanner;

public class g8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));

    }

    public static long sumDigits(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n%10;
            n = n / 10;
        }
        return sum;
    }
}
