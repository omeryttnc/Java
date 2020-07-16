package practice.Day_04;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine();
        for(int i = name.length()-1 ; i>= 0 ; i--){
            System.out.print(name.charAt(i));
        }
    }

}
