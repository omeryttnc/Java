package warmup;

import java.util.Scanner;

public class day3_cast_inc_dsc_concat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any character");
        String name = scn.next();
        System.out.println("   " + name + "  " );
        System.out.println(" " + name +"   " + name + " " );
        System.out.println(name + "  " + name + "  " + name);
    }
}
