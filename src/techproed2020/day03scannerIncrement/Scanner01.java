package techproed2020.day03scannerIncrement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, give me full name");
    String fullName = scn.nextLine();
        System.out.println(fullName);
scn.close();
    }
}
