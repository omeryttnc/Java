package techproed2020.day05operatorsifstatementdt;

import java.util.Scanner;

public class IfEkseStatement01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an intigar");
  int num = scn.nextInt();
        if(num < 10 ){
            System.out.println("You won");
  }
//
//        else{
//            System.out.println("you lost");
//        }
if (num>=10){
    System.out.println("You lost");
}

scn.close();
    }
}
