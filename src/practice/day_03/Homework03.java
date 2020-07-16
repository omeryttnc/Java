package practice.day_03;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your sentences");
        String word = scn.nextLine();
    int wordWithSpace = word.trim().length();
    int wordWithoutSpace = word.trim().replaceAll("\\s","").length();


   int difference = wordWithSpace-wordWithoutSpace;
        System.out.println("word with space " + wordWithSpace);
        System.out.println("word without space " + wordWithoutSpace);
       System.out.println("your sentence has " + (difference+1 )+" words");


    }

}
