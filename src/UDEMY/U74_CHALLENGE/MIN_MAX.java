package UDEMY.U74_CHALLENGE;

import java.util.Scanner;

public class MIN_MAX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
      //  boolean first = true;
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scn.hasNextInt();
            if (isAnInt) {
                int number = scn.nextInt();
//                if(first){
//                    first = false;
//                    max = number;
//                    min = number;
             //   }

                if(number> max){
                    max = number;
                }
            if (number < min){
                min = number;
            }
            } else {
                break;
            }
            scn.nextLine();
        }
        System.out.println("min = " + min + "," + "max " + max );

        scn.close();
    }
}

