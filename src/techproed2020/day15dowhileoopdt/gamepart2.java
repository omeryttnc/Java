package techproed2020.day15dowhileoopdt;

import java.util.Scanner;

public class gamepart2 {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int i = 1;
            int j = 5;
            do {
                System.out.println("enter a integer");
                i = scn.nextInt();
                j--;
                if (j == 0) {
                    System.out.println("you lost");
                    break;
                }

                if (i % 2 != 0) {
                    System.out.println("try again " + j + " chance remain");
                }

            } while (i % 2 != 0);
            if (j != 0) {
                System.out.println("won");
            }
            scn.close();

        }
}
