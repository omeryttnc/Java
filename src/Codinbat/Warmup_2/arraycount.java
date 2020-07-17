package Codinbat.Warmup_2;
/*
/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class arraycount {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {2, 5, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(arr[0]);
    }

//    public static int arrayCount9(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == '9') {
//                count++;
//            }
//        }
//        return count;
//    }
}
