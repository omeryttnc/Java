package practice.day_03;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first name");
        String name1 = scn.nextLine();
        System.out.println("enter second name");
        String name2 = scn.nextLine();
        int name1Length = name1.length();
        int name2Length = name2.length();
        int name2LengthMiddle = name2Length/2;
        if(name1Length % 2 == 0){
            System.out.println(name2.substring(0,name2LengthMiddle) + name1 + name2.substring(name2LengthMiddle));
                   }else {
            System.out.println("it can not be inserted");
        }
    }
}
