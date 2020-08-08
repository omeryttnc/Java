package exercise;

import java.util.Scanner;

public class k {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("day");
        String day = input.next();
        String result = day.equalsIgnoreCase("monday") ? "m"
                : day.equalsIgnoreCase("tuesday") ? "teamQuestions"
                : day.equalsIgnoreCase("wednesday") ? "w"
                : day.equalsIgnoreCase("thursday") ? "teamQuestions"
                : day.equalsIgnoreCase("saturday") ? "s"
                : day.equalsIgnoreCase("sunday") ? "s"
                : day.equalsIgnoreCase("friday") ? "f"
                : "nothing";

        System.out.println(result);
        input.close();

    }
}
