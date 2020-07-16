package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
“This name contains neither ‘a’ nor ‘z’.”
 */
public class Homework02 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter an name");
        String name = scn.nextLine();
if(name.contains("a")){
    System.out.println("This name contains ‘a’");
}else if(name.contains("z")){
    System.out.println("This name contains ‘z’");
}else{
    System.out.println("This name contains neither ‘a’ nor ‘z’.");
}
    }
}
