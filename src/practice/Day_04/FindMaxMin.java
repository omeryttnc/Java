package practice.Day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

! * ask user to enter 3 numbers then
! * 1- find the max number
! * 2- find the minimum number
 */
public class FindMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digits");
        List<Integer> l3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            //        l3[i] = scanner.nextInt();
            l3.add(scanner.nextInt());
        }
        Collections.sort(l3);
        System.out.println("minimum number is " + l3.get(0) + " and maximum number is " + l3.get(l3.size()-1));
    }
}
