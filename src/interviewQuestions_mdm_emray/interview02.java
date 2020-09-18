package interviewQuestions_mdm_emray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a method that takes a list of numbers as input.
It needs to remove all even numbers from list and returns the updated list.
Example: input= [4,5,6,7,8]
output: [5,7]
 */
public class interview02 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4,5,6,7,8);
        for (int i = 0; i <input.size() ; i++) {
            if(input.get(i)%2!=0){
                System.out.print(input.get(i)+" ");
            }
        }

    }
}
