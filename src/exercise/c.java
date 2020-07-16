package exercise;

public class c {

    // Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
//			For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
//
    public static void main(String[] args) {


        int[][] arr1 = {{1, 2, 3}, {4, 5}, {6, 7}};

      //  int[] arr2 = new int[arr1.length];

            int sum = 0;
        for (int i = 0; i < arr1.length; i++) {

            for (int k = 0; k < arr1[i].length; k++) {
                sum += arr1[i][k];
            }
        }
            System.out.println(sum + " ");
    }
}