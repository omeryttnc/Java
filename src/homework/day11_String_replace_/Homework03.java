package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an letter");
        char letter = scn.next().charAt(0);

        String result = letter > 'A' && letter < 'Z' ? (letter < 'F' ? ("Big before F") : ("Big after F")) : ("not big letter");
        String reslut2 = letter > 'a' && letter < 'z' ? (letter < 'h' ? ("small before h") : ("small after h")) : ("not small letter");
        System.out.println(result + " " + reslut2);


    }
}
