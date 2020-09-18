package Codinbat.Warmup_2;

import java.util.Arrays;
import java.util.Collections;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123_ {


    public static boolean array123(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }
}
