package techproed2020.day15dowhileoopdt;

import java.util.Scanner;

/*
// Ask user to enter an integer
// If the integer is even print on the console "You won!"
// otherwise ask user to enter another integer
 */
public class DoWhile06_first_game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a integer");
        int i = 1;
        int j = 5;
        do {
            i = scn.nextInt();
            System.out.println("try again " + j + " chance remain");
            j--;
            if (j == 0) {
                System.out.println("you lost");
                break;
            }
        } while (i % 2 != 0);
        if(j !=0) {
            System.out.println("won");
        }

    }
}
