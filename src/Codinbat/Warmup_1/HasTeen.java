package Codinbat.Warmup_1;

import java.util.Arrays;
import java.util.List;

/*

We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class HasTeen {

    public static boolean hasTeen(int a, int b, int c) {
        List<Integer> array = Arrays.asList(a, b, c);
        for (int j : array) {
            if (j >= 13 && j <= 19) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(153,219,107));
    }
}
