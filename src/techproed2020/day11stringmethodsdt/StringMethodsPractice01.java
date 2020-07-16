package techproed2020.day11stringmethodsdt;

import java.util.Scanner;

/*
 * 1) Ask user to enter a password which has
 *      a)At least two words with space between them
 *      b)It should have at least 9 characters in total
 *      c)At least one upper case, one lower case, a number, and a special character
 *      d)At the beginning use one space, at the end use double space
 *           Note: For every step use your password
 *           Example for password: " Hey Come1?  "
 */
public class StringMethodsPractice01 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = scn.next();
        //     a)At least two words with space between them
             password.replaceAll("\\s","2");

             }

        //     b)It should have at least 9 characters in total



        //     c)At least one upper case, one lower case, a number, and a special character



        //     d)At the beginning use one space, at the end use double space





        //          Note: For every step use your password
  //          Example for password: " Hey Come1?  "


    }

