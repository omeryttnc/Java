package repl;

import java.util.Scanner;

public class g7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        int average = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("average of the numbers = " + average);
    }
}