package exercise;

public class d {
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
