package Codinbat.Warmup_2;

import java.util.Arrays;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123_ {


    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            Arrays.binarySearch(nums, 1, 2, 3);

        }
        return true;
    }
}
