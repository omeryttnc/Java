package techproed2020.day08ternatoperatordt;
/*
Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
 */
import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a two characters");

        String str1 = scn.nextLine();
        System.out.println( str1.length());
if(str1.length()<3){
    System.out.println("It is valid for state abbreviations");
}else{
    System.out.println("It is not valid for state abbreviations");
}

        System.out.println((str1.length()<3)? "It is valid for state abbreviations" : " It is not valid for state abbreviations");
    }
}
