package homework.day04;

import java.util.Scanner;

public class homework07_square_or_not {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length and width");
        int num1 = scn.nextInt();
        int num2= scn.nextInt();
        if(num1 == num2){
            System.out.println("it is square");
        }
        if(num1 != num2){
            System.out.println("it is not square");
        }
    }
}
