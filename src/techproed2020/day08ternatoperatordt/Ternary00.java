package techproed2020.day08ternatoperatordt;

import java.util.Scanner;

public class Ternary00 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter integer");
    int no = scn.nextInt();
//
//        if(no>10){
//            System.out.println("Good");
//        }else{
//            System.out.println("bad");
//        }

        String result = no > 10 ? "good" : "bad";
        System.out.println(result);


    }
}
