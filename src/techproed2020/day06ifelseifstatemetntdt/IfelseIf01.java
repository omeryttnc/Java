package techproed2020.day06ifelseifstatemetntdt;

import java.util.Scanner;

public class IfelseIf01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an integer" );
        int num = scn.nextInt();
        if(num > 0 ){
            System.out.println("positive");
        } else if (num < 0 ){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
                   }
}
