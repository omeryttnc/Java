package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions
Output will be “Enter a new password according to the give conditions”
1.First letter must be uppercase
2.Last letter must be lowercase
3.Password must contain 6 characters
 */
public class Homework07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter password");
        String password = scn.next();
        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            if (password.length() == 6) {
                if ((password.charAt(5) >= 'a') && (password.charAt(5) <= 'z')) {
                    System.out.println("Your password is created successfully");

                }
            }

        } else {
            System.out.println("Enter a new password according to the give conditions");
        }

    }
}

/*
Scanner scan = new Scanner(System.in);
		System.out.println("enter a password");
		String password = scan.nextLine();
		int length = password.length();
		char firstLetter = password.charAt(0), lastLetter = password.charAt(length - 1);
		String res = "";
		if (firstLetter >= 'A' && firstLetter <= 'Z' && lastLetter >= 'a' && lastLetter <= 'z' && length == 6) {
			res = "Your password is created successfully.";
		} else {
			System.out.println("Enter a new password according to the give conditions: ");
			if (firstLetter >= 'a' && firstLetter <= 'z')
				res += "First letter must be uppercase\n";
			if (lastLetter >= 'A' && lastLetter <= 'Z')
				res += "Last letter must be lowercase\n";
			if (length != 6)
				res += "Password must contain 6 characters";
		}
		System.out.println(res);
		scan.close();
 */