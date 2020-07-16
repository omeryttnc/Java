package homework.day11_String_replace_;

import java.util.Scanner;

/*
Ask user ta enter his/her first and last name. If the first name is longer
output will be “First name is longer.” If the length of last name is equal
To the length of last name output will be “First name and last name
have same length.” Otherwise, output will be “Last name is longer”
 */
public class Homework04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an name");
        String name = scn.nextLine();
        System.out.println("enter an surname");
        String surname = scn.nextLine();

     String result =    name.length()>surname.length()? ("First name is longer"):
                (name.length()==surname.length()? ("First name and last name have same length"):
                        ("Last name is longer"));

        System.out.println(result);

    }
}
