package practice.Day_04;

import java.util.Scanner;

public class RepeatedChars {
    public static void main(String[] args) {
        /*
        ask user to enter a name and a character, then check
        how many times the character is repeated in the
        name using loops in the name
        e.g:
        char ch1 = 'a';
        String name = "ali ata bak" ==>a = 4
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine();
        System.out.println("enter a character");
        int count = 0;
        char chr1 = scanner.next().charAt(0);

        for (int i = 0 ; i < name.length(); i++){
            if(name.charAt(i)== chr1){
                count ++;
            }
        }
            System.out.println(count);
    }
}
