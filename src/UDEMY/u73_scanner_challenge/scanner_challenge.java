package UDEMY.u73_scanner_challenge;

import java.util.Scanner;

public class scanner_challenge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");
            boolean isAnInt = scn.hasNextInt();
            if (isAnInt){
                int number =scn.nextInt();
                counter ++;
                sum +=number;
                if(counter == 10){
                    break;
                }

            }else{
                System.out.println("Invalid number");
            }



        }
        System.out.println(sum);
        scn.close();


    }
}