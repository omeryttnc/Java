package homework.day06;

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter annual salary" );
        int num1 = scn.nextInt();

        if(num1> 18 && num1<65){
            System.out.println("You should work");
        }else{
            System.out.println("No need to work");
        }
    }
}
