package techproed2020.day10stringmethodsdt;
/*
Ask user to enter a number. If the number is less than 10 and greater
     than or equal to 0, calculate its cube. Otherwise, calculate its square.
     Cube of a = a*a*a Square of a = a*a
 */
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scn.nextInt();

        int result = (number<10 && number>0) ? (number * number *number) : (number*number);
        System.out.println(result);
    }
}
