package practice.Day_04;

import java.util.Scanner;

public class FindingPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine();
        StringBuilder name2= new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            name2.append(name.charAt(i));
        }
        if(name.equalsIgnoreCase(String.valueOf(name2))){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }
    }
}
