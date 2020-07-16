package homework.day15_while_do;

import java.util.Scanner;

/*
6) Ask user to enter a name.
If the name contains the letter ‘a’ then print "Won!" on the console
otherwise ask user to enter another name.
Use do-while loop.

 */
public class Homework06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a name");
        String name = "";

do{
    name= scn.next();
    if(!name.contains("a")) {
        System.out.println("enter another name");
    }
}while (!name.contains("a"));
        System.out.println("won");

    }
}
