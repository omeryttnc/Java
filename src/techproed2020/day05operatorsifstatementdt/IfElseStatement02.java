package techproed2020.day05operatorsifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a char");
        char charFromUser = scn.next().charAt(0);
        if(charFromUser == 'a'){
            System.out.println("You got it");
        }else{
            System.out.println("Try again");
        }
        scn.close();
    }
}
