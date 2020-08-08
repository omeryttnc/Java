package repl;

import java.util.Scanner;

public class cs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if (no==0) {
            System.out.println("It is not an ugly number\n");
        }
        while (no%2==0)
            no/=2;
        while (no%5==0)
            no/=5;
        while (no%3==0)
            no/=3;
        if(no==1){
            System.out.println(" It is an ugly number\n");
        }else{
            System.out.println("It is not an ugly number\n");
        }
    }
}
