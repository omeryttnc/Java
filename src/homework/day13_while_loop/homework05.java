package homework.day13_while_loop;

import java.util.Scanner;

/*
5) Type java code by using while loop,
Write a program to count the factors of an integer which is entered by user.


 */
public class homework05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter integer");

       // int count = 0;
        String factors = " ";
        int i = 1;
        int no = scn.nextInt();

        while (i <= no) {
            factors += (no % i == 0) ? (i + " ") : "";

            i++;
        }


        System.out.println("factors of " + no + " : " + factors);
    }
}




//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = scan.nextInt();
//        int i = 1;
//        String factors = "";
//        while (i <= num) {
//            factors += num % i == 0 ? (i + " ") : "";
//            i++;
//        }
//        System.out.println("Factors of " + num + " : " + factors);
//    }
//}