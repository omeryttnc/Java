package homework.day06;

import java.util.Scanner;

public class homework03 {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a character");
        char  data = scn.next().charAt(0);
      //  System.out.println(data+data);
        if(data>='a' && data<='z'){
            System.out.println("character is alphabet");
        }else{
            System.out.println("it is not alphabet");
        }


    }
}
