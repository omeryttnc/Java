package techproed2020.day14while;

import java.util.Scanner;

/*
give the factors of the number which is given by user
 */
public class while02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter integer");
        int no = scn.nextInt();
        int i = 1;
        int count= 0;
        while (i <= no) {
            if (no % i == 0) {
                System.out.print(i+" ");
                count ++;
            }
            i++;
        }
        System.out.println("");
        System.out.println(count);
    }
}
