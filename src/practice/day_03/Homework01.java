package practice.day_03;

import java.util.Scanner;

/*
Ask user to enter a word.
If the word has odd number of characters and has 3 or more character,
Then print the character in the middle of the word.
If there is only one character, print “Please enter more than one
character
,otherwise print the first and last char of the word.
E.g
Javac => “v”
J=> print “Please enter more than one character”
Java => “Ja”
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scn.nextLine();
        int wordLength = word.length();
        int wordMiddle = (wordLength/2);
        System.out.println((wordLength % 2 != 0) && wordLength>=3 ? word.charAt(wordMiddle): "enter one more character");
    }
}
