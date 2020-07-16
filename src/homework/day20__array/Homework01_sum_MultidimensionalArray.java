package homework.day20__array;

public class Homework01_sum_MultidimensionalArray {
    public static void main(String[] args) {


        //Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
        int[][] arr = {{1, 2,7, 3,}, {4, 5, 6}};
        int sum = 0;
        int length = arr.length;
        for (int row = 0; row < length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                sum += arr[row][col];

            }
        }
        System.out.println(sum + " total each element sum");

    }
}


