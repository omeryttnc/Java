package repl;

import java.util.Scanner;

public class cs9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int count = 0;
        System.out.println("The odd numbers are :");
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                count++;
                if (count == n) {
                    break;
                }
            }
        }
        System.out.println("The Sum of odd Natural Number upto " +n+ "terms is: " + sum);
    }
}
