package practice.Day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Declare 3 chars: ch1=‘S’, ch2=‘A’, ch3= ‘M’
! Declare a String: name;
! Store these chars in that string and print: ‘SAM’ using the name variable
! Declare 3 Strings: name1=sam, name2=john, name3=tom
! Declare a String Array: array;
! Store this strings in that array
! And print: sam john tom
! And then print [sam,john,tom]
! Create the same array using different ways
 */
public class Warmup {
    public static void main(String[] args) {
        char ch1 = 'S';
        char ch2 = 'A';
        char ch3 = 'M';
       // System.out.println("" + ch1 + ch2 + ch3);
        List<String> ch0 = new ArrayList<>();
Scanner scn = new Scanner(System.in);
//        System.out.println("Enter capacity");
//        int capacity = scn.nextInt();
        System.out.println("Enter names");
        for (int i = 1 ; i<=3 ; i++) {
        String str = scn.nextLine();
            ch0.add(str);
        }
        System.out.println(ch0);
    }
}
