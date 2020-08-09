package teamQuestions;

import java.util.ArrayList;
import java.util.List;

/*
Write a method that takes a list of numbers as input.
 It needs to remove all even numbers from list and returns the updated list.
Example: input= [4,5,6,7,8]
output: [5,7]
 */
public class day02 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 8, 2};
        System.out.println(list1(array1));
    }

    public static List<Integer> list1(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }

        return list;
    }
}
