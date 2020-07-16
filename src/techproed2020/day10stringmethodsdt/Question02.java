package techproed2020.day10stringmethodsdt;
/*
1) length() ==> To get the number of characters in a String
		         Returns integer
		 2) equals() ==> To check if two Strings are same or not
		         Returns boolean
		 3) toUpperCase() ==> To convert all characters to upper case in a String
		           Returns String
		 4) toLowerCase() ==> To convert all characters to lower case in a String
		           Returns String
		 5) contains() ==> To check if a specific character exists in a String
		          Returns boolean
		 6) equalsIgnoreCase() ==> To check if two Strings are same with ignoring cases
		              Returns boolean
		 7) charAt() ==> To get a character from String by using index
		         Returns char
 */

// 8) replace() ==> To change a character / characters
//                  Return String (Updated one)


public class Question02 {
    public static void main(String[] args) {

        String str = "Easy, Java is Easy";
       // System.out.println(str.replace('a', 'x'));

        // orginal will be same
     //   System.out.println(str);
        // w ==> a =>z A=> Z 0=>9 _
        // s ==> space
        // d ==> digits

        String str2 = " 2450?><::  asdasd  asdsa   __";
       // System.out.println(str2.replaceAll("a", "k"));
        System.out.println("normal    " + str2);
        System.out.println("w      " + str2.replaceAll("\\w","*"));
        System.out.println("W     " + str2.replaceAll("\\W","*"));

        System.out.println(str2.replaceAll("\\d", "*").replaceAll("\\D","*"));


    }
}
