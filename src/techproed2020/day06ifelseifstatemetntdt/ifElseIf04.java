package techproed2020.day06ifelseifstatemetntdt;

import java.util.Scanner;

public class ifElseIf04 {
    public static void main(String[] args) {
        /*
        Ask user ta enter annual salary, if the salary is more than or equal
to $80.000 output will be “I accept the offer”, if the salary is between
$60.000 and $80.000 out put will be “I negotiate to increase”,
otherwise output will be “I do not accept the offer.”

         */
        Scanner scn = new Scanner(System.in);
        System.out.println("enter annual salary" );
        int num1 = scn.nextInt();
  if(num1>= 80_000){
      System.out.println("I accept the offer");

  }else if(num1>60_000){
      System.out.println("I negotiate to increase");
  }else{
      System.out.println("I do not accept the offer.");
  }
  scn.close();
    }
}
