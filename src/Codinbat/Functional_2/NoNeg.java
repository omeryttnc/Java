package Codinbat.Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.


noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []

 */
public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
nums.removeIf(t->t>0);

    return nums;
    }


}
