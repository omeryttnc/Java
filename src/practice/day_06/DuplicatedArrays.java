package practice.day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatedArrays {
    public static void main(String[] args) {
        /*
         * Write a code that returns the duplicate numbers in an int array
         * e.g.
         * Output: 12  3  1
         */
         int[] nums={12,3,3,4,5,6,1,2,7,12,14,12,1,1,1};
        Arrays.sort(nums);
        List<Integer> uniqueInteger = new ArrayList<>();
        for(int i = 0 ; i<nums.length-1; i++){
         //   System.out.print(nums[i] + " ");

        if(nums[i]==nums[i+1] && !uniqueInteger.contains(nums[i])){
            uniqueInteger.add(i);
        }

        }
            System.out.print(uniqueInteger);
    }
}
