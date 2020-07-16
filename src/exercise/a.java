package exercise;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter an integer");
        int num = scan.nextInt();

        int sum =0;
        int lastdigt =0;
        while(num!=lastdigt) {
            lastdigt =num%10;
            sum =sum+lastdigt;
            num =num/10;

        }

        System.out.println(sum);

        scan.close();
    }
}
