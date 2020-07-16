package homework.day06;

import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any name of the week");


        //first way
        String dayOfWeek = scn.nextLine().toLowerCase();
//   //     if (dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") || dayOfWeek.equals("wednesday")
//                || dayOfWeek.equals("thursday") || dayOfWeek.equals("friday") || dayOfWeek.equals("saturday")
//                || dayOfWeek.equals("sunday")) {
            char secondCh = dayOfWeek.charAt(1);
            char fourthCh = dayOfWeek.charAt(3);
            char sixthCh = dayOfWeek.charAt(5);
            System.out.println("Result: " + secondCh + fourthCh + sixthCh);
//        } else {
//            System.out.println("This is not a day name.");
//        }
        scn.close();

        //second way


        //      String dayName = scn.next();
        //char [] array = dayName.toCharArray();
        //        System.out.println("" + array[1] + array[3] + array[5]);

        // Third way
        //        char char2 = dayname.charAt(1);
        //        char char4 = dayname.charAt(3);
        //        char char6 = dayname.charAt(5);
        //      System.out.println(char2 + "" + char4 + "" + char6);
    }


}