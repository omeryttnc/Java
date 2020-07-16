package homework.day09_SwitchStatementQuestions;

import java.util.Scanner;

/*
Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
Then type a program by using “switch statement” to print “United” for ‘U’
”States” for ’S’, and “America” for ‘A’
 */
public class homework04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter one of the ‘U’, ’S’, and ‘A’.");
        String answer = scn.next().toLowerCase();

        switch (answer){
            case "u":
                System.out.println("United");
                break;

            case "s":
                System.out.println("States");
                break;

            case "a":
                System.out.println("America");
                break;



        }

    }


}
