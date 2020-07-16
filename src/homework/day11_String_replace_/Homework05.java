package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter a word which has 4 letters and output will be inverse of the word.
For example; if user enters “MARK” output will be “KRAM”
 */
public class Homework05 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an name");
        String name = scn.nextLine();

  for(int i = 3; i>=0; i--){
      System.out.print(name.charAt(i));

    }

        }
    }

