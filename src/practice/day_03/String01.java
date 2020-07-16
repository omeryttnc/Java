package practice.day_03;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your hotmail");
        String hotmail = scn.nextLine();

        if(hotmail.contains("@hotmail")){
            System.out.println("your new mail is : " + hotmail.replace("@hotmail","@gmail"));
        }else {
            System.out.println("it is not hotmail");
        }
    }
}
