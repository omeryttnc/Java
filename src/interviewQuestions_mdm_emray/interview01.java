package interviewQuestions_mdm_emray;

import java.util.*;

/*
Write a method that takes an array of numbers.
 Return an array of numbers whose count exceeds 2 in the input array.
example: input = {3,4,1,2,3,4,3}
output = {3}
 */
public class interview01 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 4, 1, 2, 3, 4, 3);
        int count = 1;
        Collections.sort(input);
        System.out.println(input);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).equals(input.get(i + 1))) {
                count++;
                hashMap.put(input.get(i), count);
            }
//            else {
//                count = 1;
//            }
//            if (count > 2) {
//                System.out.println(hashMap.get(count));
//            }
        }
        System.out.println(hashMap);
    }
}