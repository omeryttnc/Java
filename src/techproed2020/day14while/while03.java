package techproed2020.day14while;

import java.util.Scanner;

/*
Type java code by using while loop,
Write a program that prompts the user to input an integer.
It should then find sum of the digits of that number.
 */
public class while03 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter integer");
int no = scn.nextInt();
int sum = 0;
int count = 0;
while(no!=0){
int lastdigit = no%10;
no=no/10;
count++;
sum += lastdigit;
}
        System.out.println("count "+count);
        System.out.println("sum " + sum);
    }
}
