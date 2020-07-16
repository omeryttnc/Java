package Codinbat.Array_1;

/*

Given an array of ints length 3, return an array with the elements
"rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int[] myArray = new int[3];
        myArray[0] = nums[1];
        myArray[1] = nums[2];
        myArray[2] = nums[0];


        return myArray;
    }

}


//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        for (int i = array.length - 1; i >= 0 ;i--){
//            System.out.print(array[i]);
//        }
//
//    }

