package techproed2020.day20arraysdt;

import java.util.Arrays;

public class Revision_Array01 {
    public static void main(String[] args) {
        //how to check if a specific element is in the array

        /*
        1) before using binary search otherwise sometimes returns correct but all them
        index
        2) binary search method returns indexs of which you are looking for
        3) if you look for non-existing element in an Array you will get negative result
          meaning - means it is not exist but the issue is it is not getting INDEX
          it uses ELEMENTS order

         */
        int[] arr = {3,2,4,3,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println( Arrays.binarySearch(arr,4));

     //   int[] arrayOne, arrayTwo; //both arrays
     //   int arrayOne[], intOne; //one array one int

        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,0));






    }
}
