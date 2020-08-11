package repl;

import java.util.Scanner;

public class cs10 {
    public static void main(String[] args) {
        /*
         Test Data
Input number of n : 4

1
22
333
4444
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

