package revision.officeHours.day01;

import java.util.Scanner;

public class example02_howmanytea {
    public static void main(String[] args) {
        System.out.println("how many glass do you drink per day");
        Scanner scanner = new Scanner(System.in);
        int glassOfTea = scanner.nextInt();
        System.out.println("how many sugar do you add per glass");
        int sugarPerGlass = scanner.nextInt();
        double yearlyUsega = 365 * sugarPerGlass * glassOfTea * 2.7;
        if (yearlyUsega == 0) {
            System.out.println("you are healthy");
        } else {
            System.out.println("you are using : " + yearlyUsega / 1000);

        }
    }
}
