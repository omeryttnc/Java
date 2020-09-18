package teamQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
Declare a 2 dimensional int array. return the array of largest numbers in each array.
example: input: int[][] arr = { {6,7},{ 1, 2 }, { 3, 4 } };
output: {7,2,4}
 */
public class day03 {
    public static void main(String[] args) {
        int[][] arr = {{6, 7}, {1, 2}, {3, 4}};
        for (int[] ints : arr) {
            int max2 = IntStream.of(ints).max().orElse(0);
            System.out.print(max2);
        }
    }
}

//            System.out.print(Arrays.stream(arr[i]).max());
//            int max = IntStream.of(arr[i]).max()
//                    .orElse(0);
//            System.out.print(max);
